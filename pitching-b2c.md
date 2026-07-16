# Tài liệu Pitching Chi tiết IOC 2.0: Lộ trình Thực chiến cho Sinh viên IT

# I. Quá khứ đến hiện tại

## 1. Hiện trạng Hệ thống & Kinh doanh: Từ MVP đến Vận hành Thực tế

### Về Sản phẩm:
Chúng tôi đã triển khai thành công một hệ sinh thái công nghệ lõi tích hợp sâu giữa quản lý đào tạo và trí tuệ nhân tạo:
*   **Hệ thống Quản trị Thực tập (Backoffice):** Quản lý toàn diện vòng đời thực tập từ khâu kết nối Trường học - Doanh nghiệp, thiết lập Đợt thực tập (Phase) đến chia Nhóm thực tập (Group) theo chuyên môn.
*   **Không gian làm việc Số (Digital Workspace):** Tích hợp quy trình chuẩn JIRA (Quản lý Project, Board, Sprint, Task) và Git (GitHub/GitLab) giúp sinh viên làm quen với môi trường chuyên nghiệp.
*   **Trợ lý AI Đa năng (AI Core):**
    *   **AI Code Review:** Tự động phê duyệt Pull Request, phát hiện lỗi bảo mật và gợi ý tối ưu hóa code.
    *   **AI Auto-Generation:** Tự động hóa việc tạo Backlog từ User Story, thiết kế UI/UX sơ bộ và xây dựng danh mục Test Case.
*   **Môi trường Giả lập Stakeholder:** Tính năng Chat với Stakeholder ảo (AI Personas) giúp sinh viên rèn luyện kỹ năng lấy yêu cầu và giao tiếp khách hàng.
*   **Giám sát & Đánh giá 360 độ:** Chấm công GPS, báo cáo hàng ngày (Daily Report) và chấm điểm năng lực (OJT Score) tự động.
*   **Lading page chuẩn SEO**.

### Về Business (Vận hành Thử nghiệm):
Đang được **vận hành thực tế trên một số sinh viên thử nghiệm tại cả Hà Nội và TP. Hồ Chí Minh**. Quá trình vận hành thử nghiệm này giúp chúng tôi:
*   Tiếp súc với sinh viên B2C để hiểu họ hơn.
*   Lập khung chương trình IOC để đáp ứng với sinh viên.
*   Lập quy trình điều phối giữa Mentor và Sinh viên.

---

# II. Hiện tại đến tương lai

## 1. Hệ phương pháp luận Đào tạo Đột phá
Sức mạnh của IOC nằm ở việc ứng dụng các phương pháp giáo dục tiên tiến vào môi trường làm việc:

*   **Mastery Learning (Học tập thông thạo):** Hệ thống thiết lập "khóa bảo vệ". Bạn phải đạt mức thông thạo >80% ở task/kỹ năng hiện tại mới được chạm vào task phức tạp hơn. Điều này đảm bảo nền tảng kiến thức luôn vững chắc.
*   **Flipped Internship (Thực tập đảo ngược):** Chúng tôi tối ưu hóa thời gian thực tế. 80% thời gian là code và giải quyết vấn đề. Lý thuyết được số hóa qua video/tài liệu để bạn tự học ngoài giờ (LMS), dành thời gian tại "công sở ảo" để tương tác chuyên sâu với Mentor.
*   **Adaptive OJT (Thực tập thích ứng):** Dự án không "cứng nhắc". Dựa trên vận tốc làm việc (velocity) của bạn, AI và Mentor sẽ điều chỉnh độ khó của task và kịch bản luyện phỏng vấn "vừa vặn" với năng lực hiện tại của bạn.
*   **Competency-Based Training:** Chúng tôi không đếm số giờ bạn ngồi máy tính. Chúng tôi đo lường sự thành thạo kỹ năng. Bạn có thể hoàn thành sớm nếu giỏi, hoặc được hỗ trợ thêm nếu cần thời gian.

---

## 2. Chi tiết Chương trình Thực tập Fullstack Thực chiến
Chương trình IOC Fullstack Internship được thiết kế để ép sinh viên chạm đến vùng nguyên lý (**First Principles**) của ngành Kỹ thuật Phần mềm, biến kiến thức thực tế thành **phản xạ tư duy**.

### Triết lý học và làm thực chất đến từng dòng Code:
*   **100% Solo Project:** Sinh viên làm việc độc lập hoàn toàn để đảm bảo hiểu sâu mọi khâu từ Backend, Database đến Frontend. Đầu ra sinh viên cần vượt qua vòng phỏng vấn với những câu hỏi được cung cấp ban đầu bằng những kiến thức và dự án trong suốt quá trình thực tập
*   **Frontend "Zero Library":** Sử dụng Framework (React/Angular/Vue) nhưng **không dùng thư viện UI** (Tailwind, MUI, AntD...). Sinh viên tự xây dựng UI Component System bằng CSS/SCSS thuần để hiểu bản chất giao diện.
*   **Database "Raw SQL":** **Không dùng ORM** (Prisma, Sequelize...). Mọi thao tác nghiệp vụ phức tạp đều phải triển khai qua **Stored Procedure** và SQL thuần.
*   **Hạn chế AI Sinh Code:** AI chỉ đóng vai trò giảng viên hỗ trợ giải thích concept, tuyệt đối không dùng để generate code sản phẩm.

### Lộ trình 3 Tháng OJT Chuyên sâu:
1.  **Giai đoạn 1 - Nền tảng (3 tuần):** Tập trung ôn luyện kiến thức cơ bản, các framework 1 cách nhanh chóng.
2.  **Giai đoạn 2 - Thực thi (2 tháng):** Triển khai dự án Fullstack End-to-End. Mọi kiến thức lý thuyết phải được "neo" vào các module code cụ thể trong dự án.
3.  **Giai đoạn 3 - Về đích (2 tuần):** Tổng duyệt bộ câu hỏi phỏng vấn, Mock Interview 1-1 và bảo vệ dự án trước hội đồng chuyên gia.
**Lưu ý**: thời gian trên là không cố định theo từng người theo đúng tư tưởng của Competency-Based Training

---

## 3. Hệ thống Sản phẩm & Gói dịch vụ B2C
Chúng tôi thiết kế các gói dịch vụ dựa trên tư duy **ROI (Tỷ suất lợi vốn)**. 5 triệu đồng cho một kỳ thực tập là số tiền lớn, nhưng nó chỉ bằng một nửa tháng lương đầu tiên của sinh viên khi bắt đầu đi làm.

| Hạng mục | GÓI MIỄN PHÍ (FREE) | GÓI CƠ BẢN (BASIC) | GÓI TIÊU CHUẨN (STANDARD) |
| :--- | :---: | :---: | :---: |
| **Mức phí** | 0đ | 2.500.000đ / khóa | **5.000.000đ / khóa** |
| **Thời gian** | 2 tuần | 3 tháng | 3 tháng |
| **Hình thức** | 100% Online | 100% Online | **Hybrid (Online & Offline)** |
| **Hỗ trợ Mentor** | Tài liệu tự học | Online (01 lần/tháng) | **Weekly Review (1-2 lần/tuần)** |
| **Mock Interview** | Không có | Không có | **02 lần 1:1 với chuyên gia** |
| **Chứng nhận** | Không có | Rikkei Cert | **Rikkei Cert + Hỗ trợ Portfolio** |
| **Chi phí Mentor** | 0đ | ~500.000đ | **~1.500.000đ** |
| **Chi phí CAC** | - | ~600.000đ | **~600.000đ** |
| **OPEX & Khác** | - | ~100.000đ | **~500.000đ** |
| **Tổng CP / Sinh viên** | 0đ | ~1.200.000đ | **~2.600.000đ** |
| **Biên LN Gộp** | - | 52% | **48%** |
| **Chỉ số LTV/CAC** | - | 4.17x | **8.33x** |

*(Lưu ý: Gross Margin và LTV/CAC được duy trì để đảm bảo sức khỏe tài chính và khả năng tái đầu tư vào R&D.)*

---

## 4. Các tính năng bứt phá sẽ được bổ sung trong bản thương mại
Để nâng tầm trải nghiệm và tối ưu hóa hiệu quả đào tạo, IOC 2.0 đang tập trung phát triển các phân hệ then chốt sau:

*   **Hệ thống E-learning tích hợp:** Cho phép quản trị viên và doanh nghiệp chủ động tạo dựng và số hóa các nội dung đào tạo chuyên sâu, giúp sinh viên tự học mọi lúc mọi nơi.
*   **AI Project Operator nâng cao:** 
    *   **AI Tự động tạo dự án:** Trí tuệ nhân tạo tự thiết kế cấu trúc và đề bài dự án sát với thực tế và mong muốn của sinh viên.
    *   **Vận hành Tự động:** Giảm thiểu sự phụ thuộc vào Mentor, giúp hệ thống có khả năng tự vận hành và hỗ trợ sinh viên 24/7.
*   **Hệ thống Khảo thí & Đánh giá Toàn diện:** Tích hợp sâu các bài kiểm tra chuyên môn nhằm có bộ khung năng lực.
*   **Mastery & Adaptive OJT:**
    *   **Khung năng lực chi tiết:** Thiết lập bộ tiêu chuẩn năng lực cụ thể để đánh giá định lượng sự tiến bộ.
    *   **Lộ trình Thích ứng:** AI tự động phân tích năng lực để gợi ý task phù hợp và chia nhỏ kỹ năng sát với trình độ thực tế của từng bạn.
*   **Luồng Trải nghiệm & Đăng ký Tự động:** Sinh viên dễ dàng tiếp cận các gói dịch vụ thông qua luồng trải nghiệm miễn phí (Freemium) và quy trình đăng ký thuận tiện.

---

## 5. Động cơ Tăng trưởng & Lộ trình Phát triển
IOC 2.0 vận hành dựa trên cơ chế **Bánh đà (Flywheel)** tự củng cố, nơi công nghệ và dữ liệu tạo ra lợi thế phòng thủ vững chắc.

### Động cơ Tăng trưởng Tốc lực:
*   **Chiến lược B2B kéo B2C (Scale-Led Growth):** Thông qua việc ký kết MOU với các Khoa CNTT và Trường Đại học để cung cấp nền tảng quản trị thực tập trọn gói. Volume sinh viên lớn từ nhà trường giúp xây dựng uy tín nhanh chóng, tạo hiệu ứng **Truyền miệng (Word-of-Mouth)** mạnh mẽ giúp thu hút sinh viên B2C tự do (Upsell).
*   **KOL-Led Growth (Đánh trúng nỗi đau):** Xây dựng đội ngũ chuyên gia nội bộ (KOLs/Micro-influencers) chia sẻ mindset "kỹ sư thay vì thợ code" trên TikTok, LinkedIn, Facebook. Các nội dung thực chiến này trực tiếp điều hướng tệp sinh viên "Panic Seekers" đến với các gói OJT trả phí.
*   **Phễu trải nghiệm miễn phí:** Cho phép sinh viên trải nghiệm miễn phí 2 tuần để hiểu về IOC. Từ đó upsell lên các gói trả phí.

## 6. Lộ trình
*   **Giai đoạn Q1 - Q2:**
    *   Hoàn thiện sản phẩm và chuẩn bị sẵn sàng cho điểm rơi doanh thu từ tháng 6.
    *   Bắt đầu triển khai kênh tiktok và tham gia cuộc thi.
*   **Giai đoạn Q3 - Q4:**
    *   Đưa tự động hóa bằng AI (AI Operator) lên mức cao nhất để tối ưu chi phí vận hành.
    *   Tập trung vào đẩy mạnh marketing và sale để đạt hơn 1000 sinh viên tham gia chương trình.

---

## 7. Mục tiêu Phát triển Người dùng B2C (2026)
Chúng tôi tập trung vào việc khẳng định giá trị thực của mô hình OJT tại Việt Nam thông qua việc mở rộng cộng đồng sinh viên IT thực chiến.

### Mục tiêu số lượng người dùng B2C:
Trong nửa cuối năm 2026, chúng tôi đặt mục tiêu tiếp cận và phục vụ **240 sinh viên B2C** (Sinh viên tự do), với cơ cấu cụ thể:
*   **Gói Tiêu chuẩn (Standard):** 120 sinh viên (Tập trung vào chất lượng kèm cặp chuyên sâu).
*   **Gói Cơ bản (Basic):** 120 sinh viên (Tối ưu hóa khả năng tự học với sự hỗ trợ từ AI).

### Tầm nhìn tăng trưởng:
Việc tập trung vào tệp khách hàng B2C giúp chúng tôi hoàn thiện bộ khung năng lực và quy trình vận hành tự động. Đây là nền tảng quan trọng để chuẩn hóa hệ thống, tạo tiền đề cho việc mở rộng quy mô mạnh mẽ và dẫn đầu thị trường đào tạo thực hiện vào năm 2027.

---

# III. Thông tin bổ sung: Cuộc thi Khởi nghiệp cùng Kawai
Để khẳng định bản lĩnh và tiềm năng của dự án, IOC 2.0 sẽ chính thức tham gia tranh tài tại **Cuộc thi Khởi nghiệp cùng Kawai** - một trong những cuộc thi hàng đầu về khởi nghiệp vào đầu tháng sau.

Đây không chỉ là một giải đấu, mà là cơ hội để:
*   **Chứng minh giá trị xã hội:** Giải bài toán thiếu hụt kinh nghiệm thực tế của hàng chục ngàn sinh viên IT mỗi năm.
*   **Tiếp cận mạng lưới chuyên gia:** Kết nối với các nhà đầu tư, Mentor hàng đầu trong giới khởi nghiệp để hoàn thiện mô hình kinh doanh.
*   **Tạo đà bùng nổ:** Sự xuất hiện tại một cuộc thi uy tín sẽ là đòn bẩy thương hiệu cực lớn, hỗ trợ trực tiếp cho chiến lược phát triển B2C và mở rộng quan hệ đối tác B2B trong tương lai.
*   **Chiêu mộ những nhân sự tương lai tiềm năng**