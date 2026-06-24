# TÀI LIỆU ĐẶC TẢ YÊU CẦU PHẦN MỀM (SRS - SOFTWARE REQUIREMENTS SPECIFICATION)
## Phân Hệ Thực Hành Lập Trình & Khảo Thí Live Code Trực Tuyến Trên Nền Tảng IOC

---

## 1. Kiến Trúc Kỹ Thuật & Luồng Dữ Liệu (System Architecture)

Hệ thống được thiết kế theo mô hình 3 lớp phân rã, giao tiếp bất đồng bộ qua hàng đợi (Queue) để tránh nghẽn luồng xử lý chính:

```
[ Next.js Frontend ] 
         │ (HTTP REST API / Polling)
         ▼
[ NestJS Backend API ] ──(Jobs)──> [ Redis Queue ]
         │                                │
         │ (REST / Batch API)             ▼
         ├────────────────────────> [ Judge0 Sandbox Worker ]
         ▼                                │
[ PostgreSQL DB ] <───────────────────────┘
```

### 1.1. Luồng chạy thử (Run Code - Đồng bộ)
1. Học viên nhấn **Run Code** trên giao diện Next.js.
2. Frontend gửi payload `{ code, languageId }` tới Endpoint `/api/coding-challenges/:id/run`.
3. Backend lấy danh sách test case mẫu của bài toán (`isSample: true`).
4. Backend gửi request đồng bộ tới Judge0 API: `POST /submissions?wait=true` kèm theo giới hạn CPU/RAM.
5. Judge0 thực thi code trong môi trường Linux cô lập (Sandbox), so sánh stdout với expected output và trả về kết quả ngay lập tức.
6. Backend chuyển đổi định dạng và trả về kết quả chạy thử cho Frontend hiển thị.

### 1.2. Luồng nộp bài chấm điểm (Submit Code - Bất đồng bộ)
1. Học viên nhấn **Submit Code**.
2. Frontend gửi yêu cầu tới Endpoint `/api/coding-challenges/:id/submit`.
3. Backend:
   * Tạo bản ghi `CodingSubmission` với trạng thái `PENDING`.
   * Lấy toàn bộ bộ test case (gồm cả test case ẩn).
   * Gửi batch nộp bài bất đồng bộ tới Judge0: `POST /submissions/batch`.
   * Lưu các `token` nhận về từ Judge0 vào bản ghi `CodingSubmission`.
   * Phản hồi nhanh `submissionId` cho Frontend.
4. Frontend kích hoạt cơ chế **Polling (mỗi 1.5 giây)** gửi request tới `/api/coding-submissions/:id/status`.
5. Backend kiểm tra trạng thái các token trên Judge0:
   * Nếu tất cả các test case đã chạy xong -> Tính toán số lượng test case vượt qua, cập nhật thời gian chạy tối đa, bộ nhớ tiêu thụ lớn nhất, và cập nhật trạng thái `ACCEPTED`/`WRONG_ANSWER`... vào cơ sở dữ liệu.
   * Nếu chưa xong -> Phản hồi trạng thái `RUNNING` kèm số lượng test case đã hoàn thành.

---

## 2. Thiết Kế Cơ Sở Dữ Liệu (Database Schema)

Bổ sung các bảng dữ liệu sau vào file `schema.prisma`:

```prisma
// ----------------------------------------------------
// 1. Phân hệ Quản lý Học tập (LMS Lite)
// ----------------------------------------------------

model LmsCourse {
  id           String        @id @default(uuid()) @db.Uuid
  schoolId     String        @db.Uuid
  title        String
  description  String?       @db.Text
  isActive     Boolean       @default(true)
  createdAt    DateTime      @default(now())
  updatedAt    DateTime      @updatedAt

  lessons      LmsLesson[]
  school       School        @relation(fields: [schoolId], references: [id], onDelete: Cascade)

  @@index([schoolId])
}

model LmsLesson {
  id           String          @id @default(uuid()) @db.Uuid
  courseId     String          @db.Uuid
  title        String
  contentType  String          // "VIDEO", "PDF", "SLIDE", "TEXT"
  contentUrl   String?         // Đường dẫn file S3 hoặc link nhúng video
  markdownBody String?         @db.Text
  order        Int             @default(0)
  createdAt    DateTime        @default(now())
  updatedAt    DateTime        @updatedAt

  course       LmsCourse       @relation(fields: [courseId], references: [id], onDelete: Cascade)
  challenges   CodingChallenge[] // Các bài tập lập trình gắn kèm bài học này

  @@index([courseId])
}

// ----------------------------------------------------
// 2. Phân hệ Chấm Code (Online Judge)
// ----------------------------------------------------

enum ChallengeDifficulty {
  EASY
  MEDIUM
  HARD
}

enum SubmissionStatus {
  PENDING
  QUEUED
  RUNNING
  ACCEPTED
  WRONG_ANSWER
  TIME_LIMIT_EXCEEDED
  MEMORY_LIMIT_EXCEEDED
  COMPILE_ERROR
  RUNTIME_ERROR
  INTERNAL_ERROR
}

model CodingChallenge {
  id           String              @id @default(uuid()) @db.Uuid
  lessonId     String?             @db.Uuid
  title        String
  slug         String              @unique
  description  String              @db.Text
  difficulty   ChallengeDifficulty @default(EASY)
  timeLimit    Int                 @default(2000) // ms (tối đa 1 test case)
  memoryLimit  Int                 @default(262144) // KB (256MB)
  isActive     Boolean             @default(true)
  createdAt    DateTime            @default(now())
  updatedAt    DateTime            @updatedAt

  lesson       LmsLesson?          @relation(fields: [lessonId], references: [id], onDelete: SetNull)
  testCases    CodingTestCase[]
  starterCodes CodingChallengeStarterCode[]
  submissions  CodingSubmission[]
  examSessions LiveExamSessionChallenge[]

  @@index([slug])
}

model CodingChallengeStarterCode {
  id           String          @id @default(uuid()) @db.Uuid
  challengeId  String          @db.Uuid
  languageId   Int             // ID ngôn ngữ theo bảng mã Judge0 (ví dụ: 63 = JS, 71 = Python)
  languageName String          // javascript, python, cpp, java
  codeTemplate String          @db.Text // Khung code mẫu ban đầu
  driverCode   String?         @db.Text // Code chạy ngầm nếu cần ghép test case

  challenge    CodingChallenge @relation(fields: [challengeId], references: [id], onDelete: Cascade)

  @@unique([challengeId, languageId])
}

model CodingTestCase {
  id             String          @id @default(uuid()) @db.Uuid
  challengeId    String          @db.Uuid
  input          String          @db.Text
  expectedOutput String          @db.Text
  isSample       Boolean         @default(false) // Hiển thị ở đề bài
  order          Int             @default(0)

  challenge      CodingChallenge @relation(fields: [challengeId], references: [id], onDelete: Cascade)

  @@index([challengeId])
}

model CodingSubmission {
  id           String           @id @default(uuid()) @db.Uuid
  studentId    String           @db.Uuid
  challengeId  String           @db.Uuid
  code         String           @db.Text
  languageId   Int
  status       SubmissionStatus @default(PENDING)
  errorMessage String?          @db.Text
  timeElapsed  Float?           // ms
  memoryUsed   Float?           // KB
  passedCount  Int              @default(0)
  totalCount   Int              @default(0)
  judgeTokens  String[]         // Danh sách token tương ứng của Judge0 để polling
  createdAt    DateTime         @default(now())

  student      Student          @relation(fields: [studentId], references: [id], onDelete: Cascade)
  challenge    CodingChallenge  @relation(fields: [challengeId], references: [id], onDelete: Cascade)

  @@index([studentId])
  @@index([challengeId])
}

// ----------------------------------------------------
// 3. Phân hệ Ca Thi Live Code (Live Exams)
// ----------------------------------------------------

model LiveExamSession {
  id           String                     @id @default(uuid()) @db.Uuid
  schoolId     String                     @db.Uuid
  title        String
  startTime    DateTime
  endTime      DateTime
  duration     Int                        // Số phút làm bài
  isLocked     Boolean                    @default(false) // Khóa copy-paste, rời màn hình
  createdAt    DateTime                   @default(now())
  updatedAt    DateTime                   @updatedAt

  school       School                     @relation(fields: [schoolId], references: [id], onDelete: Cascade)
  challenges   LiveExamSessionChallenge[]
  participants LiveExamParticipant[]
  cheatLogs    LiveExamCheatLog[]

  @@index([schoolId])
}

model LiveExamSessionChallenge {
  id           String          @id @default(uuid()) @db.Uuid
  sessionId    String          @db.Uuid
  challengeId  String          @db.Uuid
  order        Int             @default(0)

  session      LiveExamSession @relation(fields: [sessionId], references: [id], onDelete: Cascade)
  challenge    CodingChallenge @relation(fields: [challengeId], references: [id], onDelete: Cascade)

  @@unique([sessionId, challengeId])
}

model LiveExamParticipant {
  id           String          @id @default(uuid()) @db.Uuid
  sessionId    String          @db.Uuid
  studentId    String          @db.Uuid
  joinedAt     DateTime?
  submittedAt  DateTime?
  score        Float           @default(0)
  penaltyTime  Int             @default(0) // Số phút phạt (dùng cho bảng xếp hạng)

  session      LiveExamSession @relation(fields: [sessionId], references: [id], onDelete: Cascade)
  student      Student         @relation(fields: [studentId], references: [id], onDelete: Cascade)

  @@unique([sessionId, studentId])
}

model LiveExamCheatLog {
  id           String          @id @default(uuid()) @db.Uuid
  sessionId    String          @db.Uuid
  studentId    String          @db.Uuid
  cheatType    String          // "FOCUS_LOST" (Rời tab), "PASTE_DETECTED" (Dán code)
  details      String?         // Mô tả chi tiết (ví dụ: "Rời màn hình 5 giây")
  createdAt    DateTime        @default(now())

  session      LiveExamSession @relation(fields: [sessionId], references: [id], onDelete: Cascade)
  student      Student         @relation(fields: [studentId], references: [id], onDelete: Cascade)

  @@index([sessionId, studentId])
}
```

---

## 3. Đặc Tả API Endpoints chính

### 3.1. Coding Challenges API
* **`POST /api/coding-challenges/:id/run`** (Chạy thử test case mẫu)
  * Request Body:
    ```json
    {
      "code": "function main() { ... }",
      "languageId": 63
    }
    ```
  * Response:
    ```json
    {
      "status": "ACCEPTED",
      "time": 0.05,
      "memory": 12048,
      "stdout": "Hello World\n",
      "expected": "Hello World\n",
      "isMatch": true
    }
    ```

* **`POST /api/coding-challenges/:id/submit`** (Nộp bài chính thức)
  * Request Body: `{ "code": "...", "languageId": 63 }`
  * Response:
    ```json
    {
      "submissionId": "d3b07384-d113-48e0-a7d5-21d7b1cd1e3c",
      "status": "PENDING"
    }
    ```

* **`GET /api/coding-submissions/:id/status`** (Polling kết quả chấm)
  * Response (Chưa hoàn thành):
    ```json
    {
      "id": "d3b07384-d113-48e0-a7d5-21d7b1cd1e3c",
      "status": "RUNNING",
      "passedCount": 4,
      "totalCount": 10
    }
    ```
  * Response (Đã hoàn thành):
    ```json
    {
      "id": "d3b07384-d113-48e0-a7d5-21d7b1cd1e3c",
      "status": "WRONG_ANSWER",
      "passedCount": 8,
      "totalCount": 10,
      "timeElapsed": 120.5,
      "memoryUsed": 24050,
      "errorMessage": null
    }
    ```

---

## 4. Giải Pháp Định Tuyến Subdomain Động (Multi-tenant Branding Routing)

### 4.1. Next.js Middleware (Frontend-2.0)
Tận dụng cơ chế Middleware trong Next.js để trích xuất tên trường học từ Subdomain:
1. Đọc header `host` từ yêu cầu gửi tới.
2. Phân tách subdomain (ví dụ: `fit-hust.internship.rikkei.edu.vn` -> lấy subdomain `fit-hust`).
3. Nếu subdomain hợp lệ (không trùng với `www`, `internship` hay các tên miền hệ thống):
   * Thực hiện rewrite url nội bộ ngầm (Internal rewrite) đến `/school/[schoolSlug]/[path]`.
   * Đọc cấu hình logo và màu sắc của trường học từ API `/api/schools/by-slug/[schoolSlug]` và đưa cấu hình theme này vào CSS variables/Zustand Store để đổi màu giao diện động.

### 4.2. NestJS Interceptor (Backend-2.0)
* Backend cung cấp một `SchoolTenantInterceptor` bắt giữ domain/subdomain từ Header `X-School-Slug` hoặc `Origin`.
* Interceptor tự động truy tìm `schoolId` trong database và gắn vào đối tượng `Request` (ví dụ: `req.schoolId`).
* Các dịch vụ truy vấn dữ liệu (như học liệu, sinh viên) sẽ dựa trên `req.schoolId` để tự động lọc dữ liệu, tránh việc rò rỉ dữ liệu chéo giữa các trường.

---

## 5. Hiện Thực Cơ Chế Chống Gian Lận (Anti-cheat Implementation)

Hệ thống cung cấp cơ chế giám sát kỳ thi thời gian thực bằng JS trên Client:

### 5.1. Khóa sao chép (Copy-Paste Lock)
Trên trình soạn thảo Monaco Editor, Frontend chặn hành vi paste code bằng cách bắt sự kiện trực tiếp:
```typescript
// Ngăn chặn sự kiện Paste trên Editor Container
const handlePaste = (e: ClipboardEvent) => {
  if (isExamLocked) {
    e.preventDefault();
    // Gửi log cảnh báo vi phạm về server
    reportCheat("PASTE_DETECTED", "Hành vi dán mã nguồn bị chặn");
  }
};
```

### 5.2. Theo dõi chuyển Tab (Tab Switching Tracking)
Sử dụng Page Visibility API của HTML5 để theo dõi việc rời màn hình thi:
```typescript
document.addEventListener("visibilitychange", () => {
  if (document.hidden) {
    // Học sinh chuyển tab hoặc thu nhỏ trình duyệt
    const timeOut = Date.now();
    localStorage.setItem("focus_lost_start", timeOut.toString());
  } else {
    // Học sinh quay lại màn hình thi
    const startTimeStr = localStorage.getItem("focus_lost_start");
    if (startTimeStr) {
      const duration = Math.round((Date.now() - parseInt(startTimeStr)) / 1000);
      if (duration > 2) { // Cảnh báo nếu rời tab lâu hơn 2 giây
        reportCheat("FOCUS_LOST", `Rời màn hình thi trong ${duration} giây`);
      }
      localStorage.removeItem("focus_lost_start");
    }
  }
});
```
Thông tin vi phạm sẽ được gửi trực tiếp đến API `/api/live-exams/:id/cheat-log` và cập nhật trực tiếp trên Dashboard giám thị của Giảng viên.
