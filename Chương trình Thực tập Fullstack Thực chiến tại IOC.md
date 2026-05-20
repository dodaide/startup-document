1. Mục tiêu chương trình
- Đảm bảo thực tập sinh nắm vững và trả lời được toàn bộ bộ câu hỏi phỏng vấn mà IOC cung cấp ngay từ đầu chương trình, thông qua quá trình tự học, ôn luyện lại kiến thức và có thể giải thích sâu kèm ví dụ rút ra trực tiếp từ dự án mình làm.
- Rèn luyện tư duy kỹ sư cốt lõi (First Principles): Tự xây dựng nền tảng component từ con số không thay vì lạm dụng UI thư viện có sẵn hay phụ thuộc vào AI.
- Có thể áp dụng AI agent vào việc phát triển phần mềm.
2. Nguyên tắc cốt lõi
1. Kiểm soát Công cụ và Nền tảng:
  - Frontend: Cho phép sử dụng UI Framework (React, Angular, Vue), Tailwind CSS và các thư viện UI Component (MUI, Ant Design, ShadcnUI...). Tuy nhiên, ít nhất 50% các component cơ sở (base components) phải được sinh viên tự viết lại, override/custom sâu để hiểu bản chất giao diện và kiến trúc CSS. (Lưu ý: Các bạn chuyên sâu Backend có thể giảm tỷ lệ này xuống mức tối thiểu đáp ứng functional).
  - Backend & Database: Cho phép sử dụng ORM (Prisma, Sequelize, TypeORM...) cho các tác vụ CRUD đơn giản (thêm, sửa, xóa cơ bản). Đối với các luồng nghiệp vụ phức tạp, truy vấn thống kê hoặc xử lý dữ liệu liên bảng, bắt buộc sử dụng SQL thuần thông qua Stored Procedures để đảm bảo tối ưu hiệu năng và rèn luyện tư duy Database.
2. Quy trình Agile/Scrum & Phân tích nghiệp vụ: cá nhân/nhóm phải tự đóng vai trò Product Owner và Developer để phân tích bài toán, lập Product Backlog và viết User Story cho dự án của mình. Việc phát triển phải tuân thủ kỷ luật Sprint (chia nhỏ công việc, demo tiến độ).
3. Lộ trình thực tập chi tiết (Dự kiến 3 tháng OJT)
Giai đoạn 1: Ôn luyện kiến thức nền tảng (3 tuần)
- Học tập & trả bài: Ôn luyện theo phạm vi bộ câu hỏi phỏng vấn IOC cung cấp từ đầu chương trình.
- Thực hành theo câu hỏi: Với từng nhóm câu, tự viết code mẫu/triển khai mini đủ để hiểu bản chất, sau đó tự trả lời lại bằng ngôn ngữ của chính mình.
- Tiêu chuẩn đầu ra (Khớp phỏng vấn): Nắm chắc khái niệm cốt lõi, trả lời được trade-off, và giải thích được cách phân tích độ phức tạp/hành vi hệ thống.
Giai đoạn 2: Làm dự án Fullstack End-to-End (2 tháng)
- Khởi tạo Backlog ban đầu (Sprint 0): Phân tích bài toán -> Lập Product Backlog tổng thể (các tính năng ở mức cao, chưa cần chi tiết) -> Ước lượng độ ưu tiên. Backlog là tài liệu sống, được bồi đắp liên tục mỗi tuần khi sinh viên phát hiện thêm yêu cầu hoặc refinement.
- Phát triển theo Sprint (Sprint 1-6): Mỗi Sprint kéo dài 1-2 tuần, quy trình mỗi vòng như sau:
  - Sprint Planning: Chọn task từ Backlog -> Lúc này mới phân tích chi tiết User Story và viết Acceptance Criteria (AC) -> ước lượng công việc.
  - Sprint Execution: Thiết kế ERD bổ sung -> Viết Stored Procedure & ORM -> Backend API -> Frontend UI (Tailwind, UI Lib & 50% Custom).
  - Sprint Review: Demo tính năng cho Mentor, nghiệm thu theo AC đã viết.
  - Backlog Refinement: Cập nhật và bổ sung thêm vào Product Backlog cho các Sprint tiếp theo.
- Tiêu chuẩn đầu ra: Khi được hỏi, sinh viên liên hệ được trực tiếp tới tính năng cụ thể mình đã code và giải thích "vì sao" lựa chọn thiết kế đó.
Giai đoạn 3: Chuẩn bị bảo vệ & phỏng vấn đầu ra (2 tuần)
- Chốt toàn bộ câu trả lời: Tổng hợp lại toàn bộ bộ câu hỏi từ đầu chương trình và hoàn thiện câu trả lời cuối cùng (rõ cấu trúc, có ví dụ từ dự án, nêu được giới hạn/nhược điểm và hướng tối ưu).
- Bảo vệ & Mock Interview: Walkthrough dự án theo từng nhóm câu hỏi; nhận phản hồi và sửa lại các điểm còn thiếu/không chắc.
- Tiêu chuẩn đầu ra (Khớp phỏng vấn): Kết thúc chương trình, sinh viên phải trả lời được hết các câu hỏi IOC đã cung cấp từ đầu, hiểu sâu và lấy ví dụ được qua dự án mình làm.