# Chương trình Thực tập Fullstack Thực chiến tại IOC

## 1. Mục tiêu chương trình
- Đảm bảo thực tập sinh tự tin vượt qua các câu hỏi phỏng vấn thông qua việc trang bị kiến thức và làm dự án.
- Nâng cao tính kỷ luật và độc lập: 100% làm việc cá nhân (Solo project), không làm nhóm để đảm bảo lượng kiến thức tiếp thu bề mặt và bề sâu là tối đa.
- Rèn luyện tư duy kỹ sư cốt lõi (First Principles): Tự xây dựng nền tảng component từ con số không thay vì lạm dụng UI thư viện có sẵn hay phụ thuộc vào AI.

## 2. Nguyên tắc cốt lõi (Bắt buộc tuân thủ)
1. **Phát triển Fullstack Trọn vẹn**: Bất kể định hướng ban đầu là Frontend, mọi sinh viên đều khắt khe phải hoàn thiện một hệ thống Fullstack từ Backend, Database đến thiết kế Frontend.
2. **Làm việc Độc lập**: Tự chịu trách nhiệm cho mọi khâu từ phân tích yêu cầu (Requirement), thiết kế CSDL (ERD), code backend, thao tác DOM frontend, và tự tích hợp.
3. **"No Magic" - Chỉ Dùng Code Thuần**:
   - **Frontend**: Bắt buộc dùng UI Framework (như React, Angular, Vue), nhưng KHÔNG dùng thư viện CSS/UI Component (Bootstrap, Tailwind, MUI, Ant Design...) có sẵn. Sinh viên phải tự build các UI Component (Button, Modal, Table, Dropdown...) dựa trên Framework bằng CSS/SCSS thuần, có kiến trúc mở và khả năng cấu hình Theme linh hoạt (giới thiệu hệ thống Custom Properties/CSS Variables) tương tự như cách hoạt động của Tailwind/MUI.
     *(Lưu ý: Các bạn có định hướng chuyên sâu Backend thì phân hệ Frontend chỉ cần đáp ứng functional, có thể bỏ qua việc xây dựng base chi tiết như trên).*
   - **Backend & Database**: KHÔNG dùng ORM (như Prisma, Hibernate, Entity Framework hay Sequelize). Kiến trúc dữ liệu bắt buộc dùng SQL thuần thông qua các **Stored Procedure** cho mọi thao tác nghiệp vụ phức tạp từ CSDL.
4. **Hạn chế AI can thiệp ở mức độ Sinh code**: KHÔNG dùng AI (ChatGPT, Copilot, Cursor...) để generate code cho sản phẩm. AI chỉ được phép đóng vai trò là Mentor (giải thích concept, giải thích logic, đưa ví dụ nguyên lý cấu trúc dữ liệu, hoặc tìm hiểu lý thuyết để trả bài).
5. **Củng cố Nền tảng (CS Fundamentals)**: Yêu cầu bắt buộc tự thiết kế và code lại nguyên bản một số cấu trúc dữ liệu và thuật toán cơ bản (như Linked List, Hash Map, Binary Tree, các thuật toán tìm kiếm/sắp xếp, thuật toán mã hóa...) và ứng dụng trực tiếp chúng vào xử lý logic nghiệp vụ của dự án thực tế đang làm.

## 3. Lộ trình thực tập chi tiết (Dự kiến 2.5 - 3 tháng OJT)

### Giai đoạn 1: Nền tảng Kỹ thuật phần mềm & Cấu trúc dữ liệu (Tuần 1-2)
- **Học tập & Trả bài**: Ôn tập bộ câu hỏi phỏng vấn cơ sở (`basics/data-structures`, `basics/algorithms`, `basics/oops`).
- **Thực hành (Sát hạch)**: Tự implement các cấu trúc dữ liệu và thuật toán bằng ngôn ngữ lập trình Backend đã chọn (Ví dụ: Java/C#/Python/Golang/Nodejs).
  - Tự implement LinkedList, HashMap, Stack/Queue từ đầu mà không dùng Collection có sẵn của ngôn ngữ.
  - Áp dụng các thuật toán cốt lõi để khởi tạo một module xử lý tệp dữ liệu lớn nội bộ cho dự án IOC giả lập.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Trả lời phỏng vấn trôi chảy bản chất các khái niệm OOP (Đa hình, Kế thừa, Đóng gói, Trừu tượng), Design Patterns và khả năng phân tích độ phức tạp thuật toán (Big O Notation).

### Giai đoạn 2: Thiết kế Hệ thống & Cơ sở dữ liệu thuần (Tuần 3-4)
- **Học tập & Trả bài**: Ôn tập bộ câu hỏi về CSDL (`database/mysql`, `database/sql`...) và Kiến thức Hệ điều hành / Mạng máy tính (`basics/os`, `basics/network`).
- **Thực hành**:
  - Thiết kế Lược đồ Cơ sở dữ liệu (ERD) cho sản phẩm thuộc dự án nền tảng.
  - Viết script thuần xây dựng Structure, Data Types, Constraints, và Indexing tối ưu.
  - Chuyển hóa business logic thành các **Stored Procedure** và Trigger/Function trong SQL. Quán triệt không xây dựng query tính toán trên application layer, mọi hành vi Data-heavy đều gọi Procedure.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Nắm vững các khái niệm ACID, Transaction, Isolation Levels, Table Locks vs Row Locks, Deadlock, hiện tượng N+1 query, và cách Explain Plan tối ưu hóa Database.

### Giai đoạn 3: Phát triển Backend API & Web Services (Tuần 5-7)
- **Học tập & Trả bài**: Ôn tập bộ câu hỏi Backend (`backend/web-services`, `backend/microservice`, hoặc `backend/nodejs`, `backend/csharp` tùy ngôn ngữ).
- **Thực hành**:
  - Xây dựng HTTP Web Server xử lý Request (dùng các thư viện mỏng nhất có thể như ExpressJS đối với Node, hoặc built-in HttpListener của C# để hiểu sâu luồng IO).
  - Khai báo các Controller gọi trực tiếp Stored Procedure từ Data Layer.
  - Tự thiết kế và code luồng Middleware: Xử lý Authentication (JWT validation tay), Authorization (RBAC), Error Handling tập trung.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Hiểu sâu sắc HTTP pipeline, vòng đời request/response, giao thức TCP/IP, cách xây dựng tiêu chuẩn RESTful, và nắm rõ các kỹ thuật bảo mật nền tảng xử lý CORS, chặn SQL Injection, XSS, CSRF...

### Giai đoạn 4: Kiến tạo Frontend & UI Component System (Tuần 8-10)
- **Học tập & Trả bài**: Ôn tập sâu bộ câu hỏi Frontend (`frontend/html`, `frontend/css`, `frontend/javascript`, `frontend/es6`, `frontend/typescript` và `frontend/web-api`).
- **Thực hành (Trọng điểm cho Frontend/Fullstack)**:
  - Tận dụng hệ sinh thái của UI Framework (React/Angular/Vue) kết hợp với CSS/SCSS thuần để dựng Single Page Application (SPA), thiết lập Router.
  - **Xây dựng UI Component Library**: Tự viết các class hỗ trợ sinh ra thẻ UI chuẩn (Button, InputBox, Modal, DataTable, Toaster...) theo hướng Component, có khả năng Reusable.
  - **Hệ thống Theme Customization**: Tự dùng cấu trúc CSS Variables (`:root`) để cung cấp bộ Token màu sắc (Colors, Spacings, Typography). Tạo ra cơ chế đổi giao diện (Dark/Light mode) mượt mà và dễ dàng override (ghi đè) cấu hình - nguyên lý cốt lõi của TailwindCSS, UI Kits.
  - Consume API Backend cung cấp ở GĐ3 bằng `fetch`/`XMLHttpRequest`, tự quản lý state cây DOM khi fetching, loading, và error.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Trả lời cặn kẽ Event Loop, DOM Tree Rendering, rò rỉ bộ nhớ (Memory Leak), Closure, Hoisting, Promises/Async-Await, CSS Flexbox/Grid architecture và cơ chế Specificity.

### Giai đoạn 5: Tích hợp, Tối ưu & Mock Interview Tổng Lực (Tuần 11-12)
- **Học tập & Trả bài**: Ôn tập chéo và chuẩn bị nền tảng triển khai cơ bản (`devops/docker`, kỹ thuật Nginx).
- **Thực hành**:
  - Tích hợp Front-End và Back-End thành một sản phẩm End-to-End.
  - Tự đánh giá và tối ưu hóa hiệu năng phía client (Network caching, minify script tự chế, giảm DOM reflow/repaint) và server (Database connection pool, API response time).
  - Tự Build Docker image và Deploy hệ thống.
- **Đánh giá Cuối kỳ (Mock Interview)**: 
  - Đóng vai ứng viên bị phỏng vấn chéo. Bộ câu hỏi bám rất sát vào kho `fullstack-interviews`. Mentor và hội đồng hỏi xoáy vào từng dòng code sinh viên viết: *"Tại sao dùng thuật toán này?", "Cấu trúc dữ liệu trong module kia lưu trên Heap hay Stack?", "Phân tích độ phức tạp của hàm lọc dữ liệu này", "Cách Store Procedure em viết xử lý locking ra sao nếu có 1000 requests đồng thời?"*.

---
**Tổng kết giá trị lợi ích:**
Chương trình ứng dụng triệt để nền tảng kiến thức phỏng vấn thực chiến, ép sinh viên chạm đến vùng nguyên lý (First Principles) của ngành Kỹ thuật Phần mềm. Khi sống sót qua lộ trình cường độ cao, cấm dùng UI Library có sẵn này, việc trả lời câu hỏi phỏng vấn sẽ trở thành **phản xạ tư duy** tự nhiên, vì họ đã tự tay cài đặt toàn bộ "phép phật" ẩn giấu đằng sau những thư viện công nghiệp, xây đắp một độ sâu kiến thức không thể rỗng.
