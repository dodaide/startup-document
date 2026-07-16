# KẾ HOẠCH CHƯƠNG TRÌNH TRẢI NGHIỆM THỰC TẾ 3 NGÀY (3-DAY REALITY EXPERIENCE) - IOC

---

## I. TỔNG QUAN & MỤC TIÊU CHƯƠNG TRÌNH

Chương trình Trải nghiệm Thực tế 3 Ngày (3-Day Reality Experience) tại **Internship OneConnect (IOC)** được thiết kế như một phiên bản thu nhỏ của kỳ thực tập OJT thực chiến. Chương trình giả lập toàn bộ quy trình làm việc chuẩn doanh nghiệp, từ kỷ luật Agile/Scrum, Kanban, Waterfall, tác phong báo cáo Daily Chokai, cho tới các tiêu chuẩn khắt khe về kỹ thuật và chất lượng sản phẩm.

### 1. Mục tiêu đối với Ứng viên (Interns)

* **Trải nghiệm văn hóa & kỷ luật**: Làm quen với nhịp độ làm việc nhanh, họp Daily hàng ngày, và quy trình bàn giao sản phẩm chuyên nghiệp.
* **Thử thách kỹ năng**: Đối mặt với các bài toán thực tế của hệ thống IOC hoặc các bài toán phân tích dữ liệu lớn.
* **Rèn luyện kỹ năng mềm**: Thực hành giao tiếp công việc và báo cáo, liên lạc, thảo luận tiến độ kịp thời.

### 2. Mục tiêu đối với Ban Quản lý & Mentor IOC

* **Đánh giá đa chiều**: Nhận diện chính xác năng lực kỹ thuật (Hard skills), thái độ làm việc, tốc độ thích ứng và tinh thần học hỏi của ứng viên chỉ sau 3 ngày.
* **Phân loại đầu vào**: Xác định ứng viên thuộc nhóm năng lực **Yếu (Cần kèm cặp/đào tạo thêm)** hay **Khá (Có thể tham gia dự án thực tế ngay)** để thiết kế lộ trình OJT 3 tháng phù hợp.

---

## II. ĐỊA BÀN THỰC CHIẾN & TÀI NGUYÊN HỆ THỐNG

Chương trình chia làm 2 nhánh dự án độc lập tương ứng với các nhóm Role:

### Nhánh 1: Module đăng nhập và phân tích nhân khẩu học trên nền tảng IOC (Dành cho Dev, Tester, BA)

Nhánh này tập trung trực tiếp vào hệ thống sản phẩm thực tế của IOC. Các vai trò BA, Developer và Tester sẽ cùng tham gia nghiên cứu, phát triển, kiểm thử và phân tích luồng Auth và hệ thống Quản trị số liệu người dùng:

1. **Luồng giao diện và logic Đăng ký/Đăng nhập (Authentication Flow):**

   * **Form Đăng Nhập**: Thiết kế và tích hợp Turnstile Widget (xác thực CAPTCHA bảo mật chống spam đăng nhập), luồng đăng nhập nhanh bằng bên thứ ba (Google Login OAuth2).
   * **Form Đăng Ký**: Nhập liệu thông tin hồ sơ của thực tập sinh bao gồm:
     * Họ và tên (`fullName`), Email, Số điện thoại.
     * Năm học hiện tại (`studentYear` - tùy chọn các tùy chọn năm 1 đến đã tốt nghiệp).
     * Trường đại học tại Việt Nam (`vietnamUniversityId`) - Tích hợp API lấy dữ liệu danh sách trường học và thực hiện tính năng tìm kiếm debounced search gợi ý autocomplete khi người dùng nhập từ khóa.
     * Mục tiêu tham gia chương trình (`joinPurposes` - các tùy chọn như làm dự án thực tế, định hướng BrSE, thực tập hướng Nhật,...).
     * Các vai trò (Role) quan tâm đầu vào (`interestedRoleIds` - Dev FE, BE, BA, Tester, DA,...).
     * Xác thực captcha chống spam và gửi email kích hoạt tài khoản.
2. **Trang báo cáo thống kê nhân khẩu học người dùng đăng ký (Demographics Dashboard):**

   * Hiển thị các biểu đồ trực quan hóa dữ liệu nhân khẩu học của người dùng đăng ký thu thập từ form Đăng Ký để phục vụ công tác quản trị:
     * **Biểu đồ xu hướng hoạt động (Line/Area Chart)**: Thống kê số lượng tài khoản đăng ký mới theo thời gian (ngày/tuần/tháng).
     * **Biểu đồ theo Năm học (Doughnut Chart)**: Thống kê tỷ lệ phân bổ người dùng đăng ký theo năm học (Sinh viên năm 1, 2, 3, 4, Đã tốt nghiệp).
     * **Biểu đồ theo Vị trí quan tâm (Doughnut Chart)**: Trực quan hóa tỷ lệ người đăng ký lựa chọn các Role đầu vào (FE, BE, Tester, BA, DA...).
     * **Biểu đồ theo Mục tiêu tham gia (Doughnut Chart)**: Phân tích mục đích của ứng viên khi tìm đến chương trình (Làm dự án thực tế, định hướng BrSE, thực tập hướng Nhật,...).
     * **Tính năng lọc nâng cao**: Hỗ trợ lọc thống kê theo khoảng thời gian (Từ ngày - Đến ngày) và theo dõi nguồn tiếp thị (UTM Source, UTM Medium).

---

### Nhánh 2: Dự án phân tích và dự báo giá cổ phiếu NISP (Dành cho DA)

Ứng viên Data Analyst sẽ thực hiện dự án nghiên cứu và phân tích sâu bộ dữ liệu tài chính thực tế của Ngân hàng OCBC NISP Tbk (mã cổ phiếu: NISP.JK) - một trong những ngân hàng lớn nhất Indonesia và là thành phần cốt lõi của chỉ số IDX Composite (IHSG).

1. **Thông tin bộ dữ liệu (Dataset Info):**

   * **Khoảng thời gian**: Từ ngày 08/08/2020 đến ngày 15/08/2025 (5 năm dữ liệu giao dịch hàng ngày trên Sở giao dịch chứng khoán Indonesia - IDX).
   * **Đường dẫn tải Dataset**: [Rikkeieducation Lark Drive Folder](https://rikkeieducation.sg.larksuite.com/drive/folder/JYAQfhtLZlrslIdqkzIlOVzNgCf)
   * **Các trường thông tin chi tiết:**
     * `Date`: Ngày giao dịch.
     * `Open`: Giá cổ phiếu mở cửa.
     * `High`: Giá cổ phiếu cao nhất trong ngày giao dịch.
     * `Low`: Giá cổ phiếu thấp nhất trong ngày giao dịch.
     * `Close`: Giá cổ phiếu đóng cửa.
     * `Volume`: Số lượng cổ phiếu được giao dịch trong ngày.
2. **Nội dung nhiệm vụ phân tích cần thực hiện:**

   * **Trực quan hóa và làm sạch dữ liệu**: Phân tích xu hướng biến động giá cổ phiếu NISP qua 5 năm, xử lý các dữ liệu bất thường và vẽ các biểu đồ xu hướng.
   * **Phân tích kỹ thuật (Technical Analysis)**: Tính toán và vẽ các chỉ báo tài chính cốt lõi như đường trung bình động (MA), chỉ số sức mạnh tương đối (RSI), đường trung bình động hội tụ phân kỳ (MACD) để xác định điểm mua/bán tối ưu.
   * **Mô hình hóa dự báo (Forecasting Model)**: Áp dụng các mô hình học máy (Machine Learning) hoặc mô hình toán học (Linear Regression, ARIMA, Prophet) để dự báo giá đóng cửa của cổ phiếu trong các chu kỳ kế tiếp và nhận dạng mô hình biến động giá.
   * **Nghiên cứu tài chính & Quản trị rủi ro**: Phân tích mức độ biến động (volatility) của cổ phiếu ngành ngân hàng Indonesia và đề xuất tối ưu hóa danh mục đầu tư.
   * **Lưu ý quan trọng**: Bộ dữ liệu chỉ được sử dụng cho mục đích giáo dục và nghiên cứu đánh giá năng lực, không cấu thành lời khuyên tài chính.

---

## III. PHÂN HÓA ĐẦU VÀO: NĂNG LỰC YẾU VS. NĂNG LỰC KHÁ

Để đảm bảo công bằng và đánh giá đúng tiềm năng, yêu cầu công việc được phân hóa rõ ràng theo 2 cấp độ:

| Role                | Mức độ: Yếu (Basic)                                                                                                                                                                                                                                                                                                                                                                                                                  | Mức độ: Khá (Advanced)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| :------------------ | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **Developer** | - Thực hiện luồng**Fullstack** cơ bản: Dựng giao diện Auth đúng layout sử dụng bộ base component được cung cấp sẵn, validate form cơ bản (kiểm tra email, độ dài password). Viết API CRUD người dùng cơ bản (ORM/Framework tùy chọn), và thực hiện kết nối đầu-cuối (End-to-End) cơ bản từ frontend vào backend.- *Được cung cấp sẵn template code mẫu và bộ base component.* | - Thực hiện luồng**Fullstack** nâng cao: Tùy biến và override nâng cao bộ base component được cung cấp (tối ưu hóa giao diện và CSS). Tích hợp validation (Zod schema hoặc tương đương), Google OAuth và Turnstile.- Viết API thống kê dữ liệu nhân khẩu học người dùng đăng ký (năm học, mục tiêu, vai trò quan tâm, xu hướng đăng ký) sử dụng SQL/ORM nâng cao, kết nối hiển thị lên Dashboard Admin. Bảo mật hệ thống chống SQL Injection/XSS.- *Được cung cấp bộ base component và tự chủ thiết kế giải pháp.* |
| **Tester**    | - Viết Test Cases thủ công cho luồng chính (Happy Path) và các lỗi nhập liệu rõ ràng.- Thực hiện kiểm thử thủ công (Manual Test), log bug cơ bản lên Lark Table/GitHub Issues.                                                                                                                                                                                                                                      | - Sử dụng kỹ thuật thiết kế testcase nâng cao (Boundary Value, Equivalence Partitioning).- Viết testcase kiểm thử bảo mật (SQL Injection, XSS) và kiểm thử hiệu năng nhẹ.- Viết script**Automation Test** tự động hóa luồng đăng ký bằng Playwright/Cypress.                                                                                                                                                                                                                                                                                                          |
| **BA**        | - Vẽ sơ đồ User Flow cơ bản của tính năng Auth.- Viết tài liệu User Stories dạng cơ bản với các Acceptance Criteria (AC) dạng chức năng đơn giản.                                                                                                                                                                                                                                                                 | - Thực hiện UX Audit luồng Auth hiện tại, thiết kế Wireframe cải tiến UI/UX giảm tỉ lệ drop-off.- Viết User Stories chi tiết theo định dạng Gherkin (`Given-When-Then`) bao phủ mọi edge cases.- Phân tích số liệu phễu chuyển đổi trên Dashboard và đề xuất giải pháp nghiệp vụ.                                                                                                                                                                                                                                                                                 |
| **DA**        | - Làm sạch dữ liệu cơ bản (null, duplicates). Phân tích thống kê mô tả: giá trung bình, biên độ dao động giá theo tháng/năm. Vẽ biểu đồ xu hướng biến động giá đóng cửa cơ bản trên Excel/PowerBI.                                                                                                                                                                                                 | - Thực hiện EDA sâu, tính toán chỉ báo kỹ thuật (Moving Average, RSI, MACD). Xây dựng mô hình dự báo giá đóng cửa (Regression, Time Series ARIMA/Prophet) và phát hiện mẫu biến động. Thiết kế Dashboard tương tác chuyên nghiệp hiển thị phân tích kỹ thuật và viết báo cáo rủi ro danh mục đầu tư.                                                                                                                                                                                                                                                    |

---

## IV. LỘ TRÌNH CHI TIẾT & LỊCH TRÌNH VẬN HÀNH

> [!NOTE]
> **Về vai trò của Mentor & Quy trình báo cáo trong chương trình:**
>
> * Mentor chỉ tham gia trực tiếp **30 phút/ứng viên mỗi ngày** vào đầu giờ sáng để tối ưu hóa thời gian và rèn luyện tính tự chủ của ứng viên.
> * **Không cần gửi báo cáo cuối ngày**. Việc báo cáo tiến độ (các việc đã làm, khó khăn blocker gặp phải) và review/nghiệm thu sản phẩm hàng ngày sẽ được thực hiện trực tiếp trong buổi gặp Mentor 30 phút vào sáng hôm sau.
> * Cuối mỗi ngày làm việc (trước 17:30), ứng viên chỉ cần push code/tài liệu lên Git/Lark để Mentor có thể xem trước trước buổi họp sáng hôm sau.

---

### NGÀY 1: KICK-OFF, NHẬN NHIỆM VỤ & NGHIÊN CỨU NGHIỆP VỤ

* **Hoạt động với Mentor (30 phút - Đầu ngày)**:
  * Mentor gặp trực tiếp ứng viên để hướng dẫn thực tập, giải thích đề bài, bàn giao tài nguyên hệ thống (Repo code, tài liệu CSDL, Dataset giá cổ phiếu NISP) và giao danh sách nhiệm vụ chi tiết.
* **Nhiệm vụ tự chủ của Ứng viên**:
  * **Dev**: Clone repo, cài đặt môi trường chạy local (`npm run dev`), kiểm tra kết nối database cục bộ. Nghiên cứu cấu trúc thư mục UI, tìm hiểu cách sử dụng bộ base component được cung cấp và thiết lập cấu trúc API đầu vào/đầu ra.
  * **Tester**: Trải nghiệm thực tế luồng đăng nhập/đăng ký hiện tại, đọc tài liệu đặc tả nghiệp vụ. Lập danh sách kịch bản kiểm thử (Test Scenarios Checklist) và dựng template Test Cases.
  * **BA**: Khảo sát thực tế luồng đăng nhập/đăng ký hiện tại trên ứng dụng. Phác thảo sơ đồ luồng người dùng (User Flow) và liệt kê các quy tắc xác thực (validation rules) dự kiến.
  * **DA**: Cài đặt Python/R/PowerBI, tải và nạp dataset giá cổ phiếu NISP và kiểm tra cấu trúc dữ liệu tổng quan. Thực hiện làm sạch dữ liệu (Data Cleaning): xử lý dữ liệu trống, lọc trùng, định dạng cột ngày giao dịch.
* **Cuối ngày**:
  * Ứng viên push code/tài liệu lên branch Git cá nhân hoặc thư mục dùng chung của nhóm để Mentor xem trước tiến độ Ngày 1.

---

### NGÀY 2: THỰC THI & PHÁT TRIỂN SẢN PHẨM

* **Hoạt động với Mentor (30 phút - Đầu ngày)**:
  * Ứng viên báo cáo tiến độ và khó khăn của Ngày 1. Mentor đánh giá sản phẩm Ngày 1 (User Flow, Test Scenarios, Data cleaned) và đưa ra nhận xét sửa đổi.
* **Nhiệm vụ tự chủ của Ứng viên**:
  * Ứng viên cập nhật lại sản phẩm Ngày 1 theo góp ý của Mentor, sau đó tiến hành phát triển:
    * **BA**:
      * *Yếu*: Viết User Stories chi tiết, vẽ User Flow chính xác.
      * *Khá*: Thiết kế UI/UX Wireframe cải tiến, hoàn thiện đặc tả nghiệp vụ nâng cao.
    * **Dev**:
      * *Yếu*: Code giao diện Auth sử dụng base component sẵn có, viết hàm validate cơ bản và dựng API CRUD cơ bản ở backend để kết nối End-to-End.
      * *Khá*: Tùy biến base component nâng cao, tích hợp validation (Zod schema hoặc tương đương), Google OAuth và Turnstile.
    * **Tester**:
      * *Yếu*: Thiết kế bộ Test Cases chi tiết cho các luồng cơ bản.
      * *Khá*: Thiết kế bộ Test Cases nâng cao (BVA, Security, SQL injection, XSS). Bắt đầu chuẩn bị automation test scripts.
    * **DA**:
      * *Yếu*: Thống kê mô tả (Descriptive Statistics), vẽ biểu đồ xu hướng giá đóng cửa.
      * *Khá*: Phân tích EDA tài chính nâng cao, tính toán các chỉ báo kỹ thuật (MA, RSI, MACD).
    * **Tích hợp nhóm**: Dev & BA khớp giao diện thực tế với User Story. Dev chuyển bản build sớm cho Tester. Tester chạy test thủ công trên bản build nháp của Dev và log bug lên Lark/GitHub. DA phác thảo Dashboard phân tích cổ phiếu NISP và chạy thử mô hình dự báo giá đóng cửa.
* **Cuối ngày**:
  * Ứng viên push code/tài liệu lên branch Git cá nhân hoặc thư mục dùng chung của nhóm để Mentor xem trước tiến độ Ngày 2.

---

### NGÀY 3: TÍCH HỢP, KIỂM THỬ & HOÀN THIỆN

* **Hoạt động với Mentor (30 phút - Đầu ngày)**:
  * Ứng viên báo cáo tiến độ và các blocker của Ngày 2. Mentor review tiến độ code/test/analytics của ứng viên và hướng dẫn chỉnh sửa để hoàn thiện sản phẩm.
* **Nhiệm vụ tự chủ của Ứng viên**:
  * Ứng viên cập nhật lại sản phẩm Ngày 2 theo góp ý của Mentor, sau đó tiến hành hoàn thiện:
    * **Dev**: Sửa các lỗi Tester phát hiện trong Ngày 2, dọn dẹp mã nguồn theo chuẩn clean code của dự án.
    * **Tester**: Chạy Regression Test (kiểm thử hồi quy) để xác nhận lỗi đã sửa, đóng gói báo cáo Test Report.
    * **BA**: Nghiệm thu sản phẩm chạy thật của Dev so với Acceptance Criteria đã viết.
    * **DA**: Tinh chỉnh Dashboard tương tác, tối ưu mô hình dự báo và hoàn thiện các biểu đồ phân tích.
    * **Đóng gói & Chuẩn bị Slide**: Ứng viên chuẩn bị Slide trình bày kết quả làm việc (giới thiệu sản phẩm, kiến trúc kỹ thuật, kết quả test hoặc các insight phân tích từ dữ liệu cổ phiếu NISP) và kiểm tra tích hợp lần cuối trước buổi bảo vệ.
* **Cuối ngày**:
  * Ứng viên nộp slide thuyết trình và push toàn bộ mã nguồn/tài liệu bản cuối lên hệ thống để Hội đồng nghiên cứu trước buổi bảo vệ sáng Ngày 4.

---

### NGÀY 4: TỔNG KẾT, NGHIỆM THU & ĐỊNH HƯỚNG KẾ TIẾP

* **Hoạt động chính (Nghiệm thu & Push Sale)**:
  * **Nghiệm thu sản phẩm cùng Mentor & Sale**:
    * Ứng viên gặp trực tiếp **Mentor** và **Sale** để demo sản phẩm chạy thật (đối với Dev/Test/BA) hoặc trình bày Dashboard và báo cáo đề xuất (đối với DA).
    * Mentor cùng Sale tiến hành nghiệm thu nhanh các đầu việc đã bàn giao, nhận xét ưu/nhược điểm và đánh giá chung về năng lực, thái độ của ứng viên sau 3 ngày trải nghiệm.
  * **Tư vấn & Thúc đẩy đăng ký (Push Sale)**:
    * Sau khi nghiệm thu xong, **Mentor rời phòng họp**.
    * Đại diện bộ phận **Sale ở lại** để trao đổi riêng với ứng viên, tư vấn định hướng lộ trình chương trình thực tập chính thức 3 tháng tại IOC và khuyến khích, thúc đẩy ứng viên đăng ký tham gia khóa học/thực tập chính thức.

---

## V. SẢN PHẨM BÀN GIAO YÊU CẦU (DELIVERABLES)

Đến cuối ngày 3, ứng viên bắt buộc phải nộp đầy đủ các sản phẩm sau để làm căn cứ đánh giá:

### 1. Vị trí Developer

* Mã nguồn hoàn chỉnh được push lên Git branch cá nhân trên GitHub theo quy chuẩn của dự án.
* Không còn lỗi compile, không còn code thừa hoặc log debug.
* File `README.md` hướng dẫn cách setup và chạy chương trình dưới local.

### 2. Vị trí Tester

* File Excel/Lark Table chứa bộ Test Cases chi tiết.
* Danh sách Bug Report được log đầy đủ (trên GitHub Issues hoặc Lark Base).
* File báo cáo kết quả kiểm thử (Test Report) tổng hợp tỷ lệ pass/fail và đánh giá mức độ ổn định.

### 3. Vị trí BA

* Tài liệu User Stories kèm theo Acceptance Criteria (AC) dạng Markdown hoặc Lark Doc.
* Sơ đồ User Flow và tài liệu phân tích UX/UI.
* Slide thuyết trình phân tích dữ liệu nhân khẩu học người dùng đăng ký.

### 4. Vị trí DA

* Mã nguồn phân tích dữ liệu (Jupyter Notebook `.ipynb` hoặc file script Python `.py`).
* File báo cáo phân tích kinh doanh dạng PDF/Word (Executive Summary).
* Đường link truy cập Dashboard tương tác (PowerBI/Tableau hoặc ảnh chụp màn hình dashboard đầy đủ).

---

## VI. TIÊU CHÍ & BIỂU ĐIỂM ĐÁNH GIÁ ĐẦU RA

Mentor sẽ đánh giá ứng viên dựa trên thang điểm 100, chia làm 4 cột điểm chính:

| STT | Nhóm Tiêu Chỉ                                                |  Trọng Số  | Mô Tả Chi Tiết                                                                                                                                                                                                                                                                                                                                                                                        |
| :-: | :-------------------------------------------------------------- | :-----------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|  1  | **Chất lượng Kỹ thuật & Chuyên môn (Hard Skills)** | **40%** | -**Dev**: Code chạy đúng yêu cầu, sạch, tuân thủ standard, áp dụng đúng cấu trúc dữ liệu và giải thuật.- **Tester**: Testcase bao phủ tốt các trường hợp, log bug chính xác.- **BA**: Tài liệu rõ ràng, logic nghiệp vụ chặt chẽ.- **DA**: Phân tích dữ liệu chính xác, dashboard trực quan, mô hình dự báo có cơ sở khoa học. |
|  2  | **Kỷ luật & Tác phong làm việc (Discipline)**        | **30%** | - Tham gia đầy đủ và đúng giờ các buổi họp Daily Morning Sync và Daily Chokai.- Commit/Push code đều đặn, cập nhật trạng thái task thường xuyên trên bảng quản lý công việc.- Hoàn thành sản phẩm đúng deadline.                                                                                                                                                      |
|  3  | **Kỹ năng Giao tiếp & Phối hợp**        | **20%** | - Biết cách báo cáo vấn đề ngắn gọn, mạch lạc.- Khi gặp blocker, chủ động báo cáo và trao đổi (nêu rõ vấn đề -> các cách đã thử -> đề xuất hỗ trợ).- Phối hợp mượt mà với các thành viên khác trong nhóm.                                                                                                                                                    |
|  4  | **Tốc độ tự học & Thích ứng (Adaptability)**       | **10%** | - Khả năng nhanh chóng tiếp thu kiến thức mới để áp dụng vào bài test.- Tinh thần cầu thị, lắng nghe phản hồi từ Mentor và sửa đổi sản phẩm nhanh chóng.                                                                                                                                                                                                                      |

---

*Tài liệu này được ban hành bởi Ban Đào Tạo & Mentor tại Internship OneConnect (IOC). Mọi thắc mắc trong quá trình thực hiện vui lòng trao đổi trực tiếp với Mentor hướng dẫn.*
