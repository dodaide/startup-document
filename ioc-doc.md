**IOC - VER2**

**I. Tổng quan dự án**

1\. **Giới thiệu về sản phẩm của dự án khởi nghiệp**

IOC 2.0 (Internship OneConnect) là một nền tảng edtech được phát triển nhằm tái cấu trúc hoạt động thực tập sinh viên từ một thủ tục mang tính hình thức thành quy trình thực tập thực chiến: dự án thật, mentor thật, đánh giá đầu ra rõ ràng và bằng chứng chất lượng cho nhà trường và sinh viên.

Khác với các mô hình giới thiệu chỗ thực tập truyền thống, IOC 2.0 không giới hạn trong một ngành nghề cụ thể mà được thiết kế như một hạ tầng thực tập dùng chung, có khả năng áp dụng cho nhiều nhóm ngành khác nhau (CNTT, kinh tế, dữ liệu, vận hành, truyền thông, phân tích nghiệp vụ…), miễn là có thể tổ chức công việc theo dự án và đầu ra rõ ràng. **Tuy nhiên, trong năm 2026 IOC vẫn tập trung vào ngành Công nghệ thông tin (CNTT), nơi đội ngũ có thế mạnh và kinh nghiệm sâu.**

IOC 2.0 tập trung vào việc thiết kế – vận hành – đo lường toàn bộ hành trình thực tập của sinh viên, bắt đầu từ giai đoạn đăng ký, đánh giá đầu vào, onboarding, làm việc thực chiến (On-the-job training), cho đến đánh giá đầu ra. Thông qua quá trình này, nền tảng phục vụ trực tiếp **hai nhóm khách hàng chính**:

**Nhà trường**: có bằng chứng đầu ra cụ thể cho hoạt động đào tạo và thực tập (tiến độ, đánh giá mentor, kết quả dự án).

**Sinh viên**: được làm dự án thật, có mentor hướng dẫn và đánh giá, tích lũy kinh nghiệm và portfolio thực tế để ứng tuyển.

Về mô hình vận hành, IOC 2.0 ứng dụng cách tiếp cận con người + AI. Sinh viên làm việc trực tiếp trong các dự án thực tế dưới sự hướng dẫn của mentor, đồng thời được hỗ trợ bởi các AI Agent đóng vai trò như "trợ lý ảo" trong quá trình thực tập: nhắc tiến độ, chia nhỏ task, giải thích yêu cầu công việc và hỗ trợ duy trì tính liên tục của dự án. AI không thay thế mentor, mà giúp giảm tải các tác vụ lặp lại.

IOC 2.0 hướng tới một hệ sinh thái thực tập: nhà trường quản trị được chất lượng đầu ra qua đánh giá và báo cáo, sinh viên chứng minh năng lực thông qua kết quả làm việc thực tế và portfolio dự án thay vì chỉ dựa vào chứng chỉ hay mô tả chủ quan.

2\. **Vấn đề cốt lõi – Chất lượng đầu ra thực tập chưa đáng tin cậy**

2.1 **Nhà trường**

**Vấn đề chính:** Nhà trường thiếu dữ liệu thực tế về quá trình làm việc của sinh viên:

Báo cáo thực tập thường mang tính mô tả, thiếu dữ liệu vận hành

Không có cách chuẩn hóa KPI/OKR quá trình thực tập

Khó chứng minh chất lượng đầu ra với các bên liên quan

**Thách thức đặt sinh viên đi thực tập:** Hiện nay các trường rất khó đưa sinh viên CNTT đi thực tập. Lý do lớn nhất là nhu cầu dành cho intern/fresher của thị trường giảm: đơn vị tuyển dụng ngại nhận sinh viên nền tảng yếu và phải đào tạo lại từ đầu, dẫn đến thiếu chỗ thực tập thực chất cho sinh viên.

2.2 **Sinh viên CNTT**

**Vấn đề chính:** Sinh viên thiếu cách chứng minh được năng lực làm việc thực tế:

Thiếu kinh nghiệm và bằng chứng cụ thể từ dự án thật (không chỉ là chứng chỉ hay bảng điểm)

Họ không có portfolio dự án thật để thuyết phục nhà tuyển dụng

**Thiếu chỗ thực tập và thực tập không đúng chuyên môn:** Sinh viên vừa thiếu cơ hội thực tập (ít chỗ nhận intern/fresher), vừa khi đi thực tập thì thường bị giao những việc không đúng chuyên môn (ví dụ làm việc văn phòng, hỗ trợ hành chính, photo tài liệu…) nên không tích lũy được kinh nghiệm và bằng chứng năng lực thực tế.

3\. **Phân tích Khách hàng & Vấn đề Cốt lõi (Customer & Core Problem Analysis)**

3.1 **BƯỚC 1: XÁC ĐỊNH KHÁCH HÀNG (DEFINE THE CUSTOMER)**

Để thấu hiểu nhu cầu thị trường và tối ưu hóa mô hình kinh doanh, IOC sử dụng cách tiếp cận đa chiều, phân chia rõ ràng giữa khách hàng trả phí trực tiếp và khách hàng tổ chức:

**1. Khách hàng trực tiếp (B2C) - Sinh viên tự do (Freelance Students)**
Đây là nhóm sinh viên chủ động tìm kiếm cơ hội thực tập, không phụ thuộc vào sự sắp xếp của nhà trường.
*   **Đặc điểm:** Tự chủ, có động lực cao để lấp đầy "khoảng trống kinh nghiệm" (experience gap). Sẵn sàng chi trả cho các dịch vụ hỗ trợ sự nghiệp.
*   **Vai trò:** Người dùng cuối (End User) đồng thời là Người trả phí (Payer).

**2. Khách hàng tổ chức (B2B) - Nhà trường (University Partners)**
Đây là nhóm khách hàng then chốt giúp IOC vận hành ổn định.
*   **Đặc điểm:** Các trường Đại học/Cao đẳng cần đảm bảo đầu ra thực tập cho sinh viên hàng loạt.
*   **Vai trò:** Người mua (Buyer) dịch vụ quản lý thực tập và công cụ đánh giá chuẩn đầu ra. Nhà trường trả phí để IOC tổ chức và giám sát thực tập cho sinh viên của họ.

**3. Khách hàng khai thác thêm (B2B2C) - Sinh viên từ đối tác trường**
Đây là nhóm sinh viên được nhà trường gửi sang (nằm trong gói B2B cơ bản).
*   **Đặc điểm:** Ban đầu sử dụng dịch vụ nền tảng do trường tài trợ (Base Tier).
*   **Chiến lược Up-sell:** IOC khai thác nhu cầu nâng cao của nhóm này để chuyển đổi họ thành khách hàng trả phí cá nhân.

---

3.2 **BƯỚC 2: ĐỊNH NGHĨA CÔNG VIỆC CẦN LÀM (DEFINE THE JOB-TO-BE-DONE)**

Xác định **Công việc chức năng cốt lõi (Core Functional Job)** cho từng nhóm đối tượng:

**a. Đối với Sinh viên (B2C & B2B2C)**
> **"Tích lũy kinh nghiệm làm việc thực tế để có được việc làm mong muốn."**

*   *Sự khác biệt ngữ cảnh:*
    *   **Nhóm B2C:** Áp lực rất lớn là "phải có việc làm" để tồn tại trong ngành. Họ cần *lợi thế cạnh tranh*.
    *   **Nhóm B2B2C:** Nhiệm vụ ban đầu là "hoàn thành kỳ thực tập" (để ra trường). Tuy nhiên, IOC sẽ kích hoạt nhu cầu tiềm ẩn của họ: biến kỳ thực tập bắt buộc thành bàn đạp sự nghiệp (Up-sell point).

**b. Đối với Nhà trường (B2B)**
> **"Đảm bảo và minh chứng chất lượng đào tạo thực tiễn với xã hội."**

*   *Phân tích:* Điểm đau của nhà trường không chỉ là "tìm chỗ thực tập" mà là "kiểm soát chất lượng". Họ thuê IOC để giải quyết nỗi lo về việc sinh viên đi thực tập nhưng không học được gì hoặc bị doanh nghiệp phàn nàn.

**c. Các công việc cảm xúc & xã hội (Emotional & Social Jobs)**

*   **Đối với Sinh viên (B2C & B2B2C):**
    *   *Công việc cảm xúc:* Muốn cảm thấy **"tự tin"** vào năng lực bản thân, xóa bỏ nỗi sợ bị đào thải (Layoff anxiety).
    *   *Công việc xã hội:* Muốn được nhà tuyển dụng và bạn bè nhìn nhận là ứng viên **"có kinh nghiệm"** và năng lực thực chiến (Seniority potential).

*   **Đối với Nhà trường (B2B):**
    *   *Công việc cảm xúc:* Muốn cảm thấy **"an tâm"** (Safety) về uy tín đào tạo khi đưa sinh viên ra doanh nghiệp.
    *   *Công việc xã hội:* Muốn giữ vững **"thương hiệu"** tuyển sinh hàng đầu trong mắt phụ huynh và xã hội.

---

3.3 **BƯỚC 3: BẢN ĐỒ CÔNG VIỆC CHI TIẾT & KẾT QUẢ MONG MUỐN (DETAILED JOB MAPS & DESIRED OUTCOMES)**

Để thiết kế giải pháp chính xác cho từng đối tượng, IOC xây dựng 3 Bản đồ công việc riêng biệt. Mỗi bản đồ đi kèm với các **Desired Outcomes** (Kết quả mong muốn) cụ thể được dùng làm KPI đo lường sự thành công của sản phẩm.

### 3.3.1 BẢN ĐỒ CÔNG VIỆC NHÓM B2C - SINH VIÊN TỰ DO (THE "HUNTER" JOURNEY)
*Tâm thế: Chủ động, Cạnh tranh, Sợ thất nghiệp. Mục tiêu: Tìm được việc & Tồn tại.*

**1. Define (Xác định hướng đi)**
*Sinh viên tự đánh giá năng lực và xác định niche thị trường.*
*   1.  Giảm thiểu thời gian tự đánh giá năng lực (Self-audit time).
*   2.  Tăng độ chính xác khi xác định khoảng trống kỹ năng (Skill gap accuracy).
*   3.  Giảm thiểu rủi ro chọn sai công nghệ đang thoái trào (Tech trend risk).
*   4.  Tăng sự tự tin khi đặt mục tiêu mức lương khởi điểm.
*   5.  Giảm sự mơ hồ về yêu cầu của thị trường đối với Fresher.
*   6.  Tăng khả năng nhận diện các "ngách" thị trường ít cạnh tranh.

**2. Locate (Tìm kiếm cơ hội)**
*Sinh viên chủ động săn tìm các thông tin tuyển dụng.*
*   7.  Giảm thiểu thời gian sàng lọc tin tuyển dụng rác/spam.
*   8.  Tăng tỷ lệ phát hiện các cơ hội thực tập có lương (Paid internship).
*   9.  Giảm thiểu rủi ro gặp phải các công ty đa cấp/lừa đảo (Scam risk).
*   10. Tăng khả năng tiếp cận các dự án sử dụng Tech stack hiện đại.
*   11. Giảm thời gian tìm kiếm profile/review về người hướng dẫn (Mentor).
*   12. Tăng số lượng cơ hội việc làm Remote/Hybrid phù hợp.

**3. Prepare (Chuẩn bị ứng tuyển)**
*Sinh viên "luyện công" để vượt qua vòng hồ sơ và phỏng vấn.*
*   13. Giảm thiểu thời gian chuẩn bị CV/Portfolio cho từng vị trí (Tailoring time).
*   14. Tăng tỷ lệ vượt qua vòng lọc hồ sơ tự động (ATS Pass rate).
*   15. Giảm "nỗi sợ phỏng vấn kỹ thuật" (Coding interview anxiety).
*   16. Tăng tốc độ ôn tập các kiến thức nền tảng (Knowledge refresh speed).
*   17. Giảm thiểu thời gian setup môi trường dev (IDE, Github) để làm bài test.
*   18. Tăng sự sẵn sàng về tâm lý và tác phong chuyên nghiệp.

**4. Confirm (Chốt deal)**
*Sinh viên đàm phám và cam kết với đơn vị thực tập.*
*   19. Giảm sự mơ hồ về phạm vi công việc thực tế (Scope ambiguity).
*   20. Tăng độ rõ ràng về lộ trình thăng tiến lên chính thức (Conversion path).
*   21. Giảm thiểu rủi ro bị giao việc sai chuyên môn (Admin/Photocopy risks).
*   22. Tăng khả năng đàm phán thành công mức trợ cấp mong muốn.
*   23. Giảm thời gian chờ đợi phản hồi kết quả (Waiting time).
*   24. Tăng sự minh bạch trong hợp đồng/thỏa thuận thực tập.

**5. Execute (Thực chiến)**
*Sinh viên làm việc để chứng minh giá trị (Survival mode).*
*   25. Giảm thiểu thời gian "chết" (Blocked time) khi gặp bug khó.
*   26. Tăng tốc độ hòa nhập với quy trình Agile/Scrum của team.
*   27. Giảm số lượng lỗi Re-open (Bug rate) sau khi fix.
*   28. Tăng chất lượng code theo chuẩn (Clean code compliance).
*   29. Giảm sự phụ thuộc thụ động vào Mentor (Passive dependency).
*   30. Tăng khả năng xử lý xung đột khi làm việc nhóm (Conflict resolution).

**6. Monitor (Tự soi chiếu)**
*Sinh viên tự theo dõi sự tiến bộ so với đồng nghiệp/thị trường.*
*   31. Giảm độ trễ khi nhận feedback từ Mentor (Feedback latency).
*   32. Tăng độ chính xác khi tự đánh giá hiệu suất bản thân (Self-performance).
*   33. Giảm sự lo lắng về việc "không biết mình đang đứng ở đâu".
*   34. Tăng khả năng theo dõi sự thay đổi của các chỉ số năng lực kỹ thuật.
*   35. Giảm thời gian tổng hợp báo cáo công việc hàng ngày (Daily report time).

**7. Modify (Thích nghi & Sửa lỗi)**
*Sinh viên tự học và điều chỉnh để không bị đào thải.*
*   36. Giảm thời gian tìm nguyên nhân gốc rễ của vấn đề (Root cause ID).
*   37. Tăng tốc độ học công nghệ mới (Learning curve) khi dự án yêu cầu.
*   38. Giảm số lượng lỗi lặp lại (Recurring mistakes) đã được nhắc nhở.
*   39. Tăng hiệu quả của việc tái cấu trúc mã nguồn (Refactoring).
*   40. Giảm sự kháng cự tâm lý khi phải thay đổi cách làm việc cũ.

**8. Conclude (Về đích)**
*Sinh viên dùng kết quả để xin việc chính thức.*
*   41. Tăng số lượng dự án đã xác thực (Verified Projects) trong Portfolio.
*   42. Tăng tỷ lệ nhận được Thư giới thiệu (Reference Letter) chất lượng.
*   43. Giảm thời gian thất nghiệp sau khi kết thúc thực tập (Job search gap).
*   44. Tăng xác suất nhận Offer chính thức từ chính nơi thực tập (Return offer).
*   45. Tăng sự tự tin khi đàm phán lương cho vị trí Junior.
*   46. Giảm sự hoài nghi của nhà tuyển dụng về "kinh nghiệm thực tập".

---

### 3.3.2 BẢN ĐỒ CÔNG VIỆC NHÓM B2B - SINH VIÊN TỪ TRƯỜNG (THE "ASSIGNED" JOURNEY)
*Tâm thế: Tuân thủ, Hoàn thành nghĩa vụ -> Chuyển đổi. Mục tiêu: Trả môn & Nâng cấp.*

**1. Define (Tiếp nhận yêu cầu)**
*Sinh viên nhận thông tin về kỳ thực tập bắt buộc từ nhà trường.*
*   1.  Giảm sự mơ hồ về yêu cầu đầu ra của nhà trường (Grading criteria).
*   2.  Tăng sự hiểu biết về quyền lợi của gói thực tập cơ bản (Base tier).
*   3.  Giảm thời gian đăng ký nguyện vọng vào hệ thống.
*   4.  Tăng nhận thức về tầm quan trọng của thực tập (giảm tư duy "trả nợ môn").
*   5.  Giảm sự lo lắng về việc không đủ điều kiện đi thực tập.

**2. Match (Được phân bổ)**
*Sinh viên chờ hệ thống/nhà trường xếp vào dự án.*
*   6.  Tăng mức độ tin cậy vào sự sắp xếp của hệ thống (Trust in matching).
*   7.  Giảm cảm giác bị phân công vào dự án kém chất lượng (FOMO).
*   8.  Tăng sự phù hợp giữa kỹ năng hiện có và dự án được giao.
*   9.  Giảm thời gian chờ đợi để biết kết quả phân nhóm (Assignment latency).
*   10. Tăng sự hào hứng với đề tài dự án được giao.

**3. Prepare (Nhập môn)**
*Sinh viên tham gia Onboarding bắt buộc của IOC.*
*   11. Giảm thiểu các lỗi sai do không nắm rõ quy chế (Compliance errors).
*   12. Tăng tốc độ hoàn thành các khóa học nền tảng bắt buộc (Pre-training).
*   13. Giảm thời gian làm quen với công cụ quản lý của IOC.
*   14. Tăng sự tự tin (nhóm Risk Averse) nhờ quy trình cầm tay chỉ việc.
*   15. Giảm tỷ lệ bỏ cuộc ngay tuần đầu tiên (Drop-out rate).

**4. Confirm (Cam kết)**
*Sinh viên xác nhận tham gia và cam kết kỷ luật.*
*   16. Giảm thời gian xử lý thủ tục giấy tờ hành chính (Paperwork time).
*   17. Tăng sự rõ ràng về các hình thức kỷ luật nếu vi phạm.
*   18. Tăng mức độ cam kết tuân thủ tiến độ (Commitment level).
*   19. Giảm sự hiểu lầm về vai trò của Mentor (Mentor vs Teacher).
*   20. Tăng khả năng tiếp cận các gói hỗ trợ nâng cao (Up-sell awareness).

**5. Execute (Làm bài/Làm việc)**
*Sinh viên thực hiện task để đạt điểm số.*
*   21. Tăng tỷ lệ tham gia đầy đủ các buổi họp/check-in (Attendance rate).
*   22. Giảm số lượng task bị trễ hạn (Overdue tasks).
*   23. Tăng sự tương tác với AI Assistant để giải quyết vấn đề cơ bản.
*   24. Giảm tải áp lực hỏi các câu hỏi ngớ ngẩn cho Mentor.
*   25. Tăng khả năng hoàn thành các đầu việc cơ bản đúng hướng dẫn.
*   26. Giảm xung đột nội bộ trong nhóm sinh viên thực tập.

**6. Monitor (Báo cáo)**
*Sinh viên ghi nhật ký công việc (Logwork) để trường theo dõi.*
*   27. Giảm thời gian viết logwork hàng ngày.
*   28. Tăng độ chính xác và trung thực của dữ liệu báo cáo.
*   29. Giảm rủi ro bị đánh trượt do thiếu báo cáo tiến độ.
*   30. Tăng khả năng nhận diện sớm trát rủi ro trượt môn.
*   31. Giảm sự khó chịu khi phải thực hiện các thủ tục báo cáo hành chính.

**7. Modify (Sửa sai)**
*Sinh viên chỉnh sửa theo yêu cầu để đạt chuẩn đầu ra.*
*   32. Tăng tốc độ phản hồi các yêu cầu chỉnh sửa từ Mentor/GV.
*   33. Giảm số lần phải làm lại báo cáo thực tập (Re-submission).
*   34. Tăng khả năng tự sửa lỗi nhờ gợi ý của AI.
*   35. Giảm cảm giác tiêu cực khi bị nhận xét/chê trách.

**8. Conclude & Upgrade (Chuyển đổi)**
*Sinh viên nộp kết quả và quyết định nâng cấp (Moment of Truth).*
*   36. Tăng sự hài lòng với điểm số cuối kỳ (Fairness satisfaction).
*   37. Giảm thời gian hoàn thiện khóa luận/báo cáo tốt nghiệp.
*   38. **Tăng tỷ lệ chuyển đổi sang gói Premium (Conversion rate)** để lấy chứng chỉ Verified.
*   39. Tăng mong muốn được giới thiệu việc làm thông qua IOC.
*   40. Tăng khả năng quay lại sử dụng IOC cho các nhu cầu học tập tiếp theo.
*   41. Tăng tỷ lệ giới thiệu bạn bè sử dụng (NPS).

---

### 3.3.3 BẢN ĐỒ CÔNG VIỆC NHÀ TRƯỜNG - ĐỐI TÁC B2B (THE "ADMINISTRATOR" JOURNEY)
*Mục tiêu: Quản lý chất lượng, Giảm tải hành chính, Bảo vệ uy tín.*

**1. Define (Thiết lập tiêu chuẩn)**
*Nhà trường xác định chuẩn đầu ra và KPI cho kỳ thực tập.*
*   1.  Giảm thời gian thống nhất khung chương trình với doanh nghiệp.
*   2.  Tăng độ phủ của tiêu chuẩn đào tạo với nhu cầu thực tế thị trường.
*   3.  Giảm sự mâu thuẫn giữa tiêu chí học thuật và tiêu chí doanh nghiệp.
*   4.  Tăng khả năng tùy biến tiêu chuẩn đánh giá theo từng mã ngành.
*   5.  Giảm rủi ro thiết lập các KPI bất khả thi cho sinh viên.
*   6.  Tăng sự đồng thuận của hội đồng khoa học về phương pháp mới.

**2. Partner/Locate (Kết nối đối tác)**
*Nhà trường tìm kiếm chỗ thực tập cho hàng ngàn sinh viên.*
*   7.  Giảm áp lực phải tự đi xin xỏ từng doanh nghiệp nhận sinh viên.
*   8.  Tăng số lượng "High-quality spots" (chỗ thực tập chất lượng) trong network.
*   9.  Giảm rủi ro hợp tác với các doanh nghiệp "ma" hoặc kém uy tín.
*   10. Tăng vị thế thương lượng của nhà trường với đối tác doanh nghiệp.
*   11. Giảm thời gian ký kết và hoàn tất thủ tục pháp lý hợp tác (MOU/MOA).
*   12. Tăng sự đa dạng của các lĩnh vực thực tập cho sinh viên lựa chọn.

**3. Prepare (Sàng lọc & Chuẩn bị)**
*Nhà trường bàn giao danh sách và chuẩn bị tâm thế cho sinh viên.*
*   13. Giảm tỷ lệ sinh viên bị doanh nghiệp từ chối sau vòng phỏng vấn sơ loại.
*   14. Tăng độ chính xác của dữ liệu sinh viên bàn giao (Skill profile).
*   15. Giảm thời gian tổ chức các buổi định hướng (Orientation) thủ công.
*   16. Tăng tỷ lệ sinh viên nắm rõ quy chế trước khi đi thực tập.
*   17. Giảm khối lượng công việc hành chính cho giáo vụ khoa.

**4. Allocate (Phân bổ)**
*Nhà trường/Hệ thống phân phối sinh viên về các dự án.*
*   18. Giảm thời gian matching (khớp nối) hàng ngàn sinh viên vào dự án.
*   19. Tăng độ khớp (Matching score) giữa năng lực sinh viên và yêu cầu dự án.
*   20. Giảm số lượng khiếu nại của sinh viên về nơi thực tập.
*   21. Tăng tính minh bạch trong quy trình phân bổ (tránh tiêu cực).
*   22. Giảm tình trạng "thừa người chỗ dễ, thiếu người chỗ khó".

**5. Execute & Monitor (Theo dõi gián tiếp)**
*Nhà trường giám sát quá trình thông qua Dashboard.*
*   23. Tăng khả năng nắm bắt tình hình thực tập theo thời gian thực (Real-time).
*   24. Giảm độ trễ thông tin khi có sự cố xảy ra với sinh viên.
*   25. Tăng khả năng giám sát đồng thời hàng ngàn sinh viên mà không cần tăng nhân sự.
*   26. Giảm nỗ lực giảng viên phải gọi điện kiểm tra từng điểm thực tập.
*   27. Tăng tính sẵn sàng của dữ liệu điểm danh/chuyên cần.
*   28. Giảm tình trạng sinh viên "đem con bỏ chợ" (bỏ thực tập giữa chừng).

**6. Assess (Đánh giá)**
*Nhà trường nghiệm thu kết quả dựa trên dữ liệu IOC.*
*   29. Tăng tính khách quan của điểm số (Objectivity).
*   30. Giảm sự phụ thuộc vào các báo cáo "xin dấu mộc" làm đẹp số liệu.
*   31. Tăng khả năng phát hiện các trường hợp gian lận/copy báo cáo.
*   32. Giảm thời gian chấm điểm đồ án/khóa luận của giảng viên.
*   33. Tăng cơ sở dữ liệu để bảo vệ kết quả trước thanh tra giáo dục.
*   34. Giảm số lượng các ca phúc khảo/khiếu nại điểm số.

**7. Modify (Can thiệp/Xử lý)**
*Nhà trường xử lý các ca ngoại lệ và rủi ro.*
*   35. Giảm thời gian phát hiện dấu hiệu rủi ro (Early warning system).
*   36. Tăng hiệu quả khi can thiệp hỗ trợ sinh viên gặp khó khăn tâm lý.
*   37. Giảm ảnh hưởng tiêu cực của các sự cố đến uy tín nhà trường.
*   38. Tăng khả năng giữ chân sinh viên hoàn thành khóa học (Retention rate).

**8. Conclude (Tổng kết & Kiểm định)**
*Nhà trường sử dụng dữ liệu cho mục tiêu chiến lược.*
*   39. **Tăng tỷ lệ sinh viên có việc làm ngay sau tốt nghiệp (Employment rate).**
*   40. Tăng chất lượng hồ sơ minh chứng cho kiểm định chất lượng (AUN-QA, MOET).
*   41. Giảm chi phí tổ chức khảo sát cựu sinh viên/doanh nghiệp.
*   42. Tăng uy tín thương hiệu tuyển sinh của nhà trường.
*   43. Tăng khả năng thu hút các doanh nghiệp lớn hợp tác trong khóa sau.
*   44. Giảm nỗ lực làm báo cáo tổng kết năm học.
*   45. Tăng sự hài lòng của phụ huynh và xã hội.

---

3.4 **BƯỚC 4: PHÂN KHÚC CƠ HỘI (SEGMENTS OF OPPORTUNITY)**

Dựa trên cấu trúc khách hàng đa chiều, IOC nhận diện các cơ hội tăng trưởng riêng biệt cho từng nhóm đối tượng dựa trên **Các nhu cầu chưa được đáp ứng (Underserved Outcomes)**:

### 3.4.1 CƠ HỘI TỪ NHÓM B2C (SINH VIÊN TỰ DO)
*Đối tượng: Sinh viên năm cuối, trái ngành, hoặc mất gốc (The "Desperate" Job Seeker).*

1.  **Phân khúc "Panic Seekers" (Nhóm Hoảng loạn):**
    *   *Nỗi đau:* Sắp ra trường nhưng CV trống trơn, sợ thất nghiệp, sợ phỏng vấn.
    *   *Underserved Outcome:* Cần một "phao cứu sinh" cấp tốc để có 1-2 dự án bỏ vào CV.
    *   *Giải pháp:* **Bootcamp thực chiến ngắn hạn** (Foundation Training).

2.  **Phân khúc "Switchers" (Nhóm Chuyển ngành):**
    *   *Nỗi đau:* Có tư duy nhưng thiếu kinh nghiệm thực tế trong ngành IT.
    *   *Underserved Outcome:* Cần chứng minh năng lực tương đương với sinh viên chính quy.
    *   *Giải pháp:* **Dự án thực tế có Mentor 1:1**.

### 3.4.2 CƠ HỘI TỪ NHÓM B2B (SINH VIÊN TỪ TRƯỜNG - UPSELL)
*Đối tượng: Sinh viên khá/giỏi nhưng bị giới hạn bởi chương trình đại trà (The "Silent" High-Achiever).*

1.  **Phân khúc "Badge Hunters" (Nhóm Săn chứng chỉ):**
    *   *Nỗi đau:* Đi thực tập chỉ để "lấy điểm", sợ CV không có gì nổi bật so với hàng ngàn bạn cùng khóa.
    *   *Underserved Outcome:* Muốn có một bằng chứng năng lực (Artifact) độc quyền mà "trường không cấp".
    *   *Giải pháp:* **Verified Career Path (Premium)** với chứng chỉ năng lực số.

2.  **Phân khúc "Big Corp Dreamers" (Nhóm Mơ vào Big Tech):**
    *   *Nỗi đau:* Dự án nhà trường quá dễ, không đủ tiêu chuẩn thi vào các tập đoàn lớn.
    *   *Underserved Outcome:* Cần tiếp cận các dự án độ khó cao (High complexity) và Mock Interview chuẩn Big Tech.
    *   *Giải pháp:* **Gói Mentoring chuyên sâu & Job Referral**.

### 3.4.3 CƠ HỘI TỪ NHÓM B2B (NHÀ TRƯỜNG - UNIVERSITY PARTNERS)
*Đối tượng: Các trường ĐH/CĐ cần nâng cao vị thế và giải bài toán kiểm định (The "Accredited" School).*

1.  **Phân khúc "Administration Overloaded" (Nhóm Quá tải hành chính):**
    *   *Nỗi đau:* Khoa CNTT có hàng ngàn sinh viên nhưng chỉ có vài giáo vụ, quá tải trong việc quản lý giấy tờ thực tập.
    *   *Underserved Outcome:* Cần giải phóng sức lao động hành chính (Admin workload reduction).
    *   *Giải pháp:* **Hệ thống quản lý thực tập số hóa (IMS)**.

2.  **Phân khúc "Quality Obsessed" (Nhóm Cần thương hiệu):**
    *   *Nỗi đau:* Tỷ lệ sinh viên có việc làm sau tốt nghiệp thấp, ảnh hưởng tuyển sinh và xếp hạng (Ranking).
    *   *Underserved Outcome:* Cần dữ liệu minh chứng chất lượng đào tạo để phục vụ kiểm định AUN-QA/MOET.
    *   *Giải pháp:* **Dashboard báo cáo chất lượng & Cam kết đầu ra**.

---

3.5 **BƯỚC 5: ĐỀ XUẤT GIÁ TRỊ & CHIẾN LƯỢC (VALUE PROPOSITION)**

IOC áp dụng chiến lược **"Platform đa diện" (Multi-sided Platform)**, cung cấp các bộ giá trị riêng biệt nhưng bổ trợ lẫn nhau cho 3 nhóm đối tượng.

### 3.5.1 CHIẾN LƯỢC B2C: "CAREER SURVIVAL KIT" (BỘ KIT SINH TỒN)
*Thông điệp: "Đừng để thiếu kinh nghiệm giết chết sự nghiệp của bạn."*

| Yếu tố | Nội dung |
| :--- | :--- |
| **Sản phẩm** | Khóa huấn luyện dự án thực tế (Project-based Training) + AI Mentor 24/7. |
| **Pain Relievers** | • Xóa bỏ nỗi sợ hổng kiến thức (AI hỗ trợ).<br>• Giảm lo lắng khi phỏng vấn (Mock Interview). |
| **Gain Creators** | • Có ngay Portfolio chuẩn chỉnh sau 2 tháng.<br>• Tự tin deal lương nhờ năng lực thật. |

### 3.5.2 CHIẾN LƯỢC B2B UPSELL: "PREMIUM CERTIFICATION" (CHỨNG THỰC CAO CẤP)
*Thông điệp: "Biến kỳ thực tập bắt buộc thành bệ phóng vào Big Tech."*

| Yếu tố | Nội dung |
| :--- | :--- |
| **Sản phẩm** | Verified Project Track (Gói dự án xác thực) + Đặc quyền Job Referral. |
| **Pain Relievers** | • Tránh việc thực tập "rót nước pha trà".<br>• Không còn nỗi sợ CV bị chìm nghỉm giữa đám đông. |
| **Gain Creators** | • Sở hữu "Verified Badge" độc quyền của IOC trên LinkedIn.<br>• Được Priority kết nối trực tiếp với HR đối tác. |

### 3.5.3 CHIẾN LƯỢC B2B SCHOOL: "QUALITY ASSURANCE PLATFORM" (NỀN TẢNG ĐẢM BẢO CHẤT LƯỢNG)
*Thông điệp: "Chuẩn hóa quy trình thực tập, Vững tin chất lượng đầu ra."*

| Yếu tố | Nội dung |
| :--- | :--- |
| **Sản phẩm** | Hệ thống quản lý thực tập (IMS) + Dashboard phân tích dữ liệu (Analytics). |
| **Pain Relievers** | • Giảm 80% thời gian xử lý thủ tục hành chính.<br>• Loại bỏ rủi ro sinh viên thực tập "ma". |
| **Gain Creators** | • Có bộ dữ liệu chuẩn hóa phục vụ kiểm định chất lượng.<br>• Nâng cao tỷ lệ sinh viên có việc làm (Employment Rate). |

---

3.6 **BƯỚC 6: KẾ HOẠCH KIỂM CHỨNG & TRIỂN KHAI (VALIDATION & ROLLOUT PLAN)**

Chiến lược kiểm chứng được chia nhỏ (Unbundle) để phù hợp với từng kênh tiếp cận.

### 3.6.1 KIỂM CHỨNG KÊNH B2C (SMOKE TEST)
*Mục tiêu: Đo lường độ "khát" (Desirability) của sinh viên tự do.*
1.  **Landing Page Test:** Chạy quảng cáo Facebook/TikTok target vào sinh viên năm cuối với thông điệp "Sợ thất nghiệp?".
2.  **Value Offer:** Tặng "Ebook lộ trình thực tập" để thu thập Lead.
3.  **Metric:** CPA (Cost Per Acquisition) cho một Lead đăng ký tư vấn. Nếu < 50k VNĐ -> Tín hiệu tốt.

### 3.6.2 KIỂM CHỨNG KÊNH B2B UPSELL (PILOT TEST)
*Mục tiêu: Đo lường tỷ lệ chuyển đổi (Conversion Rate) từ Free sang Paid.*
1.  **Pilot Program:** Hợp tác với 1 trường ĐH để triển khai hệ thống quản lý miễn phí cho 200 sinh viên.
2.  **Upsell Trigger:** Giữa kỳ thực tập, tung ra gói "Nâng cấp dự án" (Premium Project) với giá ưu đãi.
3.  **Metric:** Conversion Rate. Nếu > 5% sinh viên chấp nhận trả tiền để nâng cấp -> Mô hình khả thi.

### 3.6.3 KIỂM CHỨNG KÊNH B2B SCHOOL (PARTNERSHIP TEST)
*Mục tiêu: Đo lường khả năng giải quyết nỗi đau hành chính (Viability).*
1.  **MOU Ký kết:** Thuyết phục Trưởng khoa CNTT của 1 trường tầm trung sử dụng hệ thống.
2.  **Admin Time Tracking:** Đo lường thời gian giáo vụ bỏ ra trước và sau khi dùng IOC.
3.  **Metric:** Time Saved. Nếu giảm được > 50% thời gian quản lý -> Đạt Product-Market Fit với nhà trường.

4\. **Tổng quan thị trường thực tập và tuyển dụng sinh viên CNTT năm 2025**

4.1 **Quy mô thị trường & nhu cầu nhân lực**

Theo _Vietnam Information Technology Market Report_, ngành CNTT tại Việt Nam sẽ cần khoảng 700.000 nhân lực có kỹ năng CNTT vào cuối năm 2025, trong khi các cơ sở đào tạo trong nước chỉ có thể cung cấp khoảng 500.000 lao động CNTT → dẫn tới thiếu hụt khoảng ~200.000 người có kỹ năng chuyên môn đủ mạnh để đáp ứng nhu cầu thị trường.

Tổng số doanh nghiệp IT hiện tại: ~74.000 doanh nghiệp, sử dụng hơn 1,2 triệu lao động (tổng lực lượng hiện tại) và được dự báo sẽ tăng trưởng mạnh đến 3 triệu vào năm 2030.

→ Ước tính giai đoạn 2023–2025, Việt Nam thiếu khoảng 150.000–200.000 nhân lực IT mỗi năm, là áp lực lớn cho phát triển công nghệ số quốc gia.

4.2 **Chất lượng đầu vào nhân lực không đáp ứng nhu cầu doanh nghiệp**

Theo thống kê từ _Vietnam IT Market Report_, mỗi năm có ~50.000–57.000 sinh viên tốt nghiệp ngành CNTT, nhưng chỉ ~30–35% trong số đó được coi là "sẵn sàng làm việc ngay” - phần lớn còn phải qua đào tạo lại 3–6 tháng trong doanh nghiệp trước khi đạt năng lực mong muốn.

Điều này cho thấy rõ sự không khớp giữa đầu ra giáo dục và yêu cầu thị trường về kỹ năng thực tế, đặc biệt ở các lĩnh vực như:

Làm việc theo quy trình dự án

Kỹ năng kỹ thuật nâng cao (backend, cloud, AI, cybersecurity)

Kỹ năng mềm: teamwork, quản lý deadline, giao tiếp nhóm

→ Đây chính là ''khoảng cách kỹ năng” mà nhiều doanh nghiệp gọi là _skills gap_ - tức chương trình học chưa theo kịp nhu cầu thực hành trong môi trường dự án thật.

4.3 **Xu hướng cung – cầu trên thị trường lao động CNTT**

Mặc dù một số báo cáo khảo sát cho thấy việc tuyển dụng nhân sự CNTT có thể giảm nhẹ (2%) trong vài tháng đầu năm 2025 so với cùng kỳ năm trước, nhưng số người tìm việc trong ngành tăng đến ~18%, cho thấy thị trường bị lệch pha: nhiều ứng viên nhưng thiếu ứng viên chất lượng.

Đồng thời báo cáo Navigos Group (Salary & Labor Market Report 2025) cho biết:

\>81% doanh nghiệp dự định tăng tuyển nhân sự IT trong năm 2025

Họ vẫn ưu tiên ứng viên có 1–3 năm kinh nghiệm (55,47%) và 3–5 năm (27,36%) hơn là sinh viên mới ra trường. Nhu cầu dành cho intern/fresher giảm tương đối, nhiều đơn vị ngại nhận sinh viên nền tảng yếu và phải đào tạo lại từ đầu.

→ Điều này cho thấy nhu cầu "sẵn sàng làm việc" tăng cao hơn nhu cầu số lượng CV, tạo áp lực lớn hơn cho sinh viên fresher/junior khi họ thiếu kinh nghiệm và bằng chứng làm việc thực tế; đồng thời khiến nhà trường khó tìm đủ chỗ thực tập thực chất cho sinh viên CNTT.

4.4 **Lý do gốc của khoảng cách thị trường**

**Nguyên nhân 1 – Chương trình đào tạo chưa đủ thực hành:**  
Báo cáo phân tích cho thấy sinh viên tốt nghiệp phần lớn thiếu tiếp xúc với các quy trình làm việc theo dự án thật, workflow làm việc nhóm, kiểm soát chất lượng phần mềm… dẫn tới việc họ chưa có dữ liệu thể hiện khả năng làm việc thực tế.

**Nguyên nhân 2 – Hệ thống đánh giá thiếu dữ liệu khách quan:**  
Doanh nghiệp hiện nay đánh giá ứng viên chủ yếu dựa trên CV, bài test đơn lẻ và phỏng vấn — tất cả đều là dữ liệu gián tiếp và không phản ánh cách người học làm việc trên thực tế — khiến rủi ro tuyển sai và chi phí đào tạo lại tăng cao.

**Nguyên nhân 3 – Tăng cạnh tranh do AI & công nghệ mới:**  
Sự phát triển nhanh của công nghệ AI yêu cầu kỹ năng mới, và nhiều ứng viên thiếu kỹ năng cập nhật, dẫn tới roi lộ gap lớn giữa kỹ năng cần và kỹ năng có.

4.5 **Tóm lược – Insight Thị trường**

Ngay cả khi có số lượng sinh viên tốt nghiệp lớn (~50.000–57.000 mỗi năm), chỉ ~30–35% được xem là sẵn sàng làm việc thực tế → khoảng trống kỹ năng rất lớn.

Thiếu hụt ~150.000–200.000 nhân lực IT có kỹ năng mỗi năm đến 2025 dù lượng đo tuyển dụng rất cao.

Nhu cầu tuyển tăng (~81% doanh nghiệp định tăng tuyển IT) nhưng yêu cầu kỹ năng thực tế chưa được đáp ứng bằng các phương pháp tuyển dụng hiện hành.

→ Tất cả đều chỉ ra khoảng trống giữa bằng cấp và năng lực thực tế — sinh viên có chứng chỉ nhưng thiếu trải nghiệm và bằng chứng làm việc trong môi trường dự án thật, là vấn đề trọng tâm mà thị trường đang gặp phải hiện nay.

4.6 **Khoảng trống thị trường (Market Gap)**

Tổng hợp từ ba phía: Hiện không có hệ thống nào tổ chức thực tập thực chiến – dự án thật, mentor xác thực, đánh giá đầu ra rõ ràng – cho sinh viên CNTT ở quy mô và chuẩn hóa như IOC

**Hệ quả của khoảng trống này:**

Sinh viên: thiếu chỗ thực tập hoặc đi thực tập thì bị giao việc không đúng chuyên môn, dẫn đến mất cơ hội chứng minh năng lực

Nhà trường: khó đặt sinh viên đi thực tập (nhu cầu intern/fresher giảm, đơn vị tuyển ngại nhận và đào tạo lại từ đầu), mất uy tín đầu ra

**\->** Đây không phải vấn đề cá biệt, mà là lỗ hổng cấu trúc của thị trường lao động trẻ.


5\. **Phân tích dự án theo mô hình kinh doanh BUSINESS MODEL CANVAS – IOC 2.0**

|     |     |
| --- | --- |
| **Customer Segments – Phân khúc khách hàng** | IOC 2.0 phục vụ **hai nhóm khách hàng chính** (Sinh viên và Nhà trường), cùng bị khóa bởi một vấn đề cốt lõi:  <br>Thiếu thực tập thực chiến và bằng chứng đầu ra đáng tin cậy (dự án thật, đánh giá mentor).<br><br>**1\. Tổng thị trường – TAM (Total Addressable Market)**<br><br>**1.1. Sinh viên**<br><br>Việt Nam hiện có khoảng **2,2 – 2,4 triệu sinh viên đại học**, cao đẳng.<br><br>Trong đó, nhóm **CNTT, Kinh tế số, Truyền thông số, Data, AI, Product, Design** chiếm xấp xỉ **30–35%**.<br><br>**~700.000 – 800.000 sinh viên ngành số**  <br>→ Đây là **nguồn nhu cầu thực tập thực chiến lớn**, nhưng hiện **chưa được đáp ứng đủ** bởi mô hình chuẩn hóa như IOC.<br><br>**Lưu ý:** Doanh nghiệp không được định vị là khách hàng của IOC trong giai đoạn hiện tại (doanh nghiệp rất khó trở thành khách hàng trong vấn đề tuyển intern); doanh nghiệp tham gia với vai trò đối tác trong mạng lưới hợp tác.<br><br>**1.2. Nhà trường – Bên cần bằng chứng đầu ra**<br><br>Việt Nam có khoảng **240+ trường đại học, học viện, cao đẳng**.<br><br>Phần lớn **chưa có hệ thống theo dõi và chứng minh chất lượng đầu ra thực tập**:<br><br>Chỉ thống kê việc làm sau tốt nghiệp<br><br>Không chứng minh được _sinh viên làm được gì_<br><br>**TAM nhà trường = Toàn bộ hệ thống đào tạo cần dữ liệu để bảo vệ uy tín và kiểm định chất lượng.**<br><br>**Kết luận TAM:** IOC 2.0 nằm trong thị trường giao thoa EdTech – thực tập – đào tạo, với hàng trăm nghìn sinh viên tiềm năng mỗi năm và nhu cầu thực tập thực chiến mang tính cấu trúc.<br><br>**2\. Thị trường phục vụ được – SAM (Serviceable Available Market)**<br><br>IOC **không phục vụ toàn bộ TAM**, mà tập trung vào phân khúc **có nhu cầu thực tập thật và đánh giá đầu ra rõ ràng**.<br><br>**2.1. Sinh viên (SAM)**<br><br>Sinh viên năm 2–4, ngành số. Có nhu cầu:<br><br>Đi thực tập thật<br><br>Có dự án thật để xin việc<br><br>Sẵn sàng làm việc theo quy trình, có mentor & AI hỗ trợ<br><br>**~200.000 – 250.000 sinh viên / năm**<br><br>**2.2. Nhà trường (SAM)**<br><br>Trường:<br><br>Đào tạo CNTT / ngành số<br><br>Có định hướng hợp tác doanh nghiệp<br><br>Áp lực kiểm định & đầu ra<br><br>**~60 – 80 trường**<br><br>**SAM là tập khách hàng mà IOC có thể kích hoạt ngay**, vì:<br><br>Có nhu cầu rõ<br><br>Có hành vi phù hợp<br><br>Có khả năng trả tiền hoặc hợp tác dài hạn<br><br>3\. **Thị trường mục tiêu thực tế – SOM (Serviceable Obtainable Market)**<br><br>Trong 12–24 tháng đầu, IOC 2.0 chủ động giới hạn quy mô để đảm bảo chất lượng đào tạo và đánh giá.<br><br>Mục tiêu SOM giai đoạn đầu:<br><br>**Sinh viên:** 500 – 1000 sinh viên / năm<br><br>**Nhà trường:** 5 – 10 trường đối tác chiến lược<br><br>Đây là ngưỡng tối ưu để:<br><br>Đủ quy mô để huấn luyện AI và chuẩn hóa quy trình<br><br>Tạo uy tín và hiệu ứng mạng lưới trước khi scale<br><br>\-> IOC 2.0 giải quyết bài toán thực tập hình thức bằng cách tổ chức thực tập thực chiến (dự án thật, mentor, đánh giá rõ ràng), phục vụ nhà trường và sinh viên. |
| **Value Propositions – Giá trị cốt lõi** | **IOC 2.0 tổ chức thực tập thực chiến: dự án thật, mentor, đánh giá đầu ra rõ ràng.**<br><br>**Giá trị mang lại cho từng nhóm**<br><br>**Đối với sinh viên**<br><br>Kinh nghiệm dự án thật, portfolio và đánh giá từ mentor<br><br>Tăng tỷ lệ được gọi phỏng vấn và được tuyển<br><br>**Đối với nhà trường**<br><br>Dashboard dữ liệu đầu ra<br><br>Bằng chứng định lượng về chất lượng đào tạo<br><br>Nâng uy tín với doanh nghiệp tuyển dụng |
| **Channels – Kênh tiếp cận** | IOC 2.0 tiếp cận thị trường thông qua:<br><br>Chương trình thực tập dự án thật<br><br>Hợp tác với doanh nghiệp (đối tác)<br><br>Hợp tác chính thức với nhà trường<br><br>Nền tảng số: quản lý dự án, báo cáo tiến độ, AI Assistant & AI Mentor |
| **Customer Relationships – Quan hệ khách hàng** | **Sinh viên**:<br><br>Đồng hành xuyên suốt dự án<br><br>Feedback liên tục từ AI & mentor<br><br>Cá nhân hoá lộ trình năng lực<br><br>**Nhà trường**:<br><br>Quan hệ đối tác chiến lược<br><br>Báo cáo định kỳ, dữ liệu đầu ra<br><br>Đồng thiết kế chương trình thực tập |
| **Revenue Streams – Dòng doanh thu** | Mô hình doanh thu của IOC 2.0 tập trung vào **hai nhóm khách hàng** (doanh nghiệp không được định vị là khách hàng trả tiền trong giai đoạn hiện tại — rào cản chuyển đổi trong bài toán tuyển intern):<br><br>• **Nhà trường (B2B):**<br><br>\- **Phí Dashboard / báo cáo đầu ra:** Cung cấp bằng chứng về chất lượng đào tạo và thực tập để phục vụ kiểm định và uy tín nhà trường.<br><br>\- **Phí triển khai thực tập chuẩn hóa:** Thu phí dịch vụ khi IOC vận hành quy trình thực tập theo dự án thật cho sinh viên của trường.<br><br>• **Sinh viên (B2C):**<br><br>\- **Gói Premium:** Thu phí cho các công cụ AI Mentor, AI Teammate và tính năng bổ trợ |
| **Key Resources – Tài nguyên cốt lõi** | Nền tảng công nghệ & quy trình thực tập<br><br>AI Agent (giao việc, hỗ trợ, đánh giá)<br><br>Hệ thống mentor & quy trình chấm chuẩn hoá<br><br>Quan hệ doanh nghiệp & nhà trường |
| **Key Activities – Hoạt động cốt lõi** | Thiết kế & vận hành dự án thực tập<br><br>Phân bổ task bằng AI, mentor<br><br>Theo dõi tiến độ & đánh giá đầu ra<br><br>Đánh giá chéo AI – mentor<br><br>Phân tích & xuất báo cáo cho nhà trường / sinh viên |
| **Key Partners – Đối tác chính** | Hệ thống đối tác của IOC 2.0 được xây dựng như một mạng lưới liên kết giữa các chủ thể: nhà trường, doanh nghiệp, mentor, AI.<br><br>**Nhóm đối tác chiến lược trong hệ sinh thái (External Ecosystem)**<br><br>Đây là những đối tác trực tiếp tham gia vào việc vận hành thực tập và đánh giá đầu ra:<br><br>**Doanh nghiệp (7 đối tác hiện tại):** Đối tác hợp tác trong mạng lưới (dự án, mentor, tham chiếu tuyển dụng) — **không phải khách hàng trả tiền** của IOC; việc kết nối sinh viên sang thực tập tại doanh nghiệp chưa được thực hiện trực tiếp, sinh viên vẫn tự apply.<br><br>**Nhà trường & Đơn vị đào tạo (14 đối tác hiện tại):** Kênh phân phối sinh viên ổn định. Nhà trường sử dụng Dashboard của IOC để theo dõi chất lượng đào tạo và bảo vệ uy tín đầu ra.<br><br>**Đội ngũ Mentor ngành CNTT:** Các chuyên gia trực tiếp hướng dẫn, đánh giá và xác thực kết quả làm việc của sinh viên tại các điểm then chốt.<br><br>**Đối tác hạ tầng AI:** Cung cấp các mô hình ngôn ngữ lớn (LLM) và AI Agent để tự động hóa việc giao nhiệm vụ, hỗ trợ kỹ thuật và chấm điểm sơ bộ. Đây là yếu tố giúp tối ưu chi phí vận hành và cho phép dự án mở rộng quy mô (scale) mà không phụ thuộc hoàn toàn vào con người.<br><br>**Nhóm đối tác hỗ trợ chiến lược nội bộ (Internal Stakeholders)**<br><br>Dự án nhận được sự phối hợp liên phòng ban từ tổ chức mẹ để đảm bảo tính thực thi và gắn chặt với hoạt động kinh doanh:<br><br>**Phòng Marketing & Sales:** Hỗ trợ hoạt động truyền thông, cung cấp yêu cầu từ góc độ thị trường và đánh giá mức độ phù hợp của sản phẩm với nhu cầu khách hàng.<br><br>**Trung tâm Đào tạo:** Kết nối IOC 2.0 với các hoạt động đào tạo thực tế để dữ liệu thu thập phản ánh đúng quá trình học tập của sinh viên.<br><br>**Ban Giám đốc & Phòng Kế toán:** Đảm bảo định hướng chiến lược, ra quyết định quan trọng và phê duyệt ngân sách triển khai.<br><br>**Phòng Nhân sự – Hành chính:** Hỗ trợ truyền thông nội bộ, tuyển dụng và sắp xếp nhân sự khi dự án cần mở rộng quy mô |
| **Cost Structure – Cấu trúc chi phí** | Phát triển & vận hành nền tảng<br><br>Chi phí AI (compute, model, agent)<br><br>Mentor & kiểm soát chất lượng<br><br>Sales & hợp tác doanh nghiệp<br><br>Phân tích & lưu trữ dữ liệu<br><br>**AI giúp chi phí không tăng tuyến tính theo số sinh viên, cho phép mô hình scale.** |
| **Key Metrics – Chỉ số đo lường** | Tỷ lệ hoàn thành dự án<br><br>Độ lệch giữa AI và mentor<br><br>Tỷ lệ sinh viên được tuyển<br><br>Mức độ hài lòng của nhà trường và sinh viên<br><br>**Các chỉ số này phản ánh hiệu quả vận hành và chất lượng thực tập.** |

6\. **Thị trường và cạnh tranh**

6.1 **Phân tích quy mô thị trường mục tiêu theo mô hình TAM – SAM – SOM của IOC 2.0**

6.1.1 **TAM – Total Addressable Market**

_(Quy mô thị trường tiềm năng tối đa)_

TAM của IOC 2.0 được xác định dựa trên quy mô người học và nguồn nhân lực trong lĩnh vực công nghệ số tại Việt Nam, là nhóm có nhu cầu tất yếu về thực tập, xác thực năng lực và chuyển tiếp sang thị trường lao động.

Theo Báo cáo Thị trường CNTT Việt Nam 2024 (TopDev) và các số liệu tổng hợp từ Bộ Khoa học & Công nghệ, quy mô sinh viên và người học thuộc các ngành công nghệ số tại Việt Nam giai đoạn 2024–2025 ước tính khoảng 700.000–800.000 người.

Con số này bao gồm ba nhóm chính:

Công nghệ thông tin & Khoa học máy tính: ~400.000 sinh viên

Khoa học dữ liệu, Trí tuệ nhân tạo và các ngành liên quan: ~150.000 sinh viên

Kỹ thuật phần mềm, hệ thống thông tin và các chuyên ngành số khác: ~150.000–250.000 sinh viên

TAM phản ánh nhu cầu mang tính cấu trúc của thị trường: sinh viên công nghệ buộc phải trải qua thực tập, đánh giá năng lực và chứng minh khả năng làm việc thực tế trước khi gia nhập thị trường lao động.

→ TAM của IOC 2.0: ~700.000–800.000 người học ngành công nghệ số tại Việt Nam.

6.1.2 **SAM – Serviceable Available Market**

_(Thị trường mục tiêu có thể phục vụ)_

Từ TAM, IOC 2.0 tập trung vào phân khúc sinh viên có khả năng và sẵn sàng tham gia các chương trình thực tập dự án có đánh giá năng lực, thay vì toàn bộ người học ngành CNTT.

SAM được xác định dựa trên các điều kiện sau:

Sinh viên năm 2–4 các ngành công nghệ

Có nhu cầu thực tập, làm dự án thực tế

Sẵn sàng tham gia chương trình có mentor, đánh giá và chuẩn hóa năng lực

Chủ yếu đến từ các trường đại học có liên kết doanh nghiệp

Tỷ lệ 25–35% TAM được sử dụng làm cơ sở ước tính SAM, dựa trên:

Thực tế chỉ một phần sinh viên CNTT tham gia thực tập đúng chuyên môn mỗi năm

Không phải tất cả sinh viên đều tiếp cận được mô hình thực tập có mentor và đánh giá bài bản

Sự chênh lệch rõ rệt giữa sinh viên tại các thành phố lớn (Hà Nội, TP.HCM, Đà Nẵng) và khu vực khác

Theo giả định này, SAM của IOC 2.0 ước tính khoảng 200.000-250.000 sinh viên mỗi năm.

Đây là nhóm khách hàng có "nỗi đau" rõ ràng:

Khó chứng minh năng lực khi xin việc

Thực tập truyền thống mang tính hình thức

Doanh nghiệp thiếu dữ liệu tin cậy để đánh giá fresher

6.1.3 **SOM – Serviceable Obtainable Market**

_(Thị trường mục tiêu khả thi giai đoạn đầu)_

SOM phản ánh quy mô thị trường mà IOC 2.0 có thể tiếp cận thực tế trong 12-24 tháng đầu, dựa trên năng lực vận hành hiện tại.

IOC 2.0 không đặt mục tiêu chiếm lĩnh nhanh SAM, mà lựa chọn chiến lược:

Thu gọn quy mô

Chuẩn hóa quy trình thực tập và đánh giá

Xây dựng độ tin cậy của mô hình đào tạo – thực tập

Cơ sở xác định SOM:

Nền tảng hiện tại đã vận hành với ~1.500 sinh viên

Hệ sinh thái hợp tác gồm 14 trường đại học và 7 doanh nghiệp (lưu ý: kết nối sinh viên sang thực tập tại các doanh nghiệp đối tác chưa được thực hiện trực tiếp — sinh viên vẫn phải tự apply)

Mô hình mentor – dự án yêu cầu tỷ lệ giám sát chặt chẽ để đảm bảo chất lượng đào tạo

Mỗi mentor chỉ có thể quản lý số lượng sinh viên giới hạn để đảm bảo đánh giá đúng năng lực

Dựa trên các yếu tố này, SOM giai đoạn đầu được xác định ở mức 3.000–5.000 sinh viên, tương đương khoảng 1–2% SAM.

Quy mô này được đánh giá là:

Phù hợp với năng lực vận hành hiện tại

Đủ lớn để tạo hiệu ứng mạng lưới và uy tín

Đủ nhỏ để kiểm soát chất lượng đánh giá và chuẩn hóa quy trình

6.1.4 **Nhận định tổng hợp**

Phân tích TAM – SAM – SOM cho thấy IOC 2.0 đang tiếp cận một thị trường:

Có quy mô lớn và ổn định (TAM)

Có phân khúc khách hàng sẵn sàng sử dụng dịch vụ (SAM)

Có chiến lược tiếp cận thận trọng và khả thi (SOM)

Việc lựa chọn SOM thu gọn trong giai đoạn đầu cho phép IOC 2.0 ưu tiên xây dựng quy trình thực tập đủ chuẩn và độ tin cậy, thay vì mở rộng quy mô khi mô hình đánh giá chưa hoàn thiện. Đây là tiền đề quan trọng cho các giai đoạn mở rộng sau này.

6.1.5 **Cơ hội thị trường (Market Opportunity)**

**Nếu xây dựng được một mô hình:**

Chuẩn hóa thực tập theo dự án thật

Có mentor xác thực

Theo dõi tiến độ, chất lượng và đánh giá đầu ra rõ ràng

Xuất báo cáo chuẩn cho nhà trường kiểm định đầu ra

**Thì nền tảng đó sẽ:**

Tăng khả năng được tuyển cho sinh viên (portfolio, kinh nghiệm thật)

Trở thành chuẩn thực tập thực chiến cho thị trường nhân lực trẻ

6.1.6 **Giải pháp IOC 2.0**

Thị trường thực tập và tuyển dụng sinh viên hiện nay gặp một vấn đề cốt lõi: thực tập mang tính hình thức, thiếu dự án thật và đánh giá đầu ra đáng tin cậy; sinh viên thiếu kinh nghiệm và bằng chứng cụ thể để ứng tuyển.

Trước vấn đề đó, IOC 2.0 không tiếp cận theo hướng chỉ kết nối cơ hội thực tập, mà tập trung vào tổ chức thực tập thực chiến: dự án thật, mentor thật, đánh giá rõ ràng.

**Giải pháp cốt lõi của IOC 2.0 là: biến toàn bộ quá trình thực tập thành một hành trình có thể quan sát và đo lường — sinh viên tham gia dự án thật, làm việc theo nhóm, nhận và hoàn thành task, tương tác với mentor và nhận phản hồi liên tục.**

Cụ thể, IOC 2.0 tổ chức hành trình từ học → thực tập trong đó:

Sinh viên tham gia các dự án thật, làm việc theo quy trình (Agile/Scrum), nhận task từ AI và mentor.

Hệ thống AI hỗ trợ: tạo và phân bổ task, giải thích yêu cầu, nhắc tiến độ; mentor con người đánh giá, xác thực và hiệu chỉnh tại các điểm then chốt.

Kết quả: trải nghiệm thực tập có chất lượng, đánh giá đầu ra rõ ràng (tiến độ, chất lượng sản phẩm, đánh giá mentor), báo cáo cho nhà trường và portfolio cho sinh viên.

**Như vậy, IOC 2.0 là nền tảng thực tập thực chiến phục vụ nhà trường và sinh viên: quản trị chất lượng đầu ra, đánh giá minh bạch, sinh viên có bằng chứng kinh nghiệm từ dự án thật để ứng tuyển.**


6.2 **CÁC GIẢ THUYẾT ĐẶT RA TRONG DỰ ÁN (Dựa trên mục tiêu IOC 2.0)**

**a/ Đối với Nhà trường**

**Giả thuyết NT–H1: Uy tín nhà trường phụ thuộc ngày càng nhiều vào đầu ra việc làm**

Nhà trường ngày càng chịu áp lực chứng minh chất lượng đào tạo thông qua tỷ lệ việc làm và năng lực thực tế của sinh viên sau tốt nghiệp.

Giả thuyết giải pháp: Việc tổng hợp và công bố dữ liệu đầu ra việc làm của sinh viên sau khóa IOC có thể giúp:

Nâng cao uy tín nhà trường

Hỗ trợ truyền thông tuyển sinh chất lượng

**Giả thuyết NT–H2: Nhà trường thiếu công cụ kiểm soát chất lượng thực tập**

Nhà trường gặp khó khăn trong việc kiểm soát thái độ học tập và chất lượng thực tập của sinh viên, do thiếu dữ liệu theo dõi quá trình làm việc thực tế.

Giả thuyết giải pháp: Nếu chứng chỉ IOC chỉ có giá trị khi sinh viên đáp ứng đồng thời yêu cầu năng lực và cam kết học tập, nhà trường có thể:

Siết chất lượng đầu ra

Giảm tình trạng thực tập hình thức

**b/ Đối với Học viên (chưa tham gia IOC)**

**Giả thuyết HV–H1: Sinh viên thiếu hiểu biết rõ ràng về năng lực bản thân**

Nhiều sinh viên CNTT chưa có cái nhìn đầy đủ và thực tế về điểm mạnh – điểm yếu của mình trong một ngành nghề cụ thể.

Giả thuyết giải pháp: Thông qua dự án thật và đánh giá từ mentor, sinh viên sau khóa IOC có thể:

Hiểu rõ năng lực cá nhân

Được định hướng vào các ngách phù hợp trong ngành

**Giả thuyết HV–H2: Sinh viên thiếu thông tin và kết nối với doanh nghiệp**

Sinh viên gặp khó khăn trong việc xác định doanh nghiệp phù hợp để ứng tuyển, do thiếu kênh đánh giá năng lực đáng tin cậy.

Giả thuyết giải pháp: Dữ liệu đánh giá năng lực trực quan cùng nhận xét từ hội đồng chuyên môn và lãnh đạo doanh nghiệp có thể:

Tăng khả năng được offer chính thức

Giảm khoảng cách giữa sinh viên và doanh nghiệp

**Giả thuyết HV–H3: Sinh viên thiếu bằng chứng năng lực thuyết phục**

CV truyền thống của sinh viên thiếu minh chứng cụ thể về năng lực làm việc thực tế.

Giả thuyết giải pháp: Portfolio dựa trên dữ liệu dự án thật, do hệ thống IOC xác thực, có thể:

Thay thế một phần quá trình training lại

Giúp sinh viên tự tin ứng tuyển ngay sau khóa học

**Từ các giả thuyết trên, nghiên cứu thị trường được triển khai theo 3 lớp dữ liệu:**

**Dữ liệu thứ cấp (Secondary data)**

Báo cáo ngành CNTT (TopDev, ITviec, Navigos, UNESCO, VietnamWorks)

Báo chí chính thống (VnExpress, VietnamNet, Baomoi)

Báo cáo nhân lực & chuyển đổi số

**Dữ liệu sơ cấp (Primary data – dự kiến triển khai)**

Khảo sát sinh viên CNTT năm 3–4

Phỏng vấn mentor, doanh nghiệp tiếp nhận thực tập

Dữ liệu vận hành từ các chương trình thực tập thử nghiệm (pilot)

**Phân tích tổng hợp (Insight synthesis)**

So sánh "kỳ vọng – thực tế"

Phát hiện khoảng trống dữ liệu (data gap)

Xác định vấn đề có thể giải quyết bằng sản phẩm/dịch vụ

Thị trường thực tập và tuyển dụng sinh viên CNTT tại Việt Nam đang phát triển nhanh về quy mô nhưng thiếu chuẩn hóa về chất lượng và dữ liệu đánh giá năng lực. Mỗi năm có hàng chục nghìn sinh viên CNTT tốt nghiệp từ các trường đại học, cao đẳng và các chương trình đào tạo ngắn hạn. Tuy nhiên, phần lớn sinh viên bước vào thị trường lao động trong trạng thái thiếu minh chứng cụ thể về khả năng làm việc thực tế.

**\--> Mô hình PESTEL phân tích được thị trường thực tập và tuyển dụng ảnh hưởng tới doanh nghiệp như thế nào. (Phân tích dựa trên dữ liệu thứ cấp secondary data)**

|     |     |
| --- | --- |
| **P – Political (Chính trị – Chính sách công)** | Theo Báo điện tử Chính phủ (12/6/2025), Thủ tướng Chính phủ ban hành Quyết định số 1131/QĐ-TTg về danh mục công nghệ chiến lược và sản phẩm công nghệ chiến lược. Bộ Khoa học và Công nghệ đã xác định 06 nhóm sản phẩm công nghệ trọng điểm triển khai trong năm 2025, bao gồm:<br><br>Mô hình ngôn ngữ lớn và trợ lý ảo tiếng Việt<br><br>AI camera xử lý tại biên<br><br>Robot tự hành<br><br>Thiết bị mạng 5G<br><br>Hạ tầng blockchain<br><br>Thiết bị bay không người lái (UAV)<br><br>**Tác động tới doanh nghiệp CNTT:**<br><br>Nhà nước định hướng rõ ràng ưu tiên phát triển công nghệ lõi và AI<br><br>Doanh nghiệp CNTT có nền tảng công nghệ sẵn có (như RIKKEI) có lợi thế nhanh chóng tiếp cận và triển khai các mô hình mới<br><br>Gia tăng nhu cầu nhân lực CNTT có khả năng làm việc thực tế trong các lĩnh vực công nghệ mới<br><br>→ IOC trở thành công cụ chiến lược giúp doanh nghiệp chủ động đào tạo – sàng lọc – chuẩn bị nguồn nhân lực phù hợp với định hướng công nghệ quốc gia. |
| **E – Economic (Kinh tế)** | Theo Bộ Khoa học & Công nghệ và TopDev, đến năm 2025:<br><br>Ngành CNTT Việt Nam cần khoảng 700.000 nhân sự<br><br>Nguồn cung dự kiến chỉ đáp ứng khoảng 530.000 người<br><br>Bên cạnh đó, báo cáo Vietnam IT Salary & Recruitment Market 2024–2025 cho thấy:<br><br>Nhiều sinh viên CNTT được trả lương ngay trong quá trình thực tập<br><br>Sinh viên có xu hướng mong muốn chuyển đổi trực tiếp từ thực tập sang việc làm chính thức<br><br>**Tác động tới thị trường tuyển dụng:**<br><br>Gia tăng cạnh tranh tuyển dụng ngay từ giai đoạn thực tập<br><br>Doanh nghiệp phải đầu tư nhiều hơn cho đào tạo và sàng lọc<br><br>**Tác động tới RIKKEI / IOC:**<br><br>Cơ hội:<br><br>Tuyển chọn sớm sinh viên chất lượng<br><br>Xây dựng pipeline nhân sự ổn định<br><br>Thách thức:<br><br>Chi phí đào tạo tăng<br><br>Rủi ro tuyển sai nếu thiếu bằng chứng năng lực thực tế<br><br>→ IOC đóng vai trò tăng chất lượng thực tập và đầu ra đào tạo, qua đó sinh viên có kinh nghiệm và portfolio rõ ràng hơn khi ứng tuyển. |
| **S – Social (Xã hội)** | Xu hướng xã hội hiện nay cho thấy:<br><br>Kỹ năng thực hành ngày càng được coi trọng hơn bằng cấp<br><br>Doanh nghiệp kỳ vọng sinh viên CNTT có thể tham gia công việc thực tế ngay từ giai đoạn thực tập<br><br>Theo báo cáo Internship Recruitment Demand Report 2025 tại Việt Nam:<br><br>Khoảng 43% doanh nghiệp mở rộng tuyển thực tập sinh so với giai đoạn trước<br><br>**Tác động xã hội:**<br><br>Sinh viên mong muốn chương trình thực tập có giá trị thật cho nghề nghiệp<br><br>Doanh nghiệp tìm kiếm mô hình thực tập tạo ra giá trị thực tế, không mang tính hình thức<br><br>**→ IOC giúp doanh nghiệp:**<br><br>Xây dựng niềm tin với sinh viên CNTT<br><br>Gia tăng giá trị thương hiệu tuyển dụng<br><br>Tạo lợi thế dài hạn về nguồn nhân lực chất lượng. |
| **T – Technology (Công nghệ)** | **Công nghệ số và AI đang:**<br><br>Tạo ra nhiều vị trí việc làm mới (AI, Data, Cloud, Backend, DevOps)<br><br>Làm thay đổi nhanh chóng yêu cầu kỹ năng của thị trường lao động CNTT<br><br>**Theo ITvietblog:**<br><br>Lượt tìm kiếm các vị trí liên quan đến AI tăng 89%<br><br>Các kỹ năng liên quan như SQL, Cloud, Data Science tăng khoảng 90%<br><br>Trong khi các công nghệ truyền thống như Java, PHP, .NET chỉ tăng khoảng 29%<br><br>Bên cạnh đó, nhu cầu việc làm CNTT quý I/2025 tăng 12% so với cùng kỳ năm 2024.<br><br>**Tác động tới doanh nghiệp:**<br><br>Cần nhân lực có khả năng học nhanh, thích ứng nhanh<br><br>Cần mô hình đào tạo – thực tập linh hoạt, cập nhật liên tục theo công nghệ<br><br>**→ IOC tận dụng AI để:**<br><br>Giao việc<br><br>Hỗ trợ kỹ thuật<br><br>Đánh giá năng lực  <br>→ Giúp doanh nghiệp thích ứng với tốc độ thay đổi công nghệ. |
| **E – Environmental (Môi trường – Bền vững & bối cảnh làm việc)** | **Xu hướng làm việc từ xa và hybrid ngày càng phổ biến trong ngành CNTT:**<br><br>Doanh nghiệp chú trọng đánh giá năng lực dựa trên kết quả công việc, không chỉ thời gian hiện diện<br><br>Thực tập và làm việc không còn phụ thuộc hoàn toàn vào không gian vật lý<br><br>**Tác động tới thị trường thực tập:**<br><br>Nhu cầu chuẩn hóa quy trình làm việc số<br><br>Cần hệ thống theo dõi tiến độ, chất lượng và kỷ luật làm việc<br><br>**Tác động tới RIKKEI / IOC:**<br><br>IOC phù hợp với môi trường làm việc số hóa<br><br>Cho phép mở rộng quy mô thực tập mà không phụ thuộc địa lý<br><br>Quy trình và báo cáo thực tập trở thành tài sản phục vụ đào tạo và đầu ra. |
| **L – Legal (Pháp lý)** | **Hiện nay:**<br><br>Chưa có khung pháp lý thống nhất cho chuẩn đầu ra thực tập<br><br>Chứng chỉ thực tập chưa có giá trị pháp lý rõ ràng trong tuyển dụng<br><br>Việc đánh giá năng lực sinh viên chủ yếu dựa vào thỏa thuận giữa doanh nghiệp và nhà trường<br><br>**Hệ quả:**<br><br>Thực tập mang tính hình thức vẫn phổ biến<br><br>Thiếu tiêu chuẩn chung để so sánh năng lực sinh viên giữa các doanh nghiệp<br><br>**Tác động tới RIKKEI / IOC:**<br><br>IOC đóng vai trò như một **chuẩn thực tế (de facto standard)** cho thực tập thực chiến (dự án thật, đánh giá mentor)<br><br>Quy trình và báo cáo đầu ra có thể bổ trợ cho kiểm định và tiêu chuẩn hóa trong tương lai. |

6.3 **MARKET DOMAINS – LĨNH VỰC THỊ TRƯỜNG**

6.3.1 **Sức hấp dẫn thị trường (Market Attractiveness - Macro)**

IOC 2.0 hoạt động tại giao điểm của Giáo dục & đào tạo CNTT và Thực tập – tuyển dụng nhân sự công nghệ.

Xu hướng cốt lõi: CV và bằng cấp không còn đủ; sinh viên cần kinh nghiệm và bằng chứng cụ thể (dự án thật, đánh giá). Thị trường thiếu mô hình thực tập thực chiến chuẩn hóa.

IOC 2.0 nhắm trực tiếp vào khoảng trống này.

6.3.2 **Sức hấp dẫn phân khúc mục tiêu (Target Segment Attractiveness - Micro)**

IOC không phục vụ toàn bộ thị trường lao động mà tập trung vào phân khúc:

Sinh viên ngành số – Doanh nghiệp tuyển fresher/junior – Nhà trường cần chứng minh đầu ra.

Phân khúc này có ba đặc điểm:

Quy mô lớn và lặp lại hàng năm

Nỗi đau rõ ràng và chi phí sai lầm cao

Quyết định mua dựa trên rủi ro tuyển sai, không phải giá rẻ

IOC không cạnh tranh trực tiếp với các nền tảng CV hay job board hiện có, mà tập trung giải quyết một lớp vấn đề khác: làm thế nào để đánh giá và giảm rủi ro khi tuyển dụng những ứng viên chưa có lịch sử làm việc rõ ràng.

Đây là phân khúc chưa có nền tảng nào chiếm lĩnh bằng dữ liệu hành vi thật.

Nếu Market Domains tập trung vào quy mô, động lực và hành vi của nhu cầu thị trường, thì Industry Domains phân tích cấu trúc ngành, mức độ cạnh tranh và khả năng hình thành lợi thế bền vững của IOC trong bối cảnh đó.

6.4 **INDUSTRY DOMAINS – LĨNH VỰC NGÀNH**

6.4.1 **Sức hấp dẫn ngành (Industry Attractiveness - Macro)**

IOC hoạt động tại giao điểm của HR Tech – EdTech – Data Platform.  
Trong ngành này, rào cản gia nhập không nằm ở công nghệ mà nằm ở dữ liệu và mạng lưới.

Thị trường hiện tại bị phân mảnh:

Job platforms có nhiều CV nhưng thiếu trải nghiệm thực tập chuẩn hóa

LMS/EdTech có nội dung nhưng không kết nối tuyển dụng

IOC đứng ở mô hình thực tập thực chiến: dự án thật, mentor, đánh giá đầu ra rõ ràng.

6.4.2 **Lợi thế cạnh tranh bền vững (Sustainable Competitive Advantage - Micro)**

Lợi thế của IOC không nằm ở việc kết nối sinh viên với doanh nghiệp, mà ở quy trình thực tập thực chiến: dự án thật, mentor, theo dõi tiến độ và đánh giá đầu ra rõ ràng trong suốt quá trình học – thực tập.

Khác với thực tập hình thức hay chỉ CV, điểm số, IOC tổ chức quy trình có thể quan sát: tiến độ, chất lượng đầu ra, đánh giá mentor; sinh viên có portfolio và báo cáo cụ thể.

Kết quả là lợi thế dựa trên quy trình và mạng lưới:

Đối thủ khó sao chép vì cần hệ sinh thái mentor, dự án và nền tảng vận hành đồng bộ.

Nhà trường và sinh viên gắn với quy trình đã chuẩn hóa và báo cáo đầu ra.

→ Lợi thế cạnh tranh dựa trên chất lượng thực tập và quy trình, không phải chỉ tính năng.

3.4 **EAM DOMAINS - LĨNH VỰC ĐỘI NGŨ**

3.4.1 **Sứ mệnh, khát vọng và và khuynh hướng chấp nhận rủi ro**

IOC 2.0 là một nỗ lực xây dựng hạ tầng đánh giá năng lực con người cho giáo dục và tuyển dụng.  
Mô hình này đòi hỏi:

Chu kỳ xây dựng dài

Vận hành phức tạp

Tương tác sâu với sinh viên, mentor và doanh nghiệp

Đội ngũ xuất thân từ đào tạo và kết nối doanh nghiệp phù hợp hơn một đội ngũ chỉ chạy theo công nghệ.

3.4.2 **Khả năng thực thi các yếu tố then chốt**

IOC đã sở hữu:

Sinh viên thật

Mentor thật

Doanh nghiệp thật

Dự án thật

Nền tảng công nghệ

Dòng dữ liệu đang hình thành

Trong mô hình này, AI không phải nút thắt.  
Nút thắt là dữ liệu hành vi thật, và IOC đã có lợi thế đó từ hệ sinh thái thực tập.

3.4.3 **Kết nối trong chuỗi giá trị**

IOC đóng vai trò là nền tảng trung tâm kết nối bốn chủ thể chính trong chuỗi giá trị gồm: sinh viên, mentor, doanh nghiệp và nhà trường.

Thông qua hệ thống quản lý dự án, đánh giá năng lực và dữ liệu học tập - làm việc, IOC giúp các bên tương tác với nhau trên cùng một nền tảng thống nhất, thay vì vận hành rời rạc như trước đây.

Nhờ đó, dòng thông tin, dòng năng lực và dòng giá trị được lưu chuyển liên tục giữa các bên, tạo ra một hệ sinh thái có mức độ gắn kết cao và khó bị thay thế.

3.4.4 **Kết luận**

Phân tích PESTEL cho thấy yếu tố Xã hội (Social) và Công nghệ (Technology) tác động mạnh nhất đến mô hình IOC 2.0. Xã hội và thị trường không còn chỉ tin vào CV, bằng cấp; sinh viên cần kinh nghiệm và bằng chứng thực tế.

Kết hợp với Market Domains, thị trường thực tập và tuyển dụng sinh viên CNTT đang thiếu mô hình thực tập thực chiến chuẩn hóa (dự án thật, mentor, đánh giá rõ ràng), đặc biệt ở phân khúc sinh viên – fresher – junior. IOC 2.0 tận dụng lực đẩy này bằng cách tổ chức quy trình thực tập thực chiến, qua đó tăng chất lượng đầu ra cho nhà trường và sinh viên, tạo lợi thế cạnh tranh dài hạn cho nền tảng.

3.5 **TOWS MATRIX - IOC 2.0**

**Mục tiêu của TOWS trong IOC 2.0**

TOWS được sử dụng để:

Xác định đòn bẩy chiến lược cốt lõi cho Flywheel tăng trưởng

Lọc bỏ các hướng đi đẹp nhưng không tạo moat

Buộc các quyết định sản phẩm phải trả lời trực tiếp rủi ro thị trường

**S–O Strategy**

**Khai thác cơ hội thị trường bằng điểm mạnh dữ liệu hành vi thực**

**Bối cảnh thị trường (Opportunity)**

Doanh nghiệp không còn tin CV

AI tuyển dụng thiếu dữ liệu hành vi chuẩn hóa

Trường học chịu áp lực chứng minh đầu ra thực chất

**S–O1. Định vị IOC là Chuẩn đánh giá Fresher dựa trên hành vi**

IOC chuẩn hóa dữ liệu thành:

Skill Profile

Work Readiness Score

Project Track Record

Tác động chiến lược

Giải quyết trực tiếp "CV không đáng tin”

Tạo North Star Metric: Số fresher được tuyển thông qua IOC

Là lõi của Flywheel: Data → Insight → Hiring → More Data

**S–O2. Trở thành nguồn dữ liệu lõi cho hệ sinh thái AI tuyển dụng**

IOC không cạnh tranh AI, mà:

Cung cấp data layer cho HR Tech, ATS, AI screening

**Tác động chiến lược**

Chuyển IOC từ Công cụ (Tiện ích đơn lẻ) sang Cơ sở hạ tầng (Nền tảng hệ thống)

Mở rộng thị trường mà không phải tự scale bán hàng

Tạo data moat dài hạn

**S–O3. Bán IOC cho nhà trường như hệ thống kiểm định đầu ra**

IOC cung cấp:

Báo cáo năng lực sinh viên

Tỷ lệ được tuyển

Điểm chuẩn chất lượng đào tạo theo doanh nghiệp

**Tác động chiến lược**

Nhà trường trở thành kênh phân phối sinh viên

Đảm bảo nguồn dữ liệu đầu vào ổn định cho Flywheel

**W–O Strategy**

**Dùng cơ hội thị trường để khắc phục điểm yếu vận hành**

**Điểm yếu chính (Weakness)**

Phụ thuộc mentor

Khó scale đánh giá thủ công

Dữ liệu dễ lệch chuẩn

**W–O1. Ứng dụng AI để giảm tải mentor**

AI chấm sơ bộ

Mentor tập trung vào đánh giá chiều sâu

**Tác động chiến lược**

Giảm chi phí vận hành

Cho phép scale số lượng sinh viên mà không hi sinh chất lượng

**W–O2. Chuẩn hóa và làm sạch dữ liệu bằng AI**

Phát hiện gian lận

Phát hiện hành vi bất thường

Chuẩn hóa thang đo

**Tác động chiến lược**

Tăng độ tin cậy dữ liệu – yếu tố sống còn của định vị chuẩn đánh giá

**W–O3. Tự động hóa báo cáo và tích hợp API**

Dashboard real-time

API cho doanh nghiệp & đối tác

**Tác động chiến lược**

IOC dễ tích hợp vào hệ thống HR hiện có

Tăng adoption B2B (input metric cho Flywheel)

**S–T Strategy**

**Dùng điểm mạnh để chống lại rủi ro cạnh tranh và sao chép**

**Thách thức (Threat)**

Các nền tảng HR khác

Nguy cơ bị sao chép tính năng

Doanh nghiệp tự xây hệ thống riêng

**S–T1. Xây dựng Data Moat**

Không xuất dữ liệu thô

Chỉ cung cấp qua profile, dashboard, API

**Hệ quả chiến lược**

Dữ liệu không thể bị bê đi

IOC giữ quyền kiểm soát insight

**S–T2. Lock-in doanh nghiệp bằng lịch sử tuyển dụng**

Điểm chuẩn nội bộ

Tracking chất lượng tuyển theo thời gian

**Hệ quả chiến lược**

Retention doanh nghiệp trở thành Moat Metric

Chi phí chuyển đổi cao

**S–T3. Chuẩn hóa format dữ liệu thành chuẩn thị trường**

Khi IOC thành chuẩn, thay thế = đổi cả hệ thống

**Hệ quả chiến lược**

IOC không cần chạy đua tính năng

Thị trường tự bảo vệ IOC

**W–T Strategy**

**Giảm điểm yếu và né rủi ro bằng chiến lược tập trung**

**W–T1. Tập trung phân khúc hẹp**

IT fresher

Digital roles

Trường đối tác

**Chiến lược**

Bảo vệ chất lượng dữ liệu

**W–T2. Tăng trưởng bằng mạng lưới 3 bên**

Sinh viên từ trường

Doanh nghiệp từ nhu cầu tuyển

Mentor từ hệ sinh thái

**Chiến lược**

Thay vì coi khách hàng là **điểm cuối** của một dây chuyền sản xuất, mô hình Flywheel biến họ thành trọng tâm và là nguồn năng lượng vĩnh cửu thúc đẩy doanh nghiệp tăng trưởng

Giảm chi phí acquisition

**W–T3. Ưu tiên chất lượng dữ liệu hơn số lượng**

Không scale nếu độ tin cậy giảm

**Nguyên tắc cốt lõi**

IOC thắng bằng sự tin tưởng, không phải khối lượng giao dịch

3.6 **COMPETITIVE LANDSCAPE & JOBS-TO-BE-DONE (IOC 2.0)**

3.6.1 **IOC thực sự đang cạnh tranh trong ''job'' nào của thị trường?**

IOC 2.0 không cạnh tranh trực tiếp trong thị trường tuyển dụng, cũng không nằm trọn trong EdTech hay HR Tech. IOC cạnh tranh trong một job có tính cấu trúc của thị trường lao động trẻ, tồn tại lâu dài nhưng chưa được giải quyết trọn vẹn: **''Tạo ra và xác thực bằng chứng năng lực làm việc thực tế cho sinh viên CNTT khi họ chưa có kinh nghiệm chính thức.”**

Job này phát sinh từ sự lệch pha hệ thống giữa ba chủ thể chính:

Sinh viên cần được công nhận năng lực để được tuyển dụng

Doanh nghiệp cần giảm rủi ro khi tuyển fresher/junior

Nhà trường chịu áp lực chứng minh chất lượng đầu ra bằng dữ liệu

CV, bảng điểm, chứng chỉ và bài test hiện nay chỉ đóng vai trò proxy gián tiếp, không phản ánh hành vi làm việc thực tế trong môi trường dự án. Vì vậy, job "đánh giá năng lực khi chưa có kinh nghiệm” vẫn đang bị phục vụ kém (underserved) trên toàn thị trường.

IOC chọn cạnh tranh trực diện vào job bị bỏ trống này, thay vì cạnh tranh quy mô hay giá.

3.6.2 **Phân tích cạnh tranh theo JTBD**

**a. Sinh viên CNTT – người tạo ra dữ liệu nhưng không kiểm soát được giá trị của nó**

Job thực sự của sinh viên không phải là tìm việc, mà là: ''**Chứng minh rằng tôi có thể làm việc thật trong môi trường doanh nghiệp.”**

Các giải pháp hiện tại mà sinh viên sử dụng gồm CV, GitHub, portfolio cá nhân, chứng chỉ online hoặc thực tập. Tuy nhiên, các giải pháp này đều có điểm chung:

Dữ liệu năng lực do sinh viên tự khai

Không chuẩn hóa

Không có xác thực hành vi kéo dài theo thời gian

Hệ quả là nỗ lực học tập và làm dự án không chuyển hóa thành lợi thế tuyển dụng, khiến sinh viên rơi vào trạng thái underserved.

IOC giải quyết job này bằng cách đặt hệ thống đo lường ngay tại nơi sinh viên làm việc, thay vì yêu cầu sinh viên trình bày lại năng lực sau khi kết thúc quá trình.

**b. Doanh nghiệp tuyển fresher/junior – bên chịu chi phí sai lầm cao nhất**

Job cốt lõi của doanh nghiệp không phải là tuyển được người, mà là: ''**Giảm rủi ro tuyển sai khi ứng viên chưa có lịch sử làm việc.”**

Job board, phỏng vấn, test kỹ thuật và AI screening chỉ giúp lọc nhanh, nhưng không giúp dự đoán năng lực làm việc thực tế. Sai lệch thường chỉ lộ ra sau 1–3 tháng, khi doanh nghiệp đã tốn chi phí onboarding và đào tạo.

Vì không có dữ liệu hành vi trước tuyển dụng, doanh nghiệp buộc phải ra quyết định dựa trên cảm tính phỏng vấn và tín hiệu ngắn hạn.

IOC cạnh tranh trực tiếp ở điểm này bằng cách cho doanh nghiệp tiếp cận dữ liệu hành vi đã xảy ra, bao gồm tiến độ, chất lượng, kỷ luật và phối hợp nhóm trong dự án thật, từ đó chuyển quyết định tuyển dụng từ cảm tính sang dựa trên dữ liệu.

**c. Nhà trường – bên sở hữu sinh viên nhưng thiếu công cụ theo dõi chất lượng thực tập**

Job của nhà trường không chỉ là tổ chức thực tập, mà là: ''**Chứng minh và cải thiện chất lượng đầu ra của sinh viên.”**

Các công cụ hiện tại như báo cáo thực tập thủ công, khảo sát sau tốt nghiệp hay tỷ lệ có việc làm chỉ phản ánh kết quả cuối, không phản ánh năng lực trong quá trình. Điều này khiến nhà trường khó cải tiến chương trình đào tạo và khó thuyết phục doanh nghiệp hợp tác sâu.

IOC cung cấp cho nhà trường báo cáo và theo dõi chất lượng thực tập liên tục, giúp chuyển từ đánh giá cảm tính sang đánh giá dựa trên bằng chứng (tiến độ, đánh giá mentor, kết quả dự án), đồng thời nâng uy tín đầu ra.

3.6.3 **Đối thủ cạnh tranh trực tiếp và gián tiếp của IOC**

IOC không có đối thủ giống hệt, nhưng chịu cạnh tranh gián tiếp từ nhiều nhóm giải pháp, mỗi nhóm chỉ giải quyết một phần của job:

**Job board & CV platform** (TopCV, VietnamWorks, LinkedIn): giải quyết kết nối và hiển thị hồ sơ, nhưng không tổ chức thực tập thực chiến hay đánh giá đầu ra chuẩn hóa; ứng viên chủ yếu tự khai.

**EdTech & chứng chỉ online** (Coursera, Udemy): cung cấp kiến thức và chứng nhận, nhưng không gắn với hành vi làm việc trong môi trường doanh nghiệp.

**Bootcamp / trung tâm đào tạo** (CodeGym, Techmaster…): đào tạo kỹ năng thực hành, nhưng thiếu chuẩn dữ liệu dùng chung cho nhiều doanh nghiệp và không theo dõi năng lực trong bối cảnh làm việc kéo dài.

**HR Tech & AI screening** (HireVue, bài test kỹ thuật): cải thiện khâu lọc nhanh, nhưng dựa trên dữ liệu đầu vào ngắn hạn, không phản ánh quá trình làm việc thực tế.


Tất cả các đối thủ trên chỉ giải quyết công việc ở trước hoặc sau giai đoạn làm việc thực sự, nhưng không kiểm soát được quá trình sinh vật liệu năng lực - đây là trung tâm của vấn đề. IOC 2.0 khác ở chỗ nó đặt hệ thống đo lường ngay tại nơi sinh viên làm việc, không yêu cầu trình bày sinh viên trình bày lại năng lượng sau khi kết thúc.  
Chiến lược của IOC là Dominant Strategy: không rẻ hơn theo đơn giá, nhưng giảm chi phí sai dùng hạn chế cho toàn hệ thống (tuyển sai, đào tạo lại, thất nghiệp, mất uy tín).

3.6.4 **Vị trí chiến lược của IOC trong ma trận JTBD**

Cả ba nhóm khách hàng đều đang ở trạng thái underserved, do đó IOC không theo chiến lược disruptive (rẻ hơn) hay sustaining (cải tiến dần). Chiến lược phù hợp là Dominant Strategy:

IOC không rẻ hơn theo đơn giá, nhưng giảm chi phí sai lầm dài hạn cho toàn hệ thống:

Giảm chi phí tuyển sai và đào tạo lại cho doanh nghiệp

Giảm chi phí thất nghiệp tiềm ẩn cho sinh viên

Giảm chi phí mất uy tín đầu ra cho nhà trường

3.6.5 **Flywheel tăng trưởng của IOC 2.0**

Flywheel tăng trưởng của IOC 2.0 được xây dựng xoay quanh quy trình thực tập thực chiến: càng nhiều sinh viên và trường tham gia, quy trình càng được chuẩn hóa và uy tín càng tăng, từ đó thu hút thêm đối tác và người dùng.

Ở giai đoạn Attract, IOC thu hút sinh viên thông qua giá trị cốt lõi là được tham gia dự án thực tế có mentor và đầu ra gắn với tuyển dụng, đồng thời thu hút doanh nghiệp nhờ khả năng giảm rủi ro khi tuyển fresher. Trong các chương trình pilot, mỗi cohort dự kiến thu hút 200–300 sinh viên/năm thông qua hợp tác trực tiếp với 3–5 trường đại học và 5–7 doanh nghiệp đối tác, tương đương 500–700 sinh viên/năm ở năm đầu khi triển khai 2–3 chương trình song song.

Sang giai đoạn Activate, sinh viên được kích hoạt khi bắt đầu tham gia dự án thật, làm việc theo sprint và được mentor đánh giá định kỳ. Dựa trên benchmark từ các mô hình EdTech – Work-based learning và các chương trình internship có cấu trúc, tỷ lệ sinh viên active mục tiêu đạt 60–70% số sinh viên onboard, với completion rate 50–60% cho toàn bộ chương trình. Trung bình mỗi sinh viên tạo ra 30–50 datapoint năng lực (kỹ năng chuyên môn, tiến độ, hành vi làm việc, feedback mentor).

Ở giai đoạn Adopt, nhà trường và sinh viên bắt đầu dựa vào quy trình và báo cáo IOC (tiến độ, đánh giá mentor, kết quả dự án) để đánh giá chất lượng thực tập. Mục tiêu pilot: activation rate và completion rate ổn định, mức độ hài lòng của trường và sinh viên tăng.

Khi chuyển sang Adore, giá trị được củng cố thông qua chất lượng đầu ra và báo cáo rõ ràng theo cohort/trường; nhà trường và sinh viên gắn với quy trình đã chuẩn hóa, tạo switching cost. Mục tiêu: tỷ lệ trường/sinh viên quay lại và mở rộng quy mô triển khai tăng.

Cuối cùng, ở giai đoạn Advocate, trường mở rộng triển khai và sinh viên giới thiệu khóa sau. Mỗi vòng lặp cải thiện quy trình và uy tín, từ đó tăng trải nghiệm và Flywheel tự tăng tốc khi quy mô và mạng lưới đủ lớn.

3.6.6 **Triển khai và tối ưu hóa (Execution & Optimization)**

Về roadmap triển khai, trong Quý 1, IOC tập trung hoàn thiện MVP và triển khai 2–3 chương trình pilot, quy mô 300–500 sinh viên, nhằm đo lường Product–Market Fit. Các chỉ số trọng tâm gồm activation rate ≥ 60%, completion rate ≥ 50% và ít nhất 10 doanh nghiệp sử dụng báo cáo IOC ở mức thử nghiệm.

Trong Quý 2–3, hệ thống được tối ưu dựa trên phản hồi thực tế từ pilot. Quy mô mở rộng lên 1.000–1.500 sinh viên, đồng thời chuẩn hóa khung đánh giá và dashboard cho nhà trường. Mục tiêu: tăng completion rate, mức độ hài lòng và số trường đối tác.

Từ Quý 4 trở đi, IOC mở rộng mạng lưới đối tác trường, đa dạng hóa nguồn doanh thu theo B2B (phí triển khai thực tập, báo cáo đầu ra) và B2C (gói sinh viên). Quy mô kỳ vọng đạt 2.000–3.000 sinh viên/năm.

Về Monitoring & Iteration, IOC duy trì đánh giá hàng tháng với các chỉ số vận hành cốt lõi: activation rate, completion rate, thời gian mentor phản hồi. Đánh giá hàng quý tập trung vào mức độ hài lòng của nhà trường và sinh viên (NPS mục tiêu ≥ +30), tỷ lệ hoàn thành dự án và tỷ lệ sinh viên được tuyển. Đánh giá hàng năm dùng để cập nhật JTBD, điều chỉnh positioning và tối ưu flywheel dựa trên phản hồi và kết quả thực tế.

3.6.7 **Kết luận phân tích cạnh tranh**

IOC 2.0 cạnh tranh trong một job mang tính cấu trúc của thị trường lao động trẻ: đánh giá và chứng minh năng lực làm việc khi chưa có kinh nghiệm. Thị trường hiện có nhiều giải pháp thay thế từng phần, nhưng chưa có nền tảng nào tổ chức trọn vẹn thực tập thực chiến (dự án thật, mentor, đánh giá có xác thực).

Bằng cách biến thực tập và dự án thực tế thành quy trình chuẩn hóa với đánh giá rõ ràng, IOC chiếm vị trí trung tâm của job đó và xây dựng lợi thế cạnh tranh bền vững dựa trên quy trình và mạng lưới.

4\. **Phân tích nội tại và bối cảnh cạnh tranh của dự án (SWOT & TOWS) – IOC 2.0**

4.1 **Phân tích SWOT dự án IOC 2.0**

Phân tích SWOT được sử dụng nhằm đánh giá toàn diện năng lực nội tại của IOC 2.0 trong mối tương quan với bối cảnh thị trường thực tập – tuyển dụng nhân sự trẻ hiện nay. Mục tiêu của phân tích này không chỉ để liệt kê điểm mạnh – yếu, mà để làm cơ sở định hướng chiến lược triển khai và tăng trưởng trong các giai đoạn tiếp theo.

**Strengths – Điểm mạnh nội tại**

Điểm mạnh cốt lõi của IOC 2.0 nằm ở cách dự án tái thiết kế hoạt động thực tập. Thay vì coi thực tập là một hoạt động mang tính thủ tục, IOC tổ chức thực tập như một quá trình làm việc có thể theo dõi, đo lường và đánh giá được.

Thông qua việc phân công công việc theo dự án, ghi nhận tiến độ, kết quả đầu ra và đánh giá của mentor, IOC tạo ra quy trình và báo cáo phản ánh chất lượng thực tập thực tế. Đây là giá trị mà thực tập hình thức hay chỉ CV, bảng điểm hiện nay không mang lại.

Bên cạnh đó, IOC triển khai mô hình hợp tác đồng thời với nhà trường – doanh nghiệp – mentor, giúp dữ liệu sinh viên không chỉ mang tính học thuật mà còn có giá trị sử dụng trong tuyển dụng.

**Weaknesses – Điểm yếu nội tại**

Ở giai đoạn hiện tại, IOC vẫn phụ thuộc nhiều vào kỷ luật vận hành của sinh viên và mentor. Nếu việc cập nhật tiến độ, đánh giá hoặc phản hồi không được thực hiện đầy đủ, dữ liệu thu thập được sẽ thiếu độ sâu và độ tin cậy.

Ngoài ra, do nguồn lực còn hạn chế, IOC mới chỉ triển khai được ở quy mô nhỏ (pilot). Việc mở rộng nhanh có nguy cơ làm giảm chất lượng dữ liệu nếu quy trình và công cụ hỗ trợ chưa được hoàn thiện.

Có thể nói, dự án đang ở trạng thái chưa tối ưu hóa hoàn toàn, chấp nhận đánh đổi quy mô để giữ chất lượng trong giai đoạn đầu.

**Opportunities – Cơ hội từ môi trường bên ngoài**

Hiện nay, nhiều doanh nghiệp gặp khó khăn khi tuyển dụng sinh viên mới ra trường do thiếu dữ liệu đánh giá năng lực thực tế. Đồng thời, các trường đại học cũng chịu áp lực ngày càng lớn trong việc chứng minh chất lượng đầu ra và khả năng có việc làm của sinh viên.

Trong bối cảnh đó, một hệ thống có khả năng cung cấp dữ liệu thực tập có cấu trúc, liên tục và có xác thực như IOC được xem là phù hợp với nhu cầu thị trường. Ngoài ra, xu hướng ứng dụng công nghệ và dữ liệu trong quản lý đào tạo và tuyển dụng đang tạo điều kiện thuận lợi để IOC được chấp nhận như một công cụ hỗ trợ chính thức.

**Threats – Thách thức từ môi trường bên ngoài**

Một số hệ thống quản lý đào tạo hoặc nền tảng tuyển dụng hiện nay có khả năng mở rộng sang mảng quản lý thực tập nếu nhận thấy tiềm năng. Ngoài ra, nếu IOC không chứng minh được giá trị rõ ràng cho doanh nghiệp trong việc giảm rủi ro tuyển dụng, khả năng duy trì hợp tác dài hạn sẽ bị ảnh hưởng.

Bên cạnh đó, việc xử lý và bảo mật thông tin sinh viên đặt ra yêu cầu về quy trình và công nghệ, tạo áp lực cho đội ngũ trong quá trình mở rộng.

4.2 **Ma trận TOWS – Định hướng chiến lược từ SWOT**

Từ phân tích SWOT, dự án IOC 2.0 xây dựng các chiến lược kết hợp nhằm định hướng triển khai phù hợp với năng lực hiện tại và bối cảnh thị trường.

**Bảng TOWS Matrix – IOC 2.0**


4.3 **Kết luận phân tích SWOT & TOWS**

Phân tích SWOT cho thấy IOC 2.0 có lợi thế rõ ràng về quy trình thực tập thực chiến (dự án thật, mentor, đánh giá), nhưng vẫn đối mặt với thách thức về quy mô và vận hành. Các chiến lược rút ra từ ma trận TOWS giúp dự án tập trung khai thác điểm mạnh cốt lõi, đồng thời kiểm soát rủi ro trong giai đoạn phát triển ban đầu.

Việc lựa chọn tăng trưởng có kiểm soát và ưu tiên chất lượng dữ liệu được xem là định hướng phù hợp để IOC xây dựng nền tảng vững chắc trước khi mở rộng quy mô trong các giai đoạn tiếp theo.

**Đánh giá nội tại & giới hạn vận hành của IOC 2.0 (APM perspective)**

Từ góc độ nội tại, IOC 2.0 không gặp rào cản lớn ở việc thu hút người dùng, mà ở khả năng duy trì chất lượng đánh giá và quy trình khi quy mô tăng. Lợi thế cốt lõi nằm ở việc kiểm soát toàn bộ quá trình thực tập: thiết kế dự án, phân bổ công việc, theo dõi tiến độ đến đánh giá chéo giữa mentor và hệ thống. Nút nghẽn vận hành: chất lượng phụ thuộc vào nhóm dự án và mentor chủ chốt. Cần chuẩn hóa quy trình đánh giá và tối ưu vận hành để mở rộng mà không suy giảm chất lượng.

Ở giai đoạn đầu, IOC chấp nhận tăng trưởng có kiểm soát để ưu tiên học cách vận hành mô hình hơn là mở rộng nhanh. Điều này phản ánh một lựa chọn chiến lược có chủ đích: hy sinh tốc độ để đổi lấy dữ liệu chuẩn và khả năng lặp lại. Nội tại hiện tại cho phép IOC scale hiệu quả trong biên độ nhỏ đến trung bình, nơi đội ngũ vẫn trực tiếp quan sát được chất lượng đầu ra. Việc mở rộng lên quy mô lớn chỉ nên diễn ra sau khi các cơ chế tự động hóa và kiểm soát sai lệch đã chứng minh được hiệu quả.

Nói cách khác, IOC 2.0 không phải mô hình “đánh nhanh thắng nhanh”, mà là mô hình xây nền dữ liệu trước khi khai thác giá trị. Thành công hay thất bại của dự án không nằm ở việc có bao nhiêu người dùng, mà nằm ở việc dữ liệu sinh ra có đủ tin để trở thành căn cứ ra quyết định tuyển dụng hay không.

5\. **Doanh thu, Chi phí và Lợi nhuận dự tính**

5.1 **Nguồn doanh thu**

Mô hình doanh thu của IOC 2.0 được xây dựng đa phía (Multi-sided Revenue), lấy giá trị thực tập thực chiến và báo cáo đầu ra làm lõi.

_(Trong kế hoạch hiện tại không đặt trọng tâm doanh thu từ doanh nghiệp hay từ các gói dữ liệu năng lực.)_

**Từ phía Nhà trường:**

**Phí Dashboard / báo cáo đầu ra:** Cung cấp hệ thống báo cáo để nhà trường chứng minh chất lượng đào tạo và phục vụ công tác kiểm định.

**Phí dịch vụ triển khai thực tập chuẩn hóa:** Thu phí trên việc vận hành các chương trình thực tập theo dự án thật cho sinh viên của trường.

**Từ phía Sinh viên (B2C):**

**Gói Premium (AI Mentor & tính năng bổ trợ):** Thu phí từ sinh viên có nhu cầu sử dụng AI Mentor và các tính năng hỗ trợ cá nhân hóa

5.2 **Cơ cấu chi phí**

Cấu trúc chi phí của IOC 2.0 được tối ưu hóa thông qua công nghệ để đảm bảo khả năng mở rộng (Scalability)

**Chi phí cố định (Fixed Costs)**

**Nhân sự nòng cốt:** Chi phí duy trì đội ngũ quản trị sản phẩm (PO, APM) và kỹ thuật (AI, Developers, UI/UX) để phát triển và nâng cấp hệ thống.

**Vận hành hạ tầng:** Chi phí duy trì nền tảng và bảo mật thông tin.

**Chi phí biến đổi (Variable Costs):**

**Chi phí công nghệ AI:** Chi trả cho các mô hình ngôn ngữ lớn (LLM) và hạ tầng tính toán phục vụ AI Agent giao việc và chấm điểm. Đặc điểm: Chi phí này không tăng tuyến tính theo quy mô người dùng, giúp tối ưu biên lợi nhuận khi mở rộng.

**Thù lao Mentor:** Chi trả cho các chuyên gia xác thực tại các điểm then chốt trong dự án. AI Agent được ứng dụng để giảm tải các công việc lặp lại, từ đó giảm thiểu chi phí thuê mentor con người trên mỗi sinh viên.

**Sales & Marketing:** Chi phí tiếp cận và thiết lập quan hệ đối tác với 14 trường và 7 doanh nghiệp hiện tại, cũng như mở rộng mạng lưới 3 bên trong tương lai

Dựa trên mô hình kinh doanh Business Model Canvas của dự án IOC 2.0, quy mô thị trường mục tiêu thực tế (SOM) và cơ cấu đội ngũ, dưới đây là bảng dự tính tài chính chi tiết cho năm vận hành đầu tiên.

Bảng tính này dựa trên mục tiêu phục vụ 300 - 500 sinh viên, 10 - 30 doanh nghiệp và 5 - 10 trường đối tác trong giai đoạn đầu.

**Bảng dự tính tài chính IOC 2.0 (Năm 1)**


Các yếu tố chiến lược ảnh hưởng đến bảng tính:

**Tối ưu hóa chi phí bằng AI (Scalability):** Lợi thế của IOC là ứng dụng AI Agent để tự động giao việc và chấm điểm sơ bộ, giúp chi phí vận hành không tăng tuyến tính theo số lượng sinh viên. Điều này cho phép dự án mở rộng quy mô (scale) mạnh mẽ trong các giai đoạn sau mà vẫn giữ được cấu trúc nhân sự tinh gọn.

**Giá trị kinh tế (Viability):** Doanh nghiệp sẵn sàng chi trả phí tuyển dụng vì IOC giúp giải quyết "điểm đau" chi phí tuyển sai (30-60 triệu VNĐ) và rút ngắn thời gian đào tạo lại từ 3-6 tháng xuống còn 1-2 tuần.

**Hào kỹ thuật dữ liệu (Data Moat):** Lợi nhuận bền vững không đến từ phí dịch vụ đơn thuần mà từ việc tích lũy Dữ liệu năng lực độc quyền. Khi số lượng datapoint tích lũy vượt mốc 50.000 - 70.000/năm, độ chính xác của AI sẽ tăng lên, giúp giảm chi phí kiểm soát thủ công và tạo rào cản khó sao chép cho đối thủ.

**Chiến lược nguồn vốn:** Trong năm đầu, dự án tập trung vào việc xây nền dữ liệu hơn là tối đa hóa lợi nhuận ngay lập tức, nhằm đảm bảo dữ liệu sinh ra đủ tin cậy để trở thành căn cứ ra quyết định tuyển dụng

5.3 **Lợi nhuận**

Đối với dự án IOC 2.0, lợi nhuận không được xem là mục tiêu duy nhất hay sứ mệnh cốt lõi, nhưng lại là yếu tố sống còn để duy trì và hiện thực hóa tầm nhìn dài hạn. Dưới đây là cách dự án nhìn nhận và tạo ra lợi nhuận dựa trên các nguồn tài liệu:

**Triết lý về lợi nhuận: "Phương tiện chứ không phải sứ mệnh"**

Trong tinh thần khởi nghiệp của dự án, lợi nhuận được hiểu là phương tiện để thực hiện sứ mệnh cải thiện thế giới và tạo ra giá trị, thay vì chỉ là hoạt động kinh doanh trục lợi. Nếu động lực chính chỉ là "kiếm tiền", tổ chức sẽ rất khó để vượt qua những thách thức tất yếu trong quá trình phát triển. IOC 2.0 tồn tại để giải quyết lỗ hổng thực tập hình thức và thiếu bằng chứng đầu ra trên thị trường lao động trẻ, và lợi nhuận là kết quả của việc giải quyết tốt vấn đề đó.

**Mô hình tạo dòng tiền (Revenue Streams)**

Lợi nhuận được hình thành từ mô hình doanh thu đa phía, tập trung vào giá trị thực tập thực chiến và báo cáo đầu ra:

• Từ nhà trường: Phí triển khai thực tập chuẩn hóa, phí Dashboard/báo cáo đầu ra.
• Từ sinh viên: Gói Premium (AI Mentor, tính năng bổ trợ).

**Tối ưu hóa cấu trúc chi phí bằng AI**

Để tối đa hóa lợi nhuận, IOC 2.0 tập trung vào việc giảm chi phí vận hành thông qua công nghệ:

• Sử dụng AI để scale: AI Agent đảm nhiệm việc giao task, hỗ trợ kỹ thuật và chấm điểm sơ bộ. Điều này giúp chi phí không tăng tuyến tính theo số lượng sinh viên, cho phép dự án mở rộng quy mô (scale) mà không cần đầu tư quá nhiều vào nhân sự quản lý.

• Giảm tải cho Mentor: Mentor con người chỉ tham gia vào các điểm then chốt để xác thực chuyên sâu, giúp giảm chi phí thù lao chuyên gia vốn rất đắt đỏ.

**Tính bền vững và khả năng sinh lời lâu dài (Viability)**

Lợi nhuận của dự án được bảo vệ và tăng trưởng dựa trên các giả định về tính khả dụng (Viability):

• Giảm rủi ro và tăng chất lượng đầu ra: Nhà trường và sinh viên sẵn sàng chi trả cho IOC vì quy trình thực tập thực chiến và báo cáo rõ ràng giúp nâng uy tín và tăng cơ hội việc làm.

• Lợi thế quy trình và mạng lưới: Khi quy mô và mạng lưới đối tác đủ lớn, đối thủ khó sao chép vì cần hệ sinh thái mentor, dự án và nền tảng vận hành đồng bộ.

• Khóa khách hàng (Lock-in): Doanh nghiệp và nhà trường khó rời bỏ nền tảng khi toàn bộ quy trình đánh giá và lịch sử tuyển dụng đã gắn liền với dữ liệu của IOC, tạo ra nguồn thu ổn định và bền vững.

Tóm lại, lợi nhuận của IOC 2.0 đến từ việc giúp khách hàng làm việc tốt hơn và rẻ hơn (Chiến lược Thống trị - Dominant Strategy). Bằng cách giảm chi phí sai lầm dài hạn cho toàn hệ thống, dự án tự đảm bảo khả năng sinh lời bền vững so với chi phí đầu tư

6\. **Chiến lược phát triển**

6.1 **Định hướng chung của chiến lược phát triển**

Chiến lược phát triển của IOC 2.0 không được xây dựng theo hướng mở rộng nhanh về quy mô người dùng ngay từ đầu, mà theo logic củng cố chất lượng quy trình và đánh giá. Trong bối cảnh dự án đã vận hành với khoảng 1.500 sinh viên, bài toán trọng tâm của giai đoạn tiếp theo là nâng cao chất lượng thực tập, độ tin cậy đánh giá và sự hài lòng của nhà trường và sinh viên.

Lộ trình phát triển được chia thành các giai đoạn kế tiếp nhau, mỗi giai đoạn giải quyết một câu hỏi chiến lược cốt lõi trước khi chuyển sang giai đoạn tiếp theo.

6.2 **Giai đoạn 1 (0–12 tháng): Củng cố quy trình và độ tin cậy đánh giá**

Trong giai đoạn đầu, mục tiêu trung tâm là kiểm chứng rằng quy trình thực tập (dự án thật, mentor, đánh giá) tạo ra kết quả đáng tin cậy và có ý nghĩa cho nhà trường và sinh viên.

IOC ưu tiên chuẩn hóa khung đánh giá (tiến độ, chất lượng đầu ra, đánh giá mentor), giảm độ lệch giữa các nguồn đánh giá (mentor, hệ thống, AI). Sinh viên nhận được phản hồi rõ ràng về năng lực và portfolio; nhà trường có báo cáo đầu ra minh bạch.

Thành công của giai đoạn này được đo bằng mức độ tin tưởng của trường và sinh viên vào quy trình và báo cáo, completion rate và mức độ hài lòng.

6.3 **Giai đoạn 2 (12–24 tháng): Chuẩn hóa và mở rộng có kiểm soát**

Sau khi quy trình và đánh giá được kiểm chứng, IOC bước sang giai đoạn chuẩn hóa và mở rộng có kiểm soát. Trọng tâm là chuẩn hóa cách đánh giá được cấu trúc và báo cáo trong nhiều bối cảnh (cohort, trường, loại dự án).

IOC tập trung hoàn thiện báo cáo đầu ra đủ chuẩn để nhà trường so sánh và sử dụng cho kiểm định. Việc mở rộng quy mô được thực hiện có chọn lọc để đảm bảo chất lượng đánh giá không suy giảm khi số người tham gia tăng.

6.4 **Giai đoạn 3 (từ 24 tháng trở đi): Mở rộng hệ sinh thái**

Khi quy trình đã đủ tin cậy và chuẩn hóa, IOC bước vào giai đoạn mở rộng hệ sinh thái. IOC không chỉ là nền tảng B2C cho sinh viên mà dần trở thành đối tác chuẩn thực tập thực chiến cho nhiều trường và nhóm đối tượng.

Đối với sinh viên, kinh nghiệm và portfolio tích lũy qua IOC giúp tăng lợi thế khi ứng tuyển. Đối với nhà trường, IOC cung cấp quy trình và báo cáo đầu ra phục vụ kiểm định và uy tín. Chiến lược hướng đến tăng trưởng bền vững dựa trên quy trình và mạng lưới.

6.5 **Kỳ vọng và mốc thời gian thực hiện**

Tổng thể, chiến lược phát triển của IOC 2.0 kỳ vọng xây dựng được một nền tảng thực tập thực chiến chuẩn hóa, đáng tin cậy và tạo giá trị lâu dài cho nhà trường và sinh viên. Việc phân chia rõ các giai đoạn giúp tránh tăng trưởng nóng và đảm bảo mỗi bước mở rộng dựa trên chất lượng quy trình vững chắc.

7\. **Chiến lược nguồn vốn**

8\. **Nguồn nhân lực**

**9.1. Đội ngũ dự án nòng cốt**

Dự án IOC 2.0 hiện được triển khai bởi một đội ngũ dự án gồm các thành viên có chuyên môn về quản lý sản phẩm, phát triển phần mềm và thiết kế trải nghiệm người dùng. Đội ngũ được tổ chức theo mô hình linh hoạt, trong đó một số thành viên đảm nhiệm đa vai trò nhằm tối ưu nguồn lực và đảm bảo tiến độ trong giai đoạn nâng cấp sản phẩm lên phiên bản 2.0.

**Trần Doãn Đô** giữ vai trò **Product Owner (PO) kiêm Scrum Master (SM) và Nhà phát triển** của dự án. Anh chịu trách nhiệm quản lý product backlog, định hướng phát triển sản phẩm, điều phối hoạt động của nhóm phát triển theo phương pháp Agile/Scrum, tổ chức các cuộc họp lập kế hoạch, sơ kết và đánh giá sprint. Bên cạnh vai trò quản lý, anh trực tiếp tham gia vào các công việc lập trình, phân tích thiết kế hệ thống và kiểm thử, đảm bảo sự thống nhất giữa định hướng sản phẩm và triển khai kỹ thuật.

Nhóm **phát triển kỹ thuật** của dự án bao gồm:

**Trần Đăng Khoa**, Nhà phát triển, phụ trách xây dựng và phát triển các chức năng của hệ thống IOC 2.0.

**Phan Đình Tạc**, Nhà phát triển, tham gia triển khai các module kỹ thuật, hỗ trợ hoàn thiện và tối ưu hệ thống.

Các thành viên này chịu trách nhiệm đảm bảo nền tảng vận hành ổn định, đáp ứng các yêu cầu nghiệp vụ phát sinh trong quá trình dự án được triển khai và sử dụng thực tế với số lượng lớn sinh viên.

Ở mảng thiết kế trải nghiệm người dùng, **Đỗ Ngọc Dung** đảm nhiệm vai trò **Thiết kế UI/UX**. Bên cạnh việc thiết kế giao diện và luồng trải nghiệm cho người dùng, nhân sự này còn có sự liên kết với **đội marketing**, giúp sản phẩm đảm bảo tính nhất quán giữa trải nghiệm sử dụng và hoạt động truyền thông, đặc biệt trong bối cảnh IOC 2.0 hướng tới đối tượng khách hàng B2C là sinh viên.

**Hoàng Phương Thúy** tham gia dự án với vai trò **Associate Product Manager (APM)**. Vai trò này tập trung vào việc hỗ trợ quản lý sản phẩm, bao gồm phân tích yêu cầu, nghiên cứu hành vi người dùng, theo dõi và đánh giá các chỉ số sản phẩm, cũng như phối hợp giữa đội kỹ thuật và các bên liên quan. Sự hiện diện của APM giúp tăng chiều sâu quản trị sản phẩm và hỗ trợ Product Owner trong việc đảm bảo sản phẩm phát triển đúng với Product Vision và Product Strategy đã xác định.

**9.2. Các bên liên quan và sự hậu thuẫn từ bên ngoài đội dự án**

Ngoài đội ngũ dự án trực tiếp, IOC 2.0 nhận được sự phối hợp và hỗ trợ từ nhiều cá nhân đại diện cho các phòng ban chức năng trong tổ chức, đóng vai trò là các bên liên quan quan trọng trong quá trình triển khai.

**Nguyễn Lâm Anh**, đầu mối làm việc với **phòng Marketing**, hỗ trợ các hoạt động truyền thông, cung cấp yêu cầu nghiệp vụ liên quan đến nội dung và phối hợp đánh giá các chức năng của sản phẩm.

**Cao Thảo My**, đầu mối làm việc với **phòng Sales**, tham gia cung cấp yêu cầu từ góc độ thị trường, phối hợp triển khai và đánh giá mức độ phù hợp của sản phẩm với nhu cầu khách hàng.

**Nguyễn Văn Luận**, đầu mối làm việc với **Trung tâm Đào tạo**, hỗ trợ kết nối IOC 2.0 với hoạt động đào tạo và thực tập, đảm bảo dữ liệu thu thập phản ánh đúng quá trình học tập và làm việc của sinh viên.

**Nguyễn Viết Lâm**, đại diện **Ban Giám đốc**, tham gia cung cấp yêu cầu và ra quyết định đối với các vấn đề quan trọng liên quan đến định hướng và phạm vi dự án.

**Nguyễn Hương Trà**, đầu mối **phòng Kế toán**, hỗ trợ duyệt và chi các khoản chi phí phục vụ cho quá trình triển khai dự án.

**Phạm Bùi Hồng Hạnh**, đầu mối **phòng Nhân sự – Hành chính**, hỗ trợ truyền thông nội bộ, tuyển dụng và sắp xếp nhân sự khi dự án có nhu cầu mở rộng.

Sự tham gia của các cá nhân này tạo nên một mạng lưới phối hợp liên phòng ban, giúp IOC 2.0 không chỉ là một dự án kỹ thuật mà còn gắn chặt với hoạt động đào tạo, kinh doanh và vận hành của tổ chức.

**9.3. Định hướng mở rộng nguồn nhân lực trong tương lai**

Với đội ngũ hiện tại, IOC 2.0 đủ năng lực vận hành và nâng cấp sản phẩm trong giai đoạn hiện nay, khi dự án đã có khoảng 1.500 sinh viên. Trong các giai đoạn tiếp theo, dự án có định hướng mở rộng nhân sự ở các mảng như nghiên cứu người dùng và đảm bảo chất lượng hệ thống, nhằm chuẩn hóa quy trình và mở rộng quy mô bền vững.

9\. **Thành tựu của dự án IOC (tính đến thời điểm hiện tại)**

Sau quá trình triển khai và vận hành thực tế, dự án IOC đã đạt được một số kết quả bước đầu, phản ánh mức độ tiếp cận thị trường, khả năng vận hành hệ thống và tiềm năng phát triển trong giai đoạn nâng cấp lên IOC 2.0.

Trước hết, về quy mô người dùng, hệ thống IOC hiện ghi nhận 1.489 sinh viên đã được đưa vào nền tảng. Trong số đó, 730 sinh viên đang tham gia thực tập, cho thấy IOC không chỉ dừng ở việc đăng ký tài khoản mà đã được sử dụng trong bối cảnh thực tế. Đồng thời, 195 sinh viên đã hoàn thành kỳ thực tập, tương ứng với 195 nhóm thực tập, tạo ra tập dữ liệu thực tế ban đầu về quá trình làm việc, mức độ tham gia và kết quả đầu ra của sinh viên.

Về mức độ tham gia và hoàn thành, IOC hiện đạt tỷ lệ tham gia 44,5% và tỷ lệ hoàn thành 29,4%. Dù chưa phải con số tối ưu, các chỉ số này phản ánh đúng đặc thù của mô hình thực tập thực tế, nơi sinh viên chịu tác động từ nhiều yếu tố như thời gian, năng lực cá nhân và yêu cầu của doanh nghiệp. Đây cũng chính là cơ sở dữ liệu quan trọng để dự án IOC 2.0 tiếp tục cải thiện thiết kế sản phẩm, cơ chế theo dõi và động lực tham gia.

Về mạng lưới đối tác, dự án hiện đã hợp tác với 14 trường học và 7 doanh nghiệp, tạo thành một hệ sinh thái bước đầu giữa nhà trường – sinh viên – doanh nghiệp. Sự tham gia của nhiều bên cho thấy IOC không chỉ là một công cụ nội bộ mà đã bắt đầu đóng vai trò là nền tảng phối hợp giữa các chủ thể trong quá trình thực tập.

Cuối cùng, xét theo tốc độ tăng trưởng, biểu đồ số lượng sinh viên theo thời gian cho thấy xu hướng tăng đều và ổn định, phản ánh nhu cầu thực tế của thị trường và khả năng mở rộng của nền tảng. Đây là nền tảng quan trọng để IOC bước sang giai đoạn 2.0, tập trung vào việc nâng cao chất lượng dữ liệu và khai thác giá trị sâu hơn từ các kết quả đã đạt được.

10\. **Ý nghĩa đối với môi trường, kinh tế và xã hội**

IOC 2.0 là dự án công nghệ số nên không tạo ra tác động tiêu cực trực tiếp đến môi trường tự nhiên. Ngược lại, việc số hóa toàn bộ quy trình quản lý thực tập, đánh giá năng lực và kết nối sinh viên – doanh nghiệp giúp giảm phụ thuộc vào hồ sơ giấy, quy trình thủ công và di chuyển không cần thiết, qua đó gián tiếp góp phần tiết kiệm tài nguyên và tối ưu vận hành.

Về mặt kinh tế, IOC 2.0 tạo ra giá trị cho nhà trường và sinh viên. Đối với nhà trường, IOC hỗ trợ minh bạch hóa đầu ra đào tạo qua báo cáo và theo dõi chất lượng thực tập, nâng cao uy tín. Đối với sinh viên, dự án giúp tăng kinh nghiệm thực tế và portfolio, từ đó tăng khả năng tiếp cận cơ hội việc làm thay vì chỉ dựa vào bằng cấp hay phỏng vấn cảm tính.

Về mặt xã hội, IOC 2.0 góp phần giải quyết vấn đề mang tính cấu trúc: khoảng trống giữa đào tạo và thực tế ở giai đoạn chuyển tiếp từ học sang làm. Thông qua quy trình thực tập thực chiến và đánh giá rõ ràng, dự án thúc đẩy cách tiếp cận công bằng hơn: sinh viên có cơ hội được đánh giá dựa trên những gì họ làm được (dự án, đánh giá mentor), không phụ thuộc hoàn toàn vào xuất thân hay mối quan hệ.