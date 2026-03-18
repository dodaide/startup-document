# Phương án Chiến lược: Hệ sinh thái IOC Toàn diện

Giải pháp này nâng cấp IOC V2 thành một nền tảng thực tập thông minh hoàn chỉnh, hợp nhất các phân hệ Học tập, Khảo thí và Quản lý dự án vào một trải nghiệm duy nhất.

---

## 1. Các Trụ cột Phương pháp luận

Hệ thống được vận hành dựa trên 3 triết lý cốt lõi nhằm tối ưu hóa năng lực sinh viên:

### 1.1. Mastery OJT (Đào tạo theo Độ thông thạo)
*   **Cơ chế:** Sinh viên chỉ được chuyển sang các học phần hoặc task dự án phức tạp hơn khi đã chứng minh được độ thông thạo (Mastery) ở các bước trước đó.
*   **Gating Logic:** Hệ thống hỗ trợ thiết lập các "Khóa bảo vệ" linh hoạt (Warning hoặc Lock) dựa trên điểm năng lực thực tế.

### 1.2. Flipped Internship (Thực tập Đảo ngược)
*   **Mô hình:** Tách bạch rõ ràng giữa "Học tập nền tảng" và "Thực chiến dự án". Sinh viên chủ động học lý thuyết và làm bài tập bổ trợ để dành tối đa thời gian Workspace cho việc giải quyết các bài toán thực tế và thảo luận cùng Mentor.

### 1.3. Adaptive OJT (Thực tập Thích ứng)
*   **Cá nhân hóa:** AI phân tích dữ liệu từ mọi hoạt động để tự động điều chỉnh lộ trình, gợi ý tài nguyên học tập và thiết kế kịch bản phỏng vấn "vừa vặn" với năng lực hiện tại của từng cá nhân.

---

## 2. Các Phân hệ Chức năng Hợp nhất

### 2.1. Phân hệ Quản lý Học tập (Learning)
-   **Hành trình học tập:** Tổ chức khóa học theo lộ trình (Course -> Module -> Lesson).
-   **Đa dạng nội dung:** Hỗ trợ Video, tài liệu kỹ thuật và các bài hướng dẫn quy trình.
-   **Theo dõi tiến độ:** Ghi nhận Real-time trạng thái hoàn thành và nỗ lực học tập của sinh viên.

### 2.2. Phân hệ Khảo thí & Luyện tập (Assessment)
-   **Practice Arena (Coding Dojo):** Hệ thống thực hành thuật toán và bài tập lập trình (C, C++, Java, Python, SQL) với cơ chế chấm điểm tự động qua Test Cases.
-   **Hệ thống Quiz:** Đánh giá kiến thức nền tảng qua ngân hàng câu hỏi trắc nghiệm.
-   **AI Interview:** Phỏng vấn giả định dựa trên bối cảnh thực tế của dự án, CV và vị trí công việc mong muốn.

### 2.3. Phân hệ Quản lý Dự án (Project Workspace)
-   **Vận hành thông minh:** Quản lý Sprint, Backlog và Issues.
-   **AI Operator:** Hỗ trợ khởi tạo dự án và hỗ trợ điều phối vận hành thực tập tự động.

### 2.4. Phân hệ Quản trị & Kế thừa Dữ liệu
-   **LMS Data Copy:** Công cụ sao chép toàn bộ khóa học, bài giảng và tài liệu từ hệ thống e-learning cũ sang kho dữ liệu IOC.
-   **Assessment Data Copy:** Cơ chế nhập ngân hàng câu hỏi, bộ đề thi và các tiêu chí đánh giá từ hệ thống khảo thí cũ.

---

## 3. Thiết kế Cơ sở dữ liệu Trọng tâm

Hệ thống sử dụng ma trận dữ liệu tập trung để đồng nhất hóa năng lực sinh viên:

*   **Competency Data:** Quản lý Skill Tree và mức độ thông thạo (Mastery Score) tích lũy từ mọi hoạt động (Học, Thi, Làm task).
*   **Learning Data:** Cấu trúc khóa học và tiến độ hoàn thành.
*   **Assessment Data:** Ngân hàng câu hỏi, các phiên thực hành và kết quả phỏng vấn AI.

---

## 4. Công cụ Chuyển đổi & Kế thừa (Migration Tools)

Để tận dụng tối đa tài nguyên hiện có, IOC cung cấp các công cụ quản trị chuyên biệt:
*   **e-Learning Importer:** Hỗ trợ ánh xạ và sao chép cấu trúc khóa học, video, tài liệu từ LMS cũ.
*   **Question Bank Bridge:** Công cụ nhập liệu hàng loạt câu hỏi trắc nghiệm, bài tập lập trình và đề thi từ hệ thống khảo thí sang định dạng của IOC.

---

## 5. Lộ trình Triển khai (Epics & Timeline)

### 5.1. Các Epic Công nghệ Nền tảng
*   **Epic 1: AI Project Operator & Smart Workspace (Tuần 1-3)**
    *   Xây dựng lõi quản lý dự án và AI hỗ trợ khởi tạo cấu trúc dự án tự động.
    *   Thiết kế trợ lý AI điều phối và theo dõi tiến độ vận hành thực tập.
*   **Epic 2: Unified e-Learning Module (Tuần 4-6)**
    *   Phát triển trình phát nội dung đa phương tiện, quản lý tài liệu hướng dẫn quy trình.
    *   Xây dựng hệ thống tracking nỗ lực và tiến độ học tập.
*   **Epic 3: Mastery Gating & Assessment Engine (Tuần 7-9)**
    *   Triển khai cơ chế Gating (Warning/Lock) dựa trên độ thông thạo.
    *   Tích hợp Quiz và Coding Dojo vào luồng công việc (Task workflow).
*   **Epic 4: Hệ thống Thực hành & Khảo thí - Coding Dojo (Tuần 7-9)**
    *   Xây dựng môi trường thực hành lập trình (C, C++, Java, Python, SQL) với cơ chế chấm Test Case tự động.
    *   Tích hợp Quiz và hệ thống thực hành vào luồng công việc (Task workflow) để thực hiện Mastery Gating (Warning/Lock).
*   **Epic 5: Strategic AI Interviewer (Tuần 10-12)**
    *   Hoàn thiện hệ thống phỏng vấn AI dựa trên Context dự án và hồ sơ năng lực.

### 5.2. Lộ trình Nội dung & Kế thừa
*   **Epic 5: Sample Projects Ecosystem (Song song Tuần 1-4)**
    *   Xây dựng bộ dự án mẫu chuẩn làm khung cho sinh viên thực tập.
*   **Epic 6: Data Migration & Enrichment (Song song Tuần 4-8)**
    *   Sử dụng công cụ Importer để sao chép, chuẩn hóa nội dung e-learning và câu hỏi từ hệ thống cũ.
    *   Xây dựng bổ sung các nội dung còn thiếu.
