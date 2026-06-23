# BỘ TIÊU CHÍ ĐÁNH GIÁ PHỎNG VẤN FULLSTACK DEVELOPER (TỔNG 600 ĐIỂM)
*(Dành cho Giảng viên / Người phỏng vấn)*

Tài liệu này cung cấp bộ tiêu chí và thang điểm chi tiết với **6 phần đánh giá độc lập**, mỗi phần tối đa **100 điểm** (Tổng điểm tối đa là **600 điểm**) dựa trên bộ câu hỏi [summarize questions minimize.md](file:///d:/Download_new/IOC/startup-document/fullstack-question/summarize%20questions%20minimize.md). Giảng viên có thể sử dụng bộ khung này để chấm điểm ứng viên/học viên một cách trực quan, nhất quán.

---

## 📊 BẢNG PHÂN BỔ ĐIỂM TỔNG QUAN

| Phần | Tiêu chí đánh giá | Điểm tối đa | Nội dung trọng tâm |
| :--- | :--- | :---: | :--- |
| **Phần 1** | **Cơ bản** | **100 Điểm** | Lập trình hướng đối tượng (OOP), Cấu trúc dữ liệu & Giải thuật. |
| **Phần 2** | **Frontend** | **100 Điểm** | HTML/CSS, Javascript/ES6, TypeScript, Web API và React JS. |
| **Phần 3** | **Database** | **100 Điểm** | Khái niệm RDBMS, câu lệnh SQL, tối ưu chỉ mục (Index) và chuẩn hóa dữ liệu. |
| **Phần 4** | **Backend** | **100 Điểm** | Java hoặc C#, Websocket, ảo hóa Docker và Kiến trúc hệ thống (Clean Arch, Microservices). |
| **Phần 5** | **Git** | **100 Điểm** | Các câu lệnh Git thông dụng, Git Flow và cách xử lý Merge Conflict nhóm lớn. |
| **Phần 6** | **Bảo mật cơ bản** | **100 Điểm** | Các lỗ hổng bảo mật Web phổ biến (OWASP Top 10) như XSS, CSRF, SQL Injection, cơ chế CORS và JWT. |
| **Tổng** | **Toàn bộ nội dung** | **600 Điểm** | Đánh giá năng lực Fullstack Developer toàn diện |

---

## 🎯 CHI TIẾT TIÊU CHÍ CHẤM ĐIỂM THEO TỪNG PHẦN (100 ĐIỂM / PHẦN)

### PHẦN 1: CƠ BẢN — Tối đa 100 điểm

#### 1. Hướng đối tượng (OOP) — Tối đa 50 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 20 điểm):**
  * *Câu hỏi áp dụng:* OOP (Câu 1, 10, 11, 12, 15, 16, 27, 28)
  * *Tiêu chí chấm:*
    * **10.0 điểm:** Trình bày được định nghĩa Lớp (Class), Đối tượng (Object), Lớp cha/con.
    * **20.0 điểm:** Giải thích rõ bản chất kèm ví dụ thực tế cho 4 tính chất OOP: Đóng gói (Encapsulation), Đa hình (Polymorphism), Kế thừa (Inheritance), và Trừu tượng (Abstraction).
* **Mức độ Vận dụng (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* OOP (Câu 13, 19, 25, 26, 32)
  * *Tiêu chí chấm:*
    * **7.0 điểm:** Phân biệt chính xác giữa Nạp chồng (Overloading) và Ghi đè (Overriding).
    * **15.0 điểm:** Phân biệt được đa hình thời gian biên dịch (compile-time/static) vs đa hình thời gian chạy (runtime/dynamic). Giải thích constructor và hạn chế của kế thừa.
* **Mức độ Nâng cao (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* OOP (Câu 17, 29, 33, 34, 35, 39)
  * *Tiêu chí chấm:*
    * **7.0 điểm:** Định nghĩa được Interface và Lớp trừu tượng (Abstract class).
    * **15.0 điểm:** So sánh sự khác biệt giữa Lớp trừu tượng và Interface (Đa kế thừa, Access modifiers, Thuộc tính/Phương thức). Giải thích được cơ chế Garbage Collection (Dọn rác bộ nhớ) trong OOP.

#### 2. Cấu trúc dữ liệu & Giải thuật — Tối đa 50 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 20 điểm):**
  * *Câu hỏi áp dụng:* CTDL (Câu 1, 5, 10, 11, 12); Giải thuật (Câu 7, 8, 9)
  * *Tiêu chí chấm:*
    * **10.0 điểm:** Định nghĩa Mảng (Array), LinkedList, Stack, Queue. Phân biệt LIFO (Stack) vs FIFO (Queue).
    * **20.0 điểm:** Giải thích thuật toán Tìm kiếm tuyến tính (Linear Search) vs Tìm kiếm nhị phân (Binary Search). Chỉ ra điều kiện áp dụng Tìm kiếm nhị phân.
* **Mức độ Vận dụng (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* CTDL (Câu 7, 8, 9, 16, 23, 24, 29); Giải thuật (Câu 1, 18, 19, 20)
  * *Tiêu chí chấm:*
    * **7.0 điểm:** Phân tích khi nào chọn Mảng vs LinkedList. Giải thích cơ chế HashMap (Key-Value, Hash function, Collision).
    * **15.0 điểm:** Đánh giá thuật toán thông qua Độ phức tạp Big O. Mô tả nguyên lý hoạt động của các thuật toán sắp xếp (Bubble sort, Merge sort, hoặc Quick sort) và so sánh độ phức tạp của chúng.
* **Mức độ Nâng cao (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* CTDL (Câu 32, 33, 34, 35, 36, 37, 40); Giải thuật (Câu 5, 6, 12, 22)
  * *Tiêu chí chấm:*
    * **7.0 điểm:** Định nghĩa Đồ thị (Graph), so sánh Cây (Tree) vs Đồ thị. Giải thích thuật toán duyệt BFS vs DFS.
    * **15.0 điểm:** Giải thích nguyên lý các mô hình giải thuật: Chia để trị, Quy hoạch động, Thuật toán tham lam, và Thuật toán Dijkstra tìm đường đi ngắn nhất.

---

### PHẦN 2: FRONTEND — Tối đa 100 điểm

#### 1. HTML & CSS — Tối đa 30 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* HTML (Câu 1, 2, 6, 8, 15, 16, 24, 26); CSS (Câu 1, 3, 14, 48)
  * *Tiêu chí chấm:* Giải thích tags/attributes, phân biệt `id` vs `class`, link vs a, `margin` vs `padding`.
* **Mức độ Vận dụng (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* HTML (Câu 20, 23, 25, 27, 28, 29); CSS (Câu 9, 12, 13, 15, 16, 24, 38, 39, 45, 47)
  * *Tiêu chí chấm:* Phân biệt Inline vs Block element. So sánh `display: none` vs `visibility: hidden`. Giải thích Box Model (`box-sizing: border-box`), Flexbox (`align-items` vs `justify-content`), các kiểu CSS Position.
* **Mức độ Nâng cao (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* HTML (Câu 31, 38, 49, 50); CSS (Câu 11, 20, 36, 46, 52)
  * *Tiêu chí chấm:* Giải thích Semantic HTML và SEO. Giải thích cơ chế `z-index` và Stacking Context. Trình bày cách dùng Pseudo elements, CSS Variables và Tweening.

#### 2. Javascript & TypeScript — Tối đa 35 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* JS (Câu 1, 3, 6, 22); TS (Câu 1, 3, 4, 10, 11, 21)
  * *Tiêu chí chấm:* Phân biệt kiểu dữ liệu nguyên thủy vs tham chiếu trong JS. Giải thích toán tử `==` vs `===`. Phân biệt phạm vi `var`, `let`, `const`. Nêu được các kiểu dữ liệu của TS (`any`, `void`, `unknown`, `null`, `undefined`).
* **Mức độ Vận dụng (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* JS (Câu 2, 4, 7, 8, 13, 21, 23); TS (Câu 8, 13, 19, 20, 28, 29, 33, 35, 36, 38)
  * *Tiêu chí chấm:* Giải thích Hoisting, Pass-by-value vs Pass-by-reference. Cú pháp và ứng dụng Arrow function, IIFE, Spread/Rest Operator, Destructuring. Sử dụng TypeScript Interface, Enum, Type Alias, Union, Tuple, và tsconfig.json.
* **Mức độ Nâng cao (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* JS (Câu 10, 14, 15, 16, 31, 33, 36); TS (Câu 5, 24, 25, 27, 34, 40, 48)
  * *Tiêu chí chấm:* Giải thích cơ chế Closure, Prototype Chain và từ khóa `this` (sự khác biệt trong regular vs arrow function). Phân biệt `const` vs `Object.freeze()`. Trình bày cơ chế TS: `unknown` vs `any`, `noImplicitAny`, type inference, `intersection` và conditional types.

#### 3. Web API & React JS — Tối đa 35 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* Web API (Câu 2, 3, 6, 10); React (Câu 1, 6, 10, 11)
  * *Tiêu chí chấm:* Định nghĩa Web API, HTTP Status Codes (2xx, 4xx, 5xx), JSON vs XML. Giải thích JSX, phân biệt State vs Props.
* **Mức độ Vận dụng (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* Web API (Câu 7, 8, 12, 13); React (Câu 4, 5, 7, 9, 15, 17, 18, 30, 34, 36, 41, 45, 46, 47)
  * *Tiêu chí chấm:* So sánh REST API vs SOAP. Giải thích CORS. Phân biệt Class vs Function Component, Controlled vs Uncontrolled. Sử dụng `useState`, `useEffect` (dependency array, cleanup). Giải thích tầm quan trọng của `key` và lý do không update state trực tiếp.
* **Mức độ Nâng cao (Đạt tối đa 10 điểm):**
  * *Câu hỏi áp dụng:* Web API (Câu 13, 14); React (Câu 8, 24, 26, 27, 28, 35, 40, 42, 44, 48)
  * *Tiêu chí chấm:* Xác thực JWT trong hệ thống fullstack (cấu trúc token, cookie vs localStorage, header). Cơ chế hoạt động của Virtual DOM (Diffing/Reconciliation). Tối ưu hiệu năng React (`React.memo`, `useMemo`, `useCallback`), Custom Hooks, và so sánh CSR vs SSR.

---

### PHẦN 3: DATABASE — Tối đa 100 điểm

* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 40 điểm):**
  * *Câu hỏi áp dụng:* CSDL (Câu 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 18, 19, 22, 23, 24)
  * *Tiêu chí chấm:*
    * **20.0 điểm:** Định nghĩa và phân biệt DBMS vs RDBMS. Giải thích rõ ràng vai trò của Khoá chính, Khoá ngoại, ràng buộc UNIQUE và các ràng buộc toàn vẹn dữ liệu khác.
    * **40.0 điểm:** Sử dụng thành thạo câu lệnh SELECT đi kèm các mệnh đề WHERE, GROUP BY, HAVING, ORDER BY. Định nghĩa thực thể, quan hệ (Một - Một, Một - Nhiều, Nhiều - Nhiều).
* **Mức độ Vận dụng (Đạt tối đa 40 điểm):**
  * *Câu hỏi áp dụng:* CSDL (Câu 11, 12, 13, 17, 20, 25, 29, 30, 31, 32, 33, 37, 40)
  * *Tiêu chí chấm:*
    * **20.0 điểm:** Phân biệt chính xác cơ chế hoạt động và kết quả trả về của các kiểu JOIN (Inner, Left, Right, Full, Cross, Self-Join) và phân biệt UNION vs UNION ALL.
    * **40.0 điểm:** Phân biệt bản chất 3 câu lệnh sửa đổi dữ liệu/cấu trúc: `DELETE` (có log, rollback được) vs `TRUNCATE` (xoá nhanh không log) vs `DROP` (xoá bảng và cấu trúc). Trình bày được cách dùng Stored Procedure, View và Subquery.
* **Mức độ Nâng cao (Đạt tối đa 20 điểm):**
  * *Câu hỏi áp dụng:* CSDL (Câu 14, 15/31, 26, 27, 28, 35, 42)
  * *Tiêu chí chấm:*
    * **10.0 điểm:** Giải thích chi tiết nguyên lý ACID của một Transaction. Trình bày được ý nghĩa của Chuẩn hóa cơ sở dữ liệu (từ 1NF đến 3NF) và Khử chuẩn hóa (Denormalization).
    * **20.0 điểm:** Giải thích cách hoạt động của Index (Chỉ mục) giúp tối ưu hóa truy vấn dữ liệu. Chỉ ra được trường hợp thực tế **khi nào không nên tạo Index** (cột có độ chọn lọc thấp, bảng ghi quá nhiều đọc ít, bảng kích thước quá nhỏ). Phân biệt hệ thống OLTP vs OLAP.

---

### PHẦN 4: BACKEND — Tối đa 100 điểm
*(Thí sinh được chọn 1 trong 2 nhánh ngôn ngữ cốt lõi: **Java** hoặc **C#** (50 điểm). Phần WebSocket và Docker & Kiến trúc hệ thống là **bắt buộc** cho cả hai nhánh (50 điểm)).*

#### Nhánh A: Java (Spring Boot) hoặc Nhánh B: C# (.NET Core) — Tối đa 50 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* Java (Câu 1, 2, 3, 4, 11) hoặc C# (Câu 1, 2, 3, 4, 11, 15)
  * *Tiêu chí chấm:* Giải thích điểm khác biệt cốt lõi giữa Java/C# và C/C++. Giải thích JVM/CLR và cơ chế dọn rác tự động Garbage Collector. Trình bày các kiểu dữ liệu và cú pháp khai báo cơ bản.
* **Mức độ Vận dụng (Đạt tối đa 20 điểm):**
  * *Câu hỏi áp dụng:* Java (Câu 5, 6, 8, 12, 13, 14, 18, 20, 21) hoặc C# (Câu 5, 6, 7, 8, 9, 12, 13, 14, 16, 17, 18, 20)
  * *Tiêu chí chấm:* Phân biệt Lớp trừu tượng (Abstract class) vs Interface. Phân biệt các cấu trúc Collections phổ biến (ArrayList vs LinkedList, HashMap vs TreeMap). Giải thích cơ chế truyền tham chiếu/tham trị (`ref`/`out` trong C# hoặc cách Java mô phỏng truyền tham chiếu qua Wrapper Object). Hiểu cơ chế Generic và Boxing/Unboxing (trong C#).
* **Mức độ Nâng cao (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* Spring Boot & DI (Câu 1, 2, 3 và các câu Controller, Transaction, Exception, Security) hoặc C# (DI Câu 1, 10, 19)
  * *Tiêu chí chấm:* Giải thích sâu sắc nguyên lý Dependency Injection (DI), liên hệ chữ **D** trong SOLID và phân biệt các Lifetime Scopes (Transient, Scoped, Singleton). Giải thích cơ chế `@Transactional` (Spring) hoặc quản lý Transaction (.NET), `@ControllerAdvice` xử lý Exception tập trung, Late vs Early binding, cơ chế Reflection và phương pháp phòng chống SQL Injection ở tầng Backend.

#### WebSocket & Docker & Kiến trúc hệ thống (Bắt buộc) — Tối đa 50 điểm
* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* Websocket (Câu 1, 2, 4, 6); Docker (Câu 1, 2, 3)
  * *Tiêu chí chấm:* Định nghĩa WebSocket, so sánh với HTTP truyền thống. Giải thích cơ chế Short Polling, Long Polling và SSE (Server-Sent Events). Phân biệt Docker Image vs Container. Giải thích mục đích của Dockerfile và `docker-compose.yml`.
* **Mức độ Vận dụng (Đạt tối đa 20 điểm):**
  * *Câu hỏi áp dụng:* Websocket (Câu 5, 7, 9); Docker (Câu 4); Kiến trúc (Câu 5, 6)
  * *Tiêu chí chấm:* Giải thích lý do chọn WebSocket thay vì HTTP cho các ứng dụng thời gian thực. Giải thích cơ chế Docker Volume (quản lý lưu trữ dữ liệu bền vững). Phân biệt kiến trúc Monolith và Microservices, chỉ rõ ưu nhược điểm của từng loại.
* **Mức độ Nâng cao (Đạt tối đa 15 điểm):**
  * *Câu hỏi áp dụng:* Kiến trúc (Câu 5b, 7, 8, 9, 10)
  * *Tiêu chí chấm:* So sánh kiến trúc đa tầng truyền thống (N-layer) vs Kiến trúc sạch (Clean/Hexagonal Architecture). Giải thích vai trò của API Gateway và Service Discovery trong Microservices. Giải thích cơ chế Eventual Consistency trong hệ phân tán. Phân biệt Horizontal Scaling (scale ngang) và Vertical Scaling (scale dọc).

---

### PHẦN 5: GIT — Tối đa 100 điểm

* **Mức độ Nhận biết & Thông hiểu (Đạt tối đa 40 điểm):**
  * *Câu hỏi áp dụng:* Git (Câu 1, 2, 3, 4, 5)
  * *Tiêu chí chấm:*
    * **20.0 điểm:** Phân biệt được Git (local tool) vs GitHub (hosting platform). Mô tả các khu vực trong Git (Working Directory, Staging Area, Local/Remote Repository).
    * **40.0 điểm:** Giải thích được luồng Git Flow cơ bản (nhánh `develop` vs `main`/`master`). Phân biệt chính xác lệnh `git pull` (fetch + merge) vs `git fetch`. Trình bày được mục đích của `git checkout` và `git stash`.
* **Mức độ Vận dụng & Nâng cao (Đạt tối đa 60 điểm):**
  * *Câu hỏi áp dụng:* Git (Câu 6)
  * *Tiêu chí chấm:*
    * **30.0 điểm:** Hiểu khái niệm Merge Conflict và cách giải quyết cơ bản.
    * **60.0 điểm:** Trình bày được quy trình xử lý Merge Conflict chuyên nghiệp khi làm việc nhóm lớn (pull code mới từ develop, merge/rebase vào nhánh local, tự resolve conflict local, chạy kiểm thử, sau đó mới đẩy lên Remote Repository và mở Pull Request).

---

### PHẦN 6: BẢO MẬT CƠ BẢN — Tối đa 100 điểm

* **Mức độ Vận dụng & Nâng cao (Đạt tối đa 100 điểm):**
  * *Câu hỏi áp dụng:* Security (Câu 1, 2, 3, 4, 5, 6, 7)
  * *Tiêu chí chấm:*
    * **20.0 điểm (XSS):** Giải thích cơ chế tấn công **XSS (Cross-Site Scripting)** và cách phòng chống (Sanitize input, Escape output, sử dụng Content Security Policy - CSP).
    * **20.0 điểm (CSRF):** Giải thích cơ chế tấn công **CSRF (Cross-Site Request Forgery)** và cách phòng chống (Anti-CSRF Token, SameSite Cookie).
    * **20.0 điểm (SQL Injection):** Giải thích cơ chế tấn công **SQL Injection** và cách phòng chống (Sử dụng Parameterized Query / ORM, tuyệt đối không nối chuỗi truy vấn).
    * **15.0 điểm (CORS):** Định nghĩa **CORS (Cross-Origin Resource Sharing)** và cơ chế hoạt động.
    * **15.0 điểm (JWT & Auth):** Phân biệt Xác thực (**Authentication**) vs Phân quyền (**Authorization**). Trình bày cơ chế JWT (JSON Web Token) và cách lưu trữ JWT an toàn phía client để tránh các đòn tấn công (như HttpOnly cookie).
    * **10.0 điểm (Password Hashing):** Giải thích cơ chế Băm mật khẩu (**Password Hashing**) và tại sao phải sử dụng thêm **Salt** để bảo vệ trước tấn công Rainbow Table.

---

## 📝 PHƯƠNG PHÁP XẾP LOẠI NĂNG LỰC ỨNG VIÊN (TỔNG 600 ĐIỂM)

Dựa trên tổng điểm tích lũy của cả 6 phần trên (tổng điểm tối đa là 600 điểm), giảng viên có thể xếp loại năng lực Fullstack như sau:

* **Từ 0 - 180 điểm: Chưa đạt yêu cầu (Intern/Fresher cần đào tạo lại nhiều)**
  * Điểm trung bình mỗi phần dưới 30 điểm. Thiếu hụt kiến thức cốt lõi về OOP, HTML/CSS/JS. Không thể tự thiết kế database hay xây dựng API đơn giản.
* **Từ 181 - 300 điểm: Đạt mức Cơ bản (Fresher / Intern có thể nhận việc)**
  * Điểm trung bình mỗi phần đạt từ 30 - 50 điểm. Hiểu và trả lời tốt các câu hỏi thông hiểu cơ bản. Lập trình được các chức năng CRUD cơ bản theo luồng có sẵn dưới sự hướng dẫn.
* **Từ 301 - 420 điểm: Đạt mức Khá (Junior Developer)**
  * Điểm trung bình mỗi phần đạt từ 50 - 70 điểm. Giải quyết tốt hầu hết các câu hỏi ở mức Nhận biết và Vận dụng. Có khả năng tự code độc lập các tính năng tiêu chuẩn, biết phối hợp nhóm và nhận thức được bảo mật cơ bản.
* **Từ 421 - 510 điểm: Đạt mức Tốt (Mid-Level Developer)**
  * Điểm trung bình mỗi phần đạt từ 70 - 85 điểm. Trả lời lưu loát toàn bộ phần Nhận biết, Vận dụng và khoảng 50% câu hỏi Nâng cao. Hiểu bản chất tối ưu hóa (Virtual DOM, Index DB), kiến trúc hệ thống (Docker, Microservices) và bảo mật nâng cao.
* **Từ 511 - 600 điểm: Xuất sắc (Senior/Technical Lead)**
  * Điểm trung bình mỗi phần đạt từ 85 - 100 điểm. Làm chủ sâu sắc toàn bộ các khía cạnh từ cơ bản đến nâng cao. Giải thích cặn kẽ bản chất cơ chế runtime, tối ưu hóa sâu kiến trúc DB và thiết kế kiến trúc hệ thống bền vững cùng giải pháp bảo mật toàn diện.
