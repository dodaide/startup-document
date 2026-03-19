# Chương trình Thực tập Fullstack Thực chiến tại IOC

## 1. Mục tiêu chương trình
- Đảm bảo thực tập sinh nắm vững và trả lời được toàn bộ bộ câu hỏi phỏng vấn mà IOC cung cấp ngay từ đầu chương trình, thông qua quá trình tự học, ôn luyện lại kiến thức và có thể giải thích sâu kèm ví dụ rút ra trực tiếp từ dự án mình làm.
- Nâng cao tính kỷ luật và độc lập: 100% làm việc cá nhân (Solo project), không làm nhóm để đảm bảo lượng kiến thức tiếp thu bề mặt và bề sâu là tối đa.
- Rèn luyện tư duy kỹ sư cốt lõi (First Principles): Tự xây dựng nền tảng component từ con số không thay vì lạm dụng UI thư viện có sẵn hay phụ thuộc vào AI.

## 2. Nguyên tắc cốt lõi (Bắt buộc tuân thủ)
1. **Phát triển Fullstack Trọn vẹn**: mọi sinh viên đều khắt khe phải hoàn thiện một hệ thống Fullstack từ Backend, Database đến thiết kế Frontend.
2. **Làm việc Độc lập**: Tự chịu trách nhiệm cho mọi khâu từ phân tích yêu cầu (Requirement), thiết kế CSDL (ERD), code backend, thao tác DOM frontend, và tự tích hợp.
3. **"No Magic" - Chỉ Dùng Code Thuần**:
   - **Frontend**: Bắt buộc dùng UI Framework (như React, Angular, Vue), nhưng KHÔNG dùng thư viện CSS/UI Component (Bootstrap, Tailwind, MUI, Ant Design...) có sẵn. Sinh viên phải tự build các UI Component (Button, Modal, Table, Dropdown...) dựa trên Framework bằng CSS/SCSS thuần, có kiến trúc mở và khả năng cấu hình Theme linh hoạt (giới thiệu hệ thống Custom Properties/CSS Variables) tương tự như cách hoạt động của Tailwind/MUI.
     *(Lưu ý: Các bạn có định hướng chuyên sâu Backend thì phân hệ Frontend chỉ cần đáp ứng functional, có thể bỏ qua việc xây dựng base chi tiết như trên).*
   - **Backend & Database**: KHÔNG dùng ORM (như Prisma, Hibernate, Entity Framework hay Sequelize). Kiến trúc dữ liệu bắt buộc dùng SQL thuần thông qua các **Stored Procedure** cho mọi thao tác nghiệp vụ phức tạp từ CSDL.
4. **Hạn chế AI can thiệp ở mức độ Sinh code**: KHÔNG dùng AI (ChatGPT, Copilot, Cursor...) để generate code cho sản phẩm. AI chỉ được phép đóng vai trò hỗ trợ giải thích concept, giải thích logic, đưa ví dụ nguyên lý cấu trúc dữ liệu, hoặc tìm hiểu lý thuyết để trả bài.
5. **Củng cố Nền tảng (CS Fundamentals)**: Yêu cầu bắt buộc tự thiết kế và code lại nguyên bản một số cấu trúc dữ liệu và thuật toán cơ bản (như Linked List, Hash Map, Binary Tree, các thuật toán tìm kiếm/sắp xếp, thuật toán mã hóa...).

## 3. Lộ trình thực tập chi tiết (Dự kiến 3 tháng OJT)

### Giai đoạn 1: Ôn luyện kiến thức nền tảng (3 tuần)
- **Học tập & trả bài**: Ôn luyện theo phạm vi bộ câu hỏi phỏng vấn IOC cung cấp từ đầu chương trình.
- **Thực hành theo câu hỏi**: Với từng nhóm câu, tự viết code mẫu/triển khai mini đủ để hiểu bản chất, sau đó tự trả lời lại bằng ngôn ngữ của chính mình.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Nắm chắc khái niệm cốt lõi, trả lời được trade-off, và giải thích được cách phân tích độ phức tạp/hành vi hệ thống.

### Giai đoạn 2: Làm dự án Fullstack End-to-End (2 tháng)
- **Thiết kế & triển khai dự án**: Từ dự án (dự án có thể giống nhau) -> Phân tích yêu cầu -> ERD -> Stored Procedure/Database thuần -> Backend API -> Frontend UI (SPA, Router, UI Component System) -> tích hợp thành một sản phẩm chạy được.
- **Neo câu trả lời vào dự án**: Mọi phần kiến thức đã ôn ở GĐ1 phải được thể hiện thông qua logic/luồng xử lý/đoạn code cụ thể trong dự án.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Khi được hỏi theo bộ câu hỏi, sinh viên có thể liên hệ trực tiếp tới module/luồng mình đã implement và giải thích “vì sao” lựa chọn thiết kế đó.

### Giai đoạn 3: Chuẩn bị bảo vệ & phỏng vấn đầu ra (2 tuần)
- **Chốt toàn bộ câu trả lời**: Tổng hợp lại toàn bộ bộ câu hỏi từ đầu chương trình và hoàn thiện câu trả lời cuối cùng (rõ cấu trúc, có ví dụ từ dự án, nêu được giới hạn/nhược điểm và hướng tối ưu).
- **Bảo vệ & Mock Interview**: Walkthrough dự án theo từng nhóm câu hỏi; nhận phản hồi và sửa lại các điểm còn thiếu/không chắc.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Kết thúc chương trình, sinh viên phải trả lời được hết các câu hỏi IOC đã cung cấp từ đầu, hiểu sâu và lấy ví dụ được qua dự án mình làm.

---
**Tổng kết giá trị lợi ích:**
Chương trình ứng dụng triệt để nền tảng kiến thức phỏng vấn thực chiến, ép sinh viên chạm đến vùng nguyên lý (First Principles) của ngành Kỹ thuật Phần mềm. Khi sống sót qua lộ trình cường độ cao, cấm dùng UI Library có sẵn này, việc trả lời câu hỏi phỏng vấn sẽ trở thành **phản xạ tư duy** tự nhiên, vì họ đã tự tay cài đặt toàn bộ "phép phật" ẩn giấu đằng sau những thư viện công nghiệp, xây đắp một độ sâu kiến thức không thể rỗng.
