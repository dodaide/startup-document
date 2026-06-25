# TÀI LIỆU YÊU CẦU NGHIỆP VỤ (BRD - BUSINESS REQUIREMENTS DOCUMENT)
## Giải Pháp Tích Hợp Hệ Thống Thực Hành Lập Trình & Khảo Thí Live Code Cho Khối Trường Học Trên Nền Tảng IOC

---

## 1. Bối Cảnh & Mục Tiêu Chiến Lược

### 1.1. Bối cảnh thị trường & Nỗi đau của đối tác (Pain Points)
Nhiều trường đại học, cao đẳng và trung tâm đào tạo công nghệ thông tin hiện nay đang đối mặt với các khó khăn lớn:
* **Thiếu hệ thống chuyên dụng**: Không có hệ thống LMS quản lý học liệu kết hợp với môi trường thực hành code tự động chấm điểm giống LeetCode, Codeforces.
* **Quy trình chấm bài thủ công**: Giảng viên phải tải bài làm của sinh viên về máy cá nhân, biên dịch và chạy thử từng bài bằng tay. Quy trình này tốn hàng giờ đồng hồ, dễ sai sót và không thể phản hồi tức thì cho người học.
* **Gian lận thi cử**: Khó kiểm soát việc sinh viên sao chép mã nguồn của nhau khi làm bài thi trực tuyến.

### 1.2. Mục tiêu & Lợi ích dành cho Nhà trường
Việc áp dụng giải pháp này mang lại các giá trị cốt lõi cho nhà trường:
1. **Hiện đại hóa quy trình dạy và học**: Chuyển đổi từ giảng dạy lý thuyết truyền thống sang thực hành tương tác trực quan, giúp sinh viên phản hồi ngay lập tức để tự sửa đổi và tiến bộ nhanh hơn.
2. **Tối ưu hóa nguồn lực giảng dạy**: Tự động hóa khâu chấm điểm thực hành và chấm thi giúp giảm tải đến 90% thời gian chấm bài thủ công cho giảng viên, để thầy cô tập trung hỗ trợ kèm cặp sinh viên yếu hơn.
3. **Nâng cao năng lực và cơ hội việc làm**: Cung cấp môi trường code chuẩn doanh nghiệp, tích lũy điểm năng lực thực tế làm bệ phóng vững chắc cho sinh viên khi tham gia các kỳ thực tập và ứng tuyển việc làm.

---

## 2. Phân Quyền & Vai Trò Người Dùng (User Roles)

Hệ thống hỗ trợ 3 nhóm người dùng chính tại mỗi trường học:

| Vai Trò | Nhiệm Vụ & Quyền Hạn Nghiệp Vụ |
| :--- | :--- |
| **Admin Nhà Trường (School Admin)** | - Cấu hình nhận diện thương hiệu của trường (Logo, Màu sắc chủ đạo, Favicon, Tên trường).<br>- Khởi tạo và quản lý danh sách tài khoản Giảng viên.<br>- Xem báo cáo tổng quan về tình hình dạy và học của toàn trường. |
| **Giảng Viên (Lecturer)** | - Đăng tải học liệu (Slide bài giảng, PDF, link Video bài giảng).<br>- Tạo danh sách bài tập thực hành lập trình và gắn trực tiếp vào các bài học.<br>- Thiết lập và giám sát các ca thi Live Code trực tiếp.<br>- Quản lý điểm số, xem báo cáo chi tiết về phổ điểm của lớp học. |
| **Học Viên (Student)** | - Truy cập học liệu của lớp học theo phân quyền.<br>- Viết code và chạy thử bài tập lập trình trực tiếp trên trình duyệt.<br>- Tham gia các ca thi Live Code và theo dõi bảng xếp hạng thời gian thực. |

---

## 3. Các Phân Hệ Chức Năng Cốt Lõi

### 3.1. Phân hệ Quản lý Học tập cơ bản (LMS Lite)
Cho phép giảng viên tổ chức bài giảng một cách trực quan:
* **Quản trị Nội dung**: Chia bài học theo Chương/Tuần học (Topic-based layout).
* **Đa dạng Tài liệu**: Hỗ trợ đăng tải Slide bài giảng (PDF), tài liệu đọc (Markdown/Text), và nhúng video bài giảng trực tiếp.
* **Quản lý Lớp học**: Giảng viên có thể tạo mã lớp (Class code) để sinh viên chủ động tham gia lớp học.

### 3.2. Phân hệ Thực hành Code (Coding Dojo)
Môi trường thực hành lập trình tương tác cao:
* **Workspace lập trình chuyên nghiệp**: Sử dụng Monaco Editor tích hợp tính năng autocomplete, highlight cú pháp cho nhiều ngôn ngữ (C, C++, Java, Python, JavaScript).
* **Chạy thử & Nộp bài**:
  * **Run Code**: Chạy thử code của học sinh dựa trên các test case mẫu công khai để kiểm tra logic cơ bản.
  * **Submit Code**: Hệ thống nộp bài lên Sandbox chấm điểm tự động toàn bộ test case (gồm cả test case ẩn).
* **Phản hồi tức thì**: Kết quả trả về trực quan (Đúng bài, Sai kết quả, Lỗi thời gian chạy, Lỗi biên dịch...).

### 3.3. Ca Thi Live Code (Live Exam Sessions)
Tổ chức thi cử lập trình tập trung nghiêm ngặt:
* **Thiết lập đề thi**: Giảng viên lựa chọn các câu hỏi thực hành từ ngân hàng câu hỏi để tạo thành một bộ đề thi (ví dụ: Đề thi giữa kỳ gồm 3 bài code từ Dễ đến Khó).
* **Cấu hình ca thi**:
  * Đặt thời gian bắt đầu và kết thúc (ví dụ: Thi từ 08:00 đến 09:30).
  * Kích hoạt cơ chế chống gian lận.
* **Bảng xếp hạng trực tiếp (Real-time Leaderboard)**: Hiển thị thứ hạng của sinh viên dựa trên:
  1. Số lượng bài làm đúng (Accepted).
  2. Tổng thời gian hoàn thành (Penalty Time) - sinh viên làm đúng nhanh hơn sẽ đứng cao hơn.
* **Cơ chế chống gian lận**:
  * **Khóa Copy-Paste**: Học viên bắt buộc phải tự gõ code trong phòng thi, không thể sao chép code từ ngoài vào hoặc copy đề thi ra ngoài.
  * **Giám sát chuyển Tab (Focus Loss Monitor)**: Ghi lại số lần và thời gian học viên rời khỏi tab màn hình làm bài thi để giảng viên đánh giá hành vi bất thường.

### 3.4. Tùy biến Thương hiệu (Custom Branding - White-labeling)
Để nhà trường có cảm giác làm chủ hệ thống riêng biệt:
* **Cấu hình Subdomain**: Ví dụ sinh viên trường Đại học Rikkei truy cập qua địa chỉ `rikkei.internship.rikkei.edu.vn`.
* **Cấu hình Giao diện**: Cho phép tải lên logo, favicon, cấu hình tiêu đề trang và chọn màu sắc chủ đạo của trường (Ví dụ: màu Cam đặc trưng của Rikkeisoft). Khi đó, toàn bộ nút bấm, thanh điều hướng và giao diện học tập sẽ hiển thị tông màu cam đồng nhất.

---

## 4. Báo Cáo & Dashboard Đánh Giá

Nhằm giúp giảng viên và nhà trường dễ dàng theo dõi chất lượng học tập:
1. **Phổ Điểm Lớp Học**: Biểu đồ hình cột hiển thị phân phối điểm số của sinh viên trong một ca thi hoặc trong các bài tập thực hành theo tuần.
2. **Danh Sách Cảnh Báo (At-Risk Students)**: AI tự động phân tích và liệt kê những sinh viên có tỷ lệ nộp bài sai cao, hoặc không tham gia làm bài tập thực hành đầy đủ để giảng viên có kế hoạch hỗ trợ kịp thời.
3. **Thống Kê Tỷ Lệ Đạt/Không Đạt (Pass/Fail Rate)**: Thống kê chi tiết từng câu hỏi trong đề thi để giảng viên biết câu nào học sinh hay sai nhiều nhất, từ đó cải thiện nội dung giảng dạy.

---

## 5. Phác Thảo Giao Diện Người Dùng (Conceptual UX Wireframes)

### 5.1. Bố cục Workspace Thực hành Lập trình (Split Workspace Layout)
Màn hình thực hành được chia làm 2 phần chính giúp tối ưu không gian làm việc:

```
+-----------------------------------------------------------------------------+
| LOGO TRƯỜNG   [Khóa học: Lập trình C]   [Bài: Tìm số lớn nhất]  (User Avatar)|
+-----------------------------------------------------------------------------+
| TAB: Đề bài | Lịch sử nộp bài           | Ngôn ngữ: [ C++ v ]  [Reset Code] |
|-----------------------------------------+-----------------------------------|
|                                         | 1 | #include <iostream>           |
| # Yêu cầu đề bài                        | 2 | using namespace std;          |
| Viết chương trình tìm số lớn nhất       | 3 |                               |
| trong mảng số nguyên gồm N phần tử.     | 4 | int findMax(int arr[], int n) |
|                                         | 5 | {                             |
| ## Ví dụ 1:                             | 6 |     // Viết code tại đây      |
| * Input: arr = [1, 5, 3], n = 3         | 7 |                               |
| * Output: 5                             | 8 | }                             |
|                                         |                               |
| ## Giới hạn:                            |                               |
| * N <= 10^5                             |                               |
| * Giá trị phần tử < 10^9                |                               |
|                                         |                               |
+-----------------------------------------+-----------------------------------|
| CONSOLE PANEL (Bảng chạy thử)                                               |
| Tab: [ Test Cases ]   [ Kết quả chạy thử ]                                  |
| Input: [ 1, 5, 3 ]                                                          |
|                                                  [ Run Code ] [ SUBMIT CODE]|
+-----------------------------------------------------------------------------+
```

### 5.2. Màn hình Phòng thi Live Code (Live Exam Room Layout)
Bao gồm thông tin thời gian làm bài đếm ngược và bảng xếp hạng trực tiếp.

```
+-----------------------------------------------------------------------------+
| LOGO TRƯỜNG  [Ca thi: Giữa kỳ Tin học Đại cương]  Thời gian còn lại: 01:24:05 |
+-----------------------------------------------------------------------------+
| Đề bài thi (3 câu hỏi)                  | BẢNG XẾP HẠNG REAL-TIME           |
|-----------------------------------------|-----------------------------------|
| [Câu 1: Tính tổng mảng]    - Đã làm (OK)| Hạng | Sinh viên    | Điểm | Phạt |
| [Câu 2: Sắp xếp chuỗi]     - Đang làm   |   1  | Nguyễn Văn A | 2/3  | 45m  |
| [Câu 3: Đồ thị cây]        - Chưa làm   |   2  | Trần Thị B   | 2/3  | 60m  |
|                                         |   3  | Lê Văn C     | 1/3  | 20m  |
|                                         |   4  | Phạm Văn D   | 0/3  | 00m  |
|                                         |      |              |      |      |
+-----------------------------------------------------------------------------+
```
