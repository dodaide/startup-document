# Chương trình Thực tập Fullstack Thực chiến tại IOC

## 1. Mục tiêu chương trình
- **Làm chủ sản phẩm Fullstack Thực tế**: Hoàn thiện một hệ thống từ cơ bản đến nâng cao từ đầu đến cuối, chứng minh năng lực giải quyết bài toán nghiệp vụ thực tế.
- **Tư duy Kỹ sư Giải trình (Engineering Accountability)**: Có khả năng bảo vệ mọi quyết định kỹ thuật (từ kiến trúc, thiết kế CSDL đến bảo mật và hiệu năng) dựa trên nguyên lý gốc.
- **Phản xạ Kiến thức qua Thực chiến**: Nắm chắc kiến thức không phải bằng cách học thuộc, mà bằng cách áp dụng và kiểm chứng trực tiếp các concept đó vào dự án mình xây dựng.

## 2. Nguyên tắc cốt lõi (Bắt buộc tuân thủ)
1. **Phát triển Fullstack Trọn vẹn**: mọi sinh viên đều khắt khe phải hoàn thiện một hệ thống Fullstack từ Backend, Database đến thiết kế Frontend.
2. **Làm việc Độc lập**: Tự chịu trách nhiệm cho mọi khâu từ phân tích yêu cầu (Requirement), thiết kế CSDL (ERD), code backend, thao tác DOM frontend, và tự tích hợp.
3. **"Hybrid Control" - Kiểm soát Công cụ và Nền tảng**:
   - **Frontend**: Cho phép sử dụng UI Framework (React, Angular, Vue), Tailwind CSS và các thư viện UI Component (MUI, Ant Design, ShadcnUI...). Tuy nhiên, **ít nhất 50% các component cơ sở (base components)** phải được sinh viên tự viết lại, override/custom sâu để hiểu bản chất giao diện và kiến trúc CSS.
     *(Lưu ý: Các bạn chuyên sâu Backend có thể giảm tỷ lệ này xuống mức tối thiểu đáp ứng functional).*
   - **Backend & Database**: Cho phép sử dụng **ORM** (Prisma, Sequelize, TypeORM...) cho các tác vụ CRUD đơn giản (thêm, sửa, xóa cơ bản). Đối với các luồng nghiệp vụ phức tạp, truy vấn thống kê hoặc xử lý dữ liệu liên bảng, **bắt buộc sử dụng SQL thuần thông qua Stored Procedures** để đảm bảo tối ưu hiệu năng và rèn luyện tư duy Database.
4. **Quy trình Agile/Scrum & Product Ownership**: Sinh viên đóng vai trò là chủ sở hữu sản phẩm (Product Owner), chịu trách nhiệm từ khâu phân tích bài toán (SRS), lập Backlog đến viết User Story & AC. Việc phát triển phải tuân thủ kỷ luật Sprint chặt chẽ.

## 3. Lộ trình thực tập chi tiết (Dự kiến 3 tháng OJT)

### Giai đoạn 1: Ôn luyện kiến thức nền tảng (3 tuần)
- **Học tập & trả bài**: Ôn luyện theo phạm vi bộ câu hỏi phỏng vấn IOC cung cấp từ đầu chương trình.
- **Thực hành theo câu hỏi**: Với từng nhóm câu, tự viết code mẫu/triển khai mini đủ để hiểu bản chất, sau đó tự trả lời lại bằng ngôn ngữ của chính mình.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Nắm chắc khái niệm cốt lõi, trả lời được trade-off.

### Giai đoạn 2: Làm dự án Fullstack End-to-End (2 tháng)
- **Khởi tạo Backlog ban đầu (Sprint 0)**: Phân tích bài toán -> Lập Product Backlog tổng thể (các tính năng ở mức cao, chưa cần chi tiết) -> Ước lượng độ ưu tiên. Backlog là tài liệu sống, được **bồi đắp liên tục mỗi tuần** khi sinh viên phát hiện thêm yêu cầu hoặc refinement. Xây dựng base back end, front end, database
- **Phát triển theo Sprint (Sprint 1-6)**: Mỗi Sprint kéo dài 1-2 tuần, quy trình mỗi vòng như sau:
    - **Sprint Planning:** Chọn task từ Backlog -> **Lúc này mới phân tích chi tiết User Story và viết Acceptance Criteria (AC)** -> ước lượng công việc.
    - **Sprint Execution:** Thiết kế ERD bổ sung -> Viết Stored Procedure & ORM -> Backend API -> Frontend UI (Tailwind, UI Lib & 50% Custom).
    - **Sprint Review:** Demo tính năng cho Mentor, nghiệm thu theo AC đã viết.
    - **Backlog Refinement:** Cập nhật và bổ sung thêm vào Product Backlog cho các Sprint tiếp theo.
- **Tiêu chuẩn đầu ra**: Khi được hỏi, sinh viên liên hệ được trực tiếp tới tính năng cụ thể mình đã code và giải thích "vì sao" lựa chọn thiết kế đó.

### Giai đoạn 3: Chuẩn bị bảo vệ & phỏng vấn đầu ra (2 tuần)
- **Chốt toàn bộ câu trả lời**: Tổng hợp lại toàn bộ bộ câu hỏi từ đầu chương trình và hoàn thiện câu trả lời cuối cùng (rõ cấu trúc, có ví dụ từ dự án, nêu được giới hạn/nhược điểm và hướng tối ưu).
- **Bảo vệ & Mock Interview**: Walkthrough dự án theo từng nhóm câu hỏi; nhận phản hồi và sửa lại các điểm còn thiếu/không chắc.
- **Tiêu chuẩn đầu ra (Khớp phỏng vấn)**: Kết thúc chương trình, sinh viên phải trả lời được hết các câu hỏi IOC đã cung cấp từ đầu, hiểu sâu và lấy ví dụ được qua dự án mình làm.

---
**Tổng kết giá trị lợi ích:**
Chương trình biến dự án thành "phòng thí nghiệm" để sinh viên tôi luyện kỹ năng. Thay vì học để đi thi, sinh viên xây dựng để làm chủ. Kết thúc chương trình, mỗi cá nhân không chỉ có một bộ câu trả lời phỏng vấn xuất sắc mà quan trọng hơn là một **Portfolio thực chiến**, minh chứng cho khả năng tư duy độc lập, kỹ năng giải quyết vấn đề phức tạp và sự sẵn sàng cho môi trường làm việc chuyên nghiệp (Production-ready).
