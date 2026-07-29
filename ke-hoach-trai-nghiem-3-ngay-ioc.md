# KẾ HOẠCH CHƯƠNG TRÌNH TRẢI NGHIỆM THỰC TẾ 3 NGÀY \(3\-DAY REALITY EXPERIENCE\) \- IOC



---



## I\. TỔNG QUAN \& MỤC TIÊU CHƯƠNG TRÌNH



Chương trình Trải nghiệm Thực tế 3 Ngày \(3\-Day Reality Experience\) tại **Internship OneConnect \(IOC\)** được thiết kế như một phiên bản thu nhỏ của kỳ thực tập OJT thực chiến\. Chương trình giả lập toàn bộ quy trình làm việc chuẩn doanh nghiệp, từ kỷ luật Agile/Scrum, tác phong báo cáo Daily Chokai \(Hou\-Ren\-So\), cho tới các tiêu chuẩn khắt khe về kỹ thuật và chất lượng sản phẩm\.



### 1\. Mục tiêu đối với Ứng viên \(Interns\)



- **Trải nghiệm văn hóa \& kỷ luật**: Làm quen với nhịp độ làm việc nhanh, họp Daily hàng ngày, và quy trình bàn giao sản phẩm chuyên nghiệp\.

- **Thử thách kỹ năng**: Đối mặt với các bài toán thực tế của hệ thống IOC hoặc các bài toán phân tích dữ liệu lớn\.

- **Rèn luyện kỹ năng mềm**: Thực hành giao tiếp công việc qua nguyên tắc Hou\-Ren\-So \(Báo cáo \- Liên lạc \- Thảo luận\)\.

    

### 2\. Mục tiêu đối với Ban Quản lý \& Mentor IOC



- **Đánh giá đa chiều**: Nhận diện chính xác năng lực kỹ thuật \(Hard skills\), thái độ làm việc, tốc độ thích ứng và tinh thần học hỏi của ứng viên chỉ sau 3 ngày\.

- **Phân loại đầu vào**: Xác định ứng viên thuộc nhóm năng lực **Yếu \(Cần kèm cặp/đào tạo thêm\)** hay **Khá \(Có thể tham gia dự án thực tế ngay\)** để thiết kế lộ trình OJT 3 tháng phù hợp\.

    

---



## II\. ĐỊA BÀN THỰC CHIẾN \& TÀI NGUYÊN HỆ THỐNG



Chương trình chia làm 2 nhánh dự án độc lập tương ứng với các nhóm Role:



### Nhánh 1: Module đăng nhập và phân tích nhân khẩu học trên nền tảng IOC \(Dành cho Dev, Tester, BA\)



Nhánh này tập trung trực tiếp vào hệ thống sản phẩm thực tế của IOC\. Các vai trò BA, Developer và Tester sẽ cùng tham gia nghiên cứu, phát triển, kiểm thử và phân tích luồng Auth và hệ thống Quản trị số liệu người dùng:



1. **Luồng giao diện và logic Đăng ký/Đăng nhập \(Authentication Flow\):**

    

    - **Form Đăng Nhập**: Thiết kế và tích hợp Turnstile Widget \(xác thực CAPTCHA bảo mật chống spam đăng nhập\), luồng đăng nhập nhanh bằng bên thứ ba \(Google Login OAuth2\)\.

    - **Form Đăng Ký**: Nhập liệu thông tin hồ sơ của thực tập sinh bao gồm:

        - Họ và tên \(`fullName`\), Email, Số điện thoại\.

        - Năm học hiện tại \(`studentYear` \- tùy chọn các tùy chọn năm 1 đến đã tốt nghiệp\)\.

        - Trường đại học tại Việt Nam \(`vietnamUniversityId`\) \- Tích hợp API lấy dữ liệu danh sách trường học và thực hiện tính năng tìm kiếm debounced search gợi ý autocomplete khi người dùng nhập từ khóa\.

        - Mục tiêu tham gia chương trình \(`joinPurposes` \- các tùy chọn như làm dự án thực tế, định hướng BrSE, thực tập hướng Nhật,\.\.\.\)\.

        - Các vai trò \(Role\) quan tâm đầu vào \(`interestedRoleIds` \- Dev FE, BE, BA, Tester, DA,\.\.\.\)\.

        - Xác thực captcha chống spam và gửi email kích hoạt tài khoản\.

2. **Trang báo cáo thống kê nhân khẩu học người dùng đăng ký \(Demographics Dashboard\):**

    

    - Hiển thị các biểu đồ trực quan hóa dữ liệu nhân khẩu học của người dùng đăng ký thu thập từ form Đăng Ký để phục vụ công tác quản trị:

        - **Biểu đồ xu hướng hoạt động \(Line/Area Chart\)**: Thống kê số lượng tài khoản đăng ký mới theo thời gian \(ngày/tuần/tháng\)\.

        - **Biểu đồ theo Năm học \(Doughnut Chart\)**: Thống kê tỷ lệ phân bổ người dùng đăng ký theo năm học \(Sinh viên năm 1, 2, 3, 4, Đã tốt nghiệp\)\.

        - **Biểu đồ theo Vị trí quan tâm \(Doughnut Chart\)**: Trực quan hóa tỷ lệ người đăng ký lựa chọn các Role đầu vào \(FE, BE, Tester, BA, DA\.\.\.\)\.

        - **Biểu đồ theo Mục tiêu tham gia \(Doughnut Chart\)**: Phân tích mục đích của ứng viên khi tìm đến chương trình \(Làm dự án thực tế, định hướng BrSE, thực tập hướng Nhật,\.\.\.\)\.

        - **Tính năng lọc nâng cao**: Hỗ trợ lọc thống kê theo khoảng thời gian \(Từ ngày \- Đến ngày\) và theo dõi nguồn tiếp thị \(UTM Source, UTM Medium\)\.

        - **Yêu cầu kỹ thuật:** Cả lộ trình Cơ bản và Nâng cao đều phải hoàn thành Dashboard thống kê\. **Database bắt buộc dùng PostgreSQL**; học viên **tự thiết kế và tự tạo cấu trúc DB** \(cả 2 lộ trình\)\. Riêng lộ trình Nâng cao / mức Khá: phần lấy dữ liệu thống kê **bắt buộc viết bằng Stored Procedure \(SP\)** trên PostgreSQL; API backend Java chỉ gọi SP rồi trả về cho Frontend\.

            

---



### Nhánh 2: Dự án phân tích và dự báo giá cổ phiếu NISP \(Dành cho DA\)



Ứng viên Data Analyst sẽ thực hiện dự án nghiên cứu và phân tích sâu bộ dữ liệu tài chính thực tế của Ngân hàng OCBC NISP Tbk \(mã cổ phiếu: NISP\.JK\) \- một trong những ngân hàng lớn nhất Indonesia và là thành phần cốt lõi của chỉ số IDX Composite \(IHSG\)\.



1. **Thông tin bộ dữ liệu \(Dataset Info\):**

    

    - **Khoảng thời gian**: Từ ngày 08/08/2020 đến ngày 15/08/2025 \(5 năm dữ liệu giao dịch hàng ngày trên Sở giao dịch chứng khoán Indonesia \- IDX\)\.

    - **Đường dẫn tải Dataset**: [Rikkeieducation Lark Drive Folder](https://rikkeieducation.sg.larksuite.com/drive/folder/JYAQfhtLZlrslIdqkzIlOVzNgCf)

    - **Các trường thông tin chi tiết:**

        - `Date`: Ngày giao dịch\.

        - `Open`: Giá cổ phiếu mở cửa\.

        - `High`: Giá cổ phiếu cao nhất trong ngày giao dịch\.

        - `Low`: Giá cổ phiếu thấp nhất trong ngày giao dịch\.

        - `Close`: Giá cổ phiếu đóng cửa\.

        - `Volume`: Số lượng cổ phiếu được giao dịch trong ngày\.

2. **Nội dung nhiệm vụ phân tích cần thực hiện:**

    

    - **Trực quan hóa và làm sạch dữ liệu**: Phân tích xu hướng biến động giá cổ phiếu NISP qua 5 năm, xử lý các dữ liệu bất thường và vẽ các biểu đồ xu hướng\.

    - **Phân tích kỹ thuật \(Technical Analysis\)**: Tính toán và vẽ các chỉ báo tài chính cốt lõi như đường trung bình động \(MA\), chỉ số sức mạnh tương đối \(RSI\), đường trung bình động hội tụ phân kỳ \(MACD\) để xác định điểm mua/bán tối ưu\.

    - **Mô hình hóa dự báo \(Forecasting Model\)**: Áp dụng các mô hình học máy \(Machine Learning\) hoặc mô hình toán học \(Linear Regression, ARIMA, Prophet\) để dự báo giá đóng cửa của cổ phiếu trong các chu kỳ kế tiếp và nhận dạng mô hình biến động giá\.

    - **Nghiên cứu tài chính \& Quản trị rủi ro**: Phân tích mức độ biến động \(volatility\) của cổ phiếu ngành ngân hàng Indonesia và đề xuất tối ưu hóa danh mục đầu tư\.

    - **Lưu ý quan trọng**: Bộ dữ liệu chỉ được sử dụng cho mục đích giáo dục và nghiên cứu đánh giá năng lực, không cấu thành lời khuyên tài chính\.

        

---



## III\. PHÂN HÓA ĐẦU VÀO: NĂNG LỰC YẾU VS\. NĂNG LỰC KHÁ



Để đảm bảo công bằng và đánh giá đúng tiềm năng, yêu cầu công việc được phân hóa rõ ràng theo 2 cấp độ\.



> \[\!IMPORTANT\]
>
> **Thời điểm phân loại:** Mức **Yếu \(Basic\)** hoặc **Khá \(Advanced\)** được Mentor **chốt ngay trong buổi Kick-off Ngày 1** \(không chờ đến Ngày 2\)\.
>
> Mục đích: **bàn giao đúng gói tài nguyên** \(template code, độ đầy đủ hướng dẫn, dataset kèm mẫu hay không, checklist nhiệm vụ\) và để ứng viên làm việc đúng scope ngay từ Ngày 1\.
>



|Role|Mức độ: Yếu \(Basic\)|Mức độ: Khá \(Advanced\)|
|---|---|---|
|**Developer**|\- Stack cố định **Next\.js \(Frontend\) + Java \(Backend\) + PostgreSQL \(Database\)**\. **Cả 2 mức đều phải tự thiết kế và tự tạo cấu trúc DB trên PostgreSQL**\.\- Cả 2 mức đều làm **Auth \(Ngày 2\)** và **Dashboard thống kê \(Ngày 3\)**\.\- **Ngày 2 — Auth:** Dựng UI Đăng nhập/Đăng ký đúng layout bằng base component, validate form cơ bản \(email, độ dài password\), viết API Auth/CRUD người dùng bằng Java\.\- **Ngày 3 — Dashboard:** Viết API thống kê nhân khẩu học \(năm học, mục tiêu, vai trò quan tâm, xu hướng đăng ký\) và hiển thị Dashboard Admin; sửa bug Auth, clean code\.\- *Được cung cấp sẵn template code mẫu \(Next\.js + Java\) và bộ base component — **không kèm sẵn schema DB hoàn chỉnh**; học viên tự thiết kế PostgreSQL\.*|\- Stack cố định **Next\.js \(Frontend\) + Java \(Backend\) + PostgreSQL \(Database\)**\. **Cả 2 mức đều phải tự thiết kế và tự tạo cấu trúc DB trên PostgreSQL**\.\- Cả 2 mức đều làm **Auth \(Ngày 2\)** và **Dashboard thống kê \(Ngày 3\)**\.\- **Ngày 2 — Auth:** **Tự xây toàn bộ** UI Auth, validation \(Zod schema hoặc tương đương\), Google OAuth và Turnstile — **không dùng template code / base component có sẵn**\.\- **Ngày 3 — Dashboard:** API thống kê nhân khẩu học lên Dashboard Admin; **phần thống kê bắt buộc viết bằng Stored Procedure \(SP\)** trên PostgreSQL, Java API chỉ gọi SP\. Bảo mật chống SQL Injection/XSS; sửa bug Auth, clean code\.\- *Repo bàn giao chỉ gồm tài liệu hướng dẫn — học viên tự khởi tạo dự án Next\.js + Java, **tự thiết kế PostgreSQL**, và tự xây toàn bộ mã nguồn\.*|
|**Tester**|\- Viết Test Cases thủ công cho luồng chính \(Happy Path\) và các lỗi nhập liệu rõ ràng\.\- Thực hiện kiểm thử thủ công \(Manual Test\), log bug cơ bản lên Lark Table/GitHub Issues\.|\- Sử dụng kỹ thuật thiết kế testcase nâng cao \(Boundary Value, Equivalence Partitioning\)\.\- Viết testcase kiểm thử bảo mật \(SQL Injection, XSS\) và kiểm thử hiệu năng nhẹ\.\- Viết script**Automation Test** tự động hóa luồng đăng ký bằng Playwright/Cypress\.|
|**BA**|\- Vẽ sơ đồ User Flow cơ bản của tính năng Auth\.\- Viết tài liệu User Stories dạng cơ bản với các Acceptance Criteria \(AC\) dạng chức năng đơn giản\.|\- Thực hiện UX Audit luồng Auth hiện tại, thiết kế Wireframe cải tiến UI/UX giảm tỉ lệ drop\-off\.\- Viết User Stories chi tiết theo định dạng Gherkin \(`Given-When-Then`\) bao phủ mọi edge cases\.\- Phân tích số liệu phễu chuyển đổi trên Dashboard và đề xuất giải pháp nghiệp vụ\.|
|**DA**|\- Làm sạch dữ liệu cơ bản \(null, duplicates\)\. Phân tích thống kê mô tả: giá trung bình, biên độ dao động giá theo tháng/năm\. Vẽ biểu đồ xu hướng biến động giá đóng cửa cơ bản trên Excel/PowerBI\.|\- Thực hiện EDA sâu, tính toán chỉ báo kỹ thuật \(Moving Average, RSI, MACD\)\. Xây dựng mô hình dự báo giá đóng cửa \(Regression, Time Series ARIMA/Prophet\) và phát hiện mẫu biến động\. Thiết kế Dashboard tương tác chuyên nghiệp hiển thị phân tích kỹ thuật và viết báo cáo rủi ro danh mục đầu tư\.|



---



## IV\. LỘ TRÌNH CHI TIẾT \& LỊCH TRÌNH VẬN HÀNH



> \[\!NOTE\]
> 
> **Về vai trò của Mentor \& Quy trình báo cáo trong chương trình:**
> 
> 
> 
> - Mentor chỉ tham gia trực tiếp **30 phút/ứng viên mỗi ngày** vào 20h tối để tối ưu hóa thời gian trống và rèn luyện tính tự chủ của ứng viên\.
> 
> - **Nhịp làm việc quan trọng:** Ứng viên **code cả ngày**; buổi tối 20h là lúc Mentor **review / nghiệm thu** sản phẩm đã làm trong ngày \(không phải lúc mới bắt đầu giao việc để làm tối đó\)\.
> 
> - **Kick-off Ngày 1 \(tối\):** Mentor phải **hướng dẫn và giao luôn phần Auth**, để sáng Ngày 2 ứng viên code được ngay — tối Ngày 2 mới có sản phẩm Auth để review\.
> 
> - **Tối Ngày 2:** Review Auth xong, Mentor **hướng dẫn và giao phần Dashboard** để sáng Ngày 3 code ngay — tối Ngày 3 review Dashboard\.
> 
> - **Không cần gửi báo cáo cuối ngày bằng văn bản**\. Báo cáo tiến độ và review diễn ra trực tiếp trong 30 phút Mentor\.
> 
> - Trước buổi họp tối Ngày 2/3, ứng viên **push code/tài liệu lên repo Git cá nhân đã fork** \(hoặc thư mục Lark dùng chung nếu không phải Dev\) để Mentor xem trước\.
> 
> 



---



### NGÀY 1: KICK\-OFF \(TỐI\) — PHÂN LOẠI MỨC, BÀN GIAO TÀI NGUYÊN \& GIAO AUTH



- **Hoạt động với Mentor \(30 phút · 20h\)**:

    - Mentor gặp trực tiếp ứng viên để hướng dẫn thực tập, giải thích đề bài và **phân loại ngay mức năng lực đầu vào: Yếu \(Basic\) hoặc Khá \(Advanced\)** theo bảng phân hóa ở Mục III\.

    - **Bàn giao tài nguyên phân hóa theo mức** \(không giao chung một gói cho mọi ứng viên\):

        - **Mức Yếu**: Repo/template code mẫu đầy đủ hơn, bộ base component kèm hướng dẫn sử dụng, tài liệu nhiệm vụ Basic, Dataset NISP \(nếu là DA\) kèm notebook/file mẫu làm sạch dữ liệu\. **Với Dev: không kèm sẵn schema DB hoàn chỉnh** — học viên vẫn phải **tự thiết kế PostgreSQL**\.

        - **Mức Khá**: **Với Dev — repo chỉ bàn giao tài liệu hướng dẫn** \(đặc tả nghiệp vụ, gợi ý field/schema nếu có, checklist Advanced\); **không kèm template code / base component / schema DB sẵn** — ứng viên phải tự khởi tạo dự án, **tự thiết kế PostgreSQL**, và tự xây toàn bộ\. Các role khác: tài liệu nhiệm vụ Advanced, Dataset NISP gốc \(nếu là DA\) không kèm sẵn mô hình mẫu\.

    - **Với Dev — bắt buộc hướng dẫn và giao chi tiết nhiệm vụ luồng Auth \(Đăng nhập / Đăng ký\) ngay trong Kick-off**, kèm kỳ vọng sản phẩm sẽ review tối Ngày 2\. Giới thiệu sơ bộ Dashboard \(sẽ giao chi tiết sau khi review Auth tối Ngày 2\)\.

    - Giao danh sách nhiệm vụ chi tiết **đúng theo mức đã phân loại** và chốt kỳ vọng sản phẩm Ngày 1–3\.

- **Nhiệm vụ tự chủ sau Kick-off \(tối Ngày 1\)** — mục tiêu: **sáng Ngày 2 bắt đầu code Auth được ngay**:

    - **Dev — Yếu**: **Fork** repo template về GitHub cá nhân, clone về máy, cài đặt môi trường chạy local \(Next\.js + Java\)\. **Tự thiết kế và tạo cấu trúc DB trên PostgreSQL** \(không dùng sẵn schema hoàn chỉnh\)\. Nghiên cứu cấu trúc thư mục UI, học cách dùng bộ base component; **đọc kỹ đặc tả Auth đã được giao ở Kick-off**\.

    - **Dev — Khá**: **Fork** repo tài liệu hướng dẫn về GitHub cá nhân \(repo không kèm template code / base component\), tự khởi tạo dự án **Next\.js \(FE\) + Java \(BE\)**\. **Tự thiết kế và tạo cấu trúc DB trên PostgreSQL** \(có thể tham khảo gợi ý trong tài liệu\)\. **Đọc kỹ đặc tả Auth đã giao ở Kick-off**, phác thảo kiến trúc Auth \(Zod + OAuth + Turnstile\) sẵn sàng code sáng Ngày 2\.

    - **Tester — Yếu**: Trải nghiệm luồng đăng nhập/đăng ký hiện tại, đọc tài liệu đặc tả Basic\. Lập danh sách kịch bản kiểm thử Happy Path và dựng template Test Cases thủ công\.

    - **Tester — Khá**: Trải nghiệm luồng Auth, đọc đặc tả Advanced\. Lập checklist bao phủ Happy Path + edge cases \(BVA, security sơ bộ\) và chuẩn bị cấu trúc thư mục/tooling cho automation \(Playwright/Cypress\)\.

    - **BA — Yếu**: Khảo sát luồng đăng nhập/đăng ký hiện tại\. Phác thảo User Flow cơ bản và liệt kê validation rules dự kiến theo scope Basic\.

    - **BA — Khá**: Khảo sát luồng Auth hiện tại, ghi nhận điểm drop-off/UX issue\. Phác thảo User Flow nâng cao và khung UX Audit / Wireframe sẽ hoàn thiện ở Ngày 2\.

    - **DA — Yếu**: Cài đặt Python/R/PowerBI, tải dataset NISP \(gói Basic\), kiểm tra cấu trúc dữ liệu\. Làm sạch dữ liệu cơ bản theo hướng dẫn mẫu \(null, duplicates, định dạng ngày\)\.

    - **DA — Khá**: Cài đặt công cụ phân tích, tải dataset NISP gốc, kiểm tra cấu trúc tổng quan\. Tự thiết kế pipeline làm sạch và phác thảo hướng EDA / chỉ báo kỹ thuật / mô hình dự báo cho Ngày 2–3\.

- **Cuối ngày**:

    - Ứng viên **fork repo về tài khoản GitHub cá nhân**, rồi push code/tài liệu lên **repo fork** \(hoặc thư mục dùng chung của nhóm trên Lark nếu không phải Dev\)\. Trong commit/note cần **ghi rõ mức Yếu hoặc Khá** đã được phân loại\. Dev phải sẵn sàng **code Auth từ sáng Ngày 2**\.

        

---



### NGÀY 2: BAN NGÀY CODE AUTH — TỐI REVIEW AUTH \& GIAO DASHBOARD



- **Nhiệm vụ tự chủ ban ngày** \(ứng viên đã nhận nhiệm vụ Auth từ Kick-off Ngày 1\):

    - **Dev**:

        - *Yếu*: Code giao diện Auth trên **Next\.js** sử dụng base component sẵn có, viết hàm validate cơ bản và dựng API Auth/CRUD cơ bản bằng **Java**\.

        - *Khá*: **Tự xây toàn bộ** Auth trên stack **Next\.js + Java**: UI + API, validation \(Zod schema hoặc tương đương\), Google OAuth và Turnstile\.

    - **BA**:

        - *Yếu*: Viết User Stories chi tiết, vẽ User Flow chính xác\.

        - *Khá*: Thiết kế UI/UX Wireframe cải tiến, hoàn thiện đặc tả nghiệp vụ nâng cao\.

    - **Tester**:

        - *Yếu*: Thiết kế bộ Test Cases chi tiết cho các luồng Auth cơ bản\.

        - *Khá*: Thiết kế bộ Test Cases nâng cao cho Auth \(BVA, Security, SQL injection, XSS\)\. Bắt đầu chuẩn bị automation test scripts\.

    - **DA**:

        - *Yếu*: Thống kê mô tả \(Descriptive Statistics\), vẽ biểu đồ xu hướng giá đóng cửa\.

        - *Khá*: Phân tích EDA tài chính nâng cao, tính toán các chỉ báo kỹ thuật \(MA, RSI, MACD\)\.

    - **Tích hợp nhóm**: Dev \& BA khớp giao diện Auth với User Story\. Dev chuyển bản build Auth sớm cho Tester\. Tester chạy test thủ công trên bản build nháp của Dev và log bug lên Lark/GitHub\. DA phác thảo Dashboard phân tích cổ phiếu NISP và chạy thử mô hình dự báo giá đóng cửa\.

- **Trước 20h**: Push code/tài liệu lên **repo Git cá nhân đã fork** \(hoặc Lark\) để Mentor xem trước\.

- **Hoạt động với Mentor \(30 phút · 20h\)** — **review sản phẩm đã làm trong ngày, không phải lúc mới bắt đầu giao Auth**:

    - Ứng viên demo / báo cáo **Auth \(hoặc sản phẩm role tương ứng\) đã làm trong Ngày 2**\.

    - Mentor **review / nghiệm thu**, góp ý sửa\. **Không đổi mức phân loại** trừ trường hợp đặc biệt có xác nhận của Ban Đào tạo\.

    - **Với Dev:** sau khi review Auth, Mentor **hướng dẫn và giao chi tiết nhiệm vụ Dashboard thống kê** để sáng Ngày 3 code được ngay\.

        

---



### NGÀY 3: BAN NGÀY CODE DASHBOARD — TỐI REVIEW DASHBOARD \& HOÀN THIỆN



- **Nhiệm vụ tự chủ ban ngày** \(Dev đã nhận nhiệm vụ Dashboard từ tối Ngày 2\):

    - **Dev**:

        - *Yếu*: Code **Dashboard thống kê** nhân khẩu học \(API Java + UI Next\.js\); sửa lỗi Auth theo góp ý tối Ngày 2; dọn mã nguồn; hoàn thiện README\.

        - *Khá*: Code **Dashboard thống kê** với **Stored Procedure bắt buộc** \(Java gọi SP\); sửa lỗi Auth; bảo mật SQL Injection/XSS; clean code; hoàn thiện README\.

    - **Tester**: Chạy Regression Test trên Auth, bổ sung testcase Dashboard nếu kịp, đóng gói báo cáo Test Report\.

    - **BA**: Nghiệm thu sản phẩm chạy thật của Dev \(Auth + Dashboard\) so với Acceptance Criteria đã viết\.

    - **DA**: Tinh chỉnh Dashboard tương tác, tối ưu mô hình dự báo và hoàn thiện các biểu đồ phân tích\.

    - **Chuẩn bị bảo vệ**: Kiểm tra tích hợp lần cuối; **báo cáo bằng demo sản phẩm** \(không bắt buộc làm slide\)\.

- **Trước 20h**: Push bản gần cuối lên **repo fork** / Lark để Mentor xem trước\.

- **Hoạt động với Mentor \(30 phút · 20h\)** — **review Dashboard / sản phẩm đã làm trong ngày**:

    - Ứng viên **demo sản phẩm** đã làm trong Ngày 3\.

    - Mentor **review / nghiệm thu**, chốt việc còn thiếu trước bảo vệ Ngày 4\.

- **Cuối ngày**:

    - Ứng viên push toàn bộ mã nguồn/tài liệu bản cuối lên **repo Git cá nhân đã fork** \(hoặc hệ thống Lark tương ứng\) để Hội đồng xem trước buổi bảo vệ sáng Ngày 4\. **Không bắt buộc nộp slide** — buổi bảo vệ tập trung **demo sản phẩm**\.

        

---



### NGÀY 4: TỔNG KẾT, NGHIỆM THU \& ĐỊNH HƯỚNG KẾ TIẾP



- **Hoạt động chính \(Nghiệm thu \& Push Sale\)**:

    - **Nghiệm thu sản phẩm cùng Mentor \& Sale**:

        - Ứng viên gặp trực tiếp **Mentor** và **Sale** để demo sản phẩm chạy thật \(đối với Dev/Test/BA\) hoặc trình bày Dashboard và báo cáo đề xuất \(đối với DA\)\.

        - Mentor cùng Sale tiến hành nghiệm thu nhanh các đầu việc đã bàn giao, nhận xét ưu/nhược điểm và đánh giá chung về năng lực, thái độ của ứng viên sau 3 ngày trải nghiệm\.

    - **Tư vấn \& Thúc đẩy đăng ký \(Push Sale\)**:

        - Sau khi nghiệm thu xong, **Mentor rời phòng họp**\.

        - Đại diện bộ phận **Sale ở lại** để trao đổi riêng với ứng viên, tư vấn định hướng lộ trình chương trình thực tập chính thức 3 tháng tại IOC và khuyến khích, thúc đẩy ứng viên đăng ký tham gia khóa học/thực tập chính thức\.

            

---



## V\. SẢN PHẨM BÀN GIAO YÊU CẦU \(DELIVERABLES\)



Đến cuối ngày 3, ứng viên bắt buộc phải nộp đầy đủ các sản phẩm sau để làm căn cứ đánh giá:



### 1\. Vị trí Developer



- Mã nguồn hoàn chỉnh được push lên **repo GitHub cá nhân đã fork** theo quy chuẩn của dự án\.

- Demo được đủ **2 luồng:** Auth \(Đăng nhập/Đăng ký\) và Dashboard thống kê\.

- Không còn lỗi compile, không còn code thừa hoặc log debug\.

- File `README.md` hướng dẫn cách setup và chạy chương trình dưới local \(Next\.js + Java + PostgreSQL\)\.

- Học viên phải **tự thiết kế cấu trúc DB trên PostgreSQL** \(áp dụng cả mức Yếu và Khá\)\.

- **Báo cáo / bảo vệ bằng demo sản phẩm** — không bắt buộc làm slide\.

    

### 2\. Vị trí Tester



- File Excel/Lark Table chứa bộ Test Cases chi tiết\.

- Danh sách Bug Report được log đầy đủ \(trên GitHub Issues hoặc Lark Base\)\.

- File báo cáo kết quả kiểm thử \(Test Report\) tổng hợp tỷ lệ pass/fail và đánh giá mức độ ổn định\.

    

### 3\. Vị trí BA



- Tài liệu User Stories kèm theo Acceptance Criteria \(AC\) dạng Markdown hoặc Lark Doc\.

- Sơ đồ User Flow và tài liệu phân tích UX/UI\.

- Tham gia **demo / nghiệm thu sản phẩm** cùng Dev \(không bắt buộc làm slide\)\.

    

### 4\. Vị trí DA



- Mã nguồn phân tích dữ liệu \(Jupyter Notebook `.ipynb` hoặc file script Python `.py`\)\.

- File báo cáo phân tích kinh doanh dạng PDF/Word \(Executive Summary\)\.

- Đường link truy cập Dashboard tương tác \(PowerBI/Tableau hoặc ảnh chụp màn hình dashboard đầy đủ\)\.

    

---



## VI\. TIÊU CHÍ \& BIỂU ĐIỂM ĐÁNH GIÁ ĐẦU RA



Mentor sẽ đánh giá ứng viên dựa trên thang điểm 100, chia làm 4 cột điểm chính:



|STT|Nhóm Tiêu Chỉ|Trọng Số|Mô Tả Chi Tiết|
|---|---|---|---|
|1|**Chất lượng Kỹ thuật \& Chuyên môn \(Hard Skills\)**|**40%**|\-**Dev**: Code chạy đúng yêu cầu, sạch, tuân thủ standard, áp dụng đúng cấu trúc dữ liệu và giải thuật\.\- **Tester**: Testcase bao phủ tốt các trường hợp, log bug chính xác\.\- **BA**: Tài liệu rõ ràng, logic nghiệp vụ chặt chẽ\.\- **DA**: Phân tích dữ liệu chính xác, dashboard trực quan, mô hình dự báo có cơ sở khoa học\.|
|2|**Kỷ luật \& Tác phong làm việc \(Discipline\)**|**30%**|\- Tham gia đầy đủ và đúng giờ các buổi họp Daily Morning Sync và Daily Chokai\.\- Commit/Push code đều đặn, cập nhật trạng thái task thường xuyên trên bảng quản lý công việc\.\- Hoàn thành sản phẩm đúng deadline\.|
|3|**Kỹ năng Giao tiếp \& Phối hợp \(Hou\-Ren\-So\)**|**20%**|\- Biết cách báo cáo vấn đề ngắn gọn, mạch lạc\.\- Khi gặp blocker, áp dụng đúng quy trình Hou\-Ren\-So \(nêu vấn đề \-\> các cách đã thử \-\> đề xuất hỗ trợ\)\.\- Phối hợp mượt mà với các thành viên khác trong nhóm\.|
|4|**Tốc độ tự học \& Thích ứng \(Adaptability\)**|**10%**|\- Khả năng nhanh chóng tiếp thu kiến thức mới để áp dụng vào bài test\.\- Tinh thần cầu thị, lắng nghe phản hồi từ Mentor và sửa đổi sản phẩm nhanh chóng\.|



---



*Tài liệu này được ban hành bởi Ban Đào Tạo \& Mentor tại Internship OneConnect \(IOC\)\. Mọi thắc mắc trong quá trình thực hiện vui lòng trao đổi trực tiếp với Mentor hướng dẫn\.*

