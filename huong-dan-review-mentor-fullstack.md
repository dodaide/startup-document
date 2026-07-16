# Hướng dẫn Mentor Review: Fullstack Internship Program

Tài liệu này chuẩn hóa quy trình và nội dung review cho Mentor trong chương trình thực tập Fullstack tại IOC. Mục tiêu là đảm bảo sinh viên không chỉ "làm đúng" mà còn "hiểu sâu" (First Principles) và làm chủ bản chất công nghệ.

---

## 1. Nguyên tắc Review cốt lõi

1.  **Truy vấn nguồn gốc (The "Why"):** Đừng chỉ hỏi "Đoạn code này làm gì?", hãy hỏi "Tại sao em chọn giải pháp này mà không phải cái khác?".
2.  **Hybrid Selection Check:** Kiểm tra kỹ việc phân bổ công cụ: Sinh viên có dùng đúng chỗ (ORM cho đơn giản, SQL cho phức tạp) và đúng tỷ lệ (50% custom UI) không?
3.  **Neo kiến thức vào dự án:** Kiểm tra xem kiến thức lý thuyết đã học ở giai đoạn 1 có được áp dụng thực tế vào code của giai đoạn 2 hay không.

---

## 2. Chi tiết Review theo từng giai đoạn

### Giai đoạn 1: Foundations (Tuần 1 - 3)
**Mục tiêu:** Kiểm tra mức độ chuẩn bị kỹ năng và lý thuyết nền tảng.

| Hoạt động Review | Danh mục kiểm tra (Checklist) | Lưu ý cho Mentor |
| :--- | :--- | :--- |
| **Trả bài Interview** | - Sinh viên trả lời đúng trọng tâm bộ câu hỏi IOC không?<br>- Có khả năng nêu ví dụ thực tế không? Nếu cần có thể live code | Đánh giá theo thang điểm: Nắm vững - Cần ôn lại - Chưa hiểu. |

### Giai đoạn 2: Fullstack Project (Tháng thứ 2 & 3)
**Mục tiêu:** Kiểm soát chất lượng sản phẩm thực tế, tính kỷ luật quy trình Agile và khả năng vận hành Hybrid.

#### Mốc 0: Khởi động & Setup quy trình Scrum (Sprint 0)
- **Checklist:**
    - [ ] **Product Backlog ban đầu:** Sinh viên đã liệt kê các tính năng ở mức cao (Epic/Feature level) chưa? Chưa cần chi tiết.
    - [ ] **Ước lượng & Phân loại:** Có sắp xếp ưu tiên (MoSCoW) cho các tính năng không?
    - [ ] **Hiểu quy trình:** Sinh viên biết rõ quy trình: Backlog -> Planning (chi tiết User Story) -> Execution -> Review -> Refinement?
- **Nghiệm thu:** Sinh viên có Product Backlog khởi đầu và hiểu cách bồi đắp có thê liên tục.

---

### Chu kỳ Review Sprint (Lặp lại mỗi 1-2 tuần)
**Mục tiêu:** Kiểm tra toàn bộ quy trình Scrum và chất lượng sản phẩm End-to-End.

#### A. Sprint Planning Check (Trước khi code)
Mentor xác nhận sinh viên đã phân tích đủ trước khi bắt đầu lập trình (theo template của IOC):
- [ ] **User Story chi tiết:** Các story được chọn vào Sprint đã được viết đủ cấu trúc (As a..., I want..., So that...) chưa, các luồng thế nào?
- [ ] **Acceptance Criteria (AC):** Mỗi story có tiêu chí rõ ràng, có thể nghiệm thu được không?
- [ ] **Backlog Refinement:** Bộ Backlog đã được cập nhật thêm tính năng mới phát hiện trong tuần vừa qua chưa?

#### B. Kiểm tra Kỹ thuật Hybrid (Technical Hybrid Check)
Mentor kiểm tra "độ phủ" nguyên lý trong từng dòng code của Sprint:
- **Database Layer**:
    - [ ] Các bảng mới tạo có ERD chuẩn không? (Nếu phi chuẩn hóa thì lý do có thuyết phục không?)
    - [ ] Các nghiệp vụ phức tạp trong Sprint đã dùng **Stored Procedures** chưa?
    - [ ] ORM chỉ dùng cho CRUD đơn giản?
- **Backend API Layer**:
    - [ ] REST API chuẩn (Status code, Methods, Validation, Error Handling)?
    - [ ] Bảo mật (Hash password, Auth) đã áp dụng cho các module vừa viết chưa?
- **Frontend UI Layer**:
    - [ ] Đã sử dụng Tailwind/UI Lib hiệu quả để tăng tốc độ phát triển chưa?
    - [ ] Quan trọng: Có ít nhất **50% base components** trong Sprint này được tự viết/override sâu không?
    - [ ] Kiến trúc CSS (Variables/Theming) ổn định không?

#### C. Nghiệm thu Sprint (Sprint Sign-off)
- **Definition of Done (DoD):** Tính năng chạy đúng AC + Code sạch + Đạt chuẩn Hybrid + Tích hợp thành công.
- **Next Step:** Chốt backlog và chuẩn bị User Story cho Sprint tiếp theo.

### Giai đoạn 3: Final Defense & Mock Interview (Tuần 12)
**Mục tiêu:** Chốt chặn đầu ra và đánh giá phản xạ tư duy.

- **Nhiệm vụ Mentor:**
    1. **Walkthrough Dự án:** Yêu cầu sinh viên trình bày một module bất kỳ và đặt câu hỏi xoáy vào logic ("Nếu DB tăng lên 1 triệu bản ghi, Stored Proc của em có chạy chậm không?").
    2. **Mock Interview:** Sử dụng bộ câu hỏi phỏng vấn IOC để hỏi ngẫu nhiên.
    3. **Phản hồi:** Nhận xét về thái độ, cách diễn đạt và độ sâu kiến thức.
    4. **Chốt điểm OJT:** Tổng hợp điểm dựa trên toàn bộ quá trình thực tập.

---

## 3. Quy trình sau mỗi buổi Review

1.  **Cập nhật Trạng thái:** Ghi nhận sinh viên đã Pass hay cần Re-review milestone đó.
2.  **Viết Recap:** Tóm tắt các điểm sinh viên làm tốt và các điểm "Red alert" cần sửa.

---
**Ghi chú:** Mentor không bao giờ được code hộ. Nếu sinh viên nghẽn (blocker), hãy đưa ra từ khóa để sinh viên tự tìm kiếm trên Google/LMS.
