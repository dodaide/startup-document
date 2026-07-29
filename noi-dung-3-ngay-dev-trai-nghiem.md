# NỘI DUNG 3 NGÀY — VỊ TRÍ DEVELOPER

> Chương trình **3-Day Reality Experience** · Internship OneConnect (IOC)  
> Nhánh: Module Auth + Phân tích nhân khẩu học người dùng đăng ký

---

## Tổng quan nhanh


| Ngày  | Ban ngày                            | Buổi tối Mentor 20h · 30 phút                                                         |
| ----- | ----------------------------------- | ------------------------------------------------------------------------------------- |
| **1** |                                     | **Kick-off:** chốt lộ trình, bàn giao tài nguyên, **hướng dẫn & giao luôn phần Auth** |
| **2** | Code **luồng Auth** cả ngày         | **Review / nghiệm thu Auth** + hướng dẫn & giao phần **Dashboard** cho Ngày 3         |
| **3** | Code **Dashboard thống kê** cả ngày | **Review / nghiệm thu Dashboard** + chốt sản phẩm sẵn demo                            |
| **4** | Demo với Mentor *(sáng)*            | —                                                                                     |


**Nguyên tắc chung**

- Mentor gặp **30 phút/ngày vào 20h**.
- **Làm đủ 2 luồng:** Auth (Ngày 2) + Dashboard thống kê (Ngày 3).
- **Stack bắt buộc:** Frontend **Next.js** · Backend **Java** · Database **PostgreSQL**.
- **Cấu trúc DB:** Cả lộ trình Cơ bản và Nâng cao đều **phải tự thiết kế và tự tạo schema** trên PostgreSQL (không dùng sẵn DB có sẵn đầy đủ từ Mentor).
- Trước buổi Mentor review: **push code** lên **repo Git cá nhân đã fork** để Mentor xem trước.
- Báo cáo theo Hou-Ren-So: *Đã làm → Blocker (đã thử gì) → Cần hỗ trợ → Plan tiếp*.

---



## NGÀY 1 — Kick-off (tối): chọn lộ trình, setup & giao Auth



### Buổi Mentor (20h · 30 phút) — bắt buộc làm đủ

1. Giải thích đề bài tổng quan (Auth + Dashboard nhân khẩu học)
2. Chốt lộ trình học: Cơ bản (Basic) hoặc Nâng cao (Advanced)
3. Bàn giao tài nguyên đúng theo lộ trình (fork repo / docs)
4. **Hướng dẫn chi tiết + giao nhiệm vụ luồng Auth**



#### Lộ trình CƠ BẢN


| #   | Việc                                                                               | Kết quả mong đợi                            |
| --- | ---------------------------------------------------------------------------------- | ------------------------------------------- |
| 1   | **Fork** repo template về GitHub cá nhân, rồi clone về máy                         | Có repo fork + mã nguồn trên máy            |
| 2   | Cài dependency + chạy local theo README mẫu (Next.js + Java)                       | FE Next.js và BE Java chạy được             |
| 3   | **Tự thiết kế & tạo cấu trúc DB** trên **PostgreSQL** (bảng Auth/user theo đặc tả) | Schema tự làm, kết nối Java ↔ PostgreSQL OK |
| 4   | Nghiên cứu cấu trúc thư mục + base component                                       | Import & dùng được 1–2 component mẫu        |
| 5   | Đọc kỹ đặc tả / checklist **Auth đã được giao ở Kick-off**                         | Sáng Ngày 2 biết rõ cần code gì             |




#### Lộ trình NÂNG CAO


| #   | Việc                                                                                                       | Kết quả mong đợi                                    |
| --- | ---------------------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| 1   | **Fork** repo tài liệu hướng dẫn về GitHub cá nhân                                                         | Có repo fork chứa đặc tả, schema gợi ý              |
| 2   | **Tự khởi tạo** dự án **Next.js** + **Java** trên repo cá nhân                                             | Chạy được local                                     |
| 3   | **Tự thiết kế & tạo cấu trúc DB** trên **PostgreSQL** (theo đặc tả; có thể tham khảo gợi ý trong tài liệu) | Schema tự làm, kết nối Java ↔ PostgreSQL OK         |
| 4   | Đọc kỹ đặc tả **Auth đã được giao ở Kick-off** + phác thảo kiến trúc Auth                                  | Zod + OAuth + Turnstile — sẵn sàng code sáng Ngày 2 |




### Kết thúc Ngày 1

- [ ] Đã chốt lộ trình + nhận đúng gói tài nguyên
- [ ] Đã được **hướng dẫn & giao phần Auth**
- [ ] Setup xong, sáng Ngày 2 **bắt đầu code Auth được ngay**
- [ ] Push lên **repo fork** (ghi rõ lộ trình)

---



## NGÀY 2 — Ban ngày: code Auth · Tối: review Auth + giao Dashboard



### Ban ngày — tự code luồng Auth (theo đúng lộ trình đã giao từ Kick-off)



#### Lộ trình CƠ BẢN — Auth


| Hạng mục     | Chi tiết                                                                     |
| ------------ | ---------------------------------------------------------------------------- |
| **Frontend** | UI Đăng nhập / Đăng ký trên **Next.js**, đúng layout bằng **base component** |
| **Validate** | Zod schema (hoặc tương đương)                                                |
| **Backend**  | API Auth / CRUD người dùng cơ bản bằng **Java**                              |




#### Lộ trình NÂNG CAO — Auth


| Hạng mục           | Chi tiết                                                                             |
| ------------------ | ------------------------------------------------------------------------------------ |
| **Tự xây toàn bộ** | Không dùng template / base component — tự thiết kế UI **Next.js** + Backend **Java** |
| **Validate**       | Zod schema (hoặc tương đương)                                                        |
| **Bảo mật UI**     | Google OAuth + Cloudflare Turnstile                                                  |
| **Backend Auth**   | Tự viết API Auth bằng **Java**                                                       |
| **Security**       | Chống SQL Injection / XSS trên luồng Auth                                            |




### Phạm vi nghiệp vụ Auth

**Form Đăng nhập:** email / password · *(Nâng cao)* Turnstile + Google OAuth2  

**Form Đăng ký:** `fullName`, email, SĐT, `studentYear`, `vietnamUniversityId` (autocomplete), `joinPurposes`, `interestedRoleIds` · *(Nâng cao)* Captcha + kích hoạt email (nếu trong scope)

### Buổi Mentor tối Ngày 2 (20h · 30 phút) — Review Auth, không phải lúc mới bắt đầu code

1. Học viên demo / báo cáo **Auth đã làm trong ngày**
2. Mentor **review / nghiệm thu Auth**, góp ý sửa
3. Mentor **hướng dẫn & giao nhiệm vụ Dashboard thống kê** cho Ngày 3 (để sáng Ngày 3 code ngay)

---



## NGÀY 3 — Ban ngày: code Dashboard · Tối: review Dashboard + hoàn thiện



### Ban ngày — tự code Dashboard (theo đúng nhiệm vụ đã giao tối Ngày 2)



#### Lộ trình CƠ BẢN — Dashboard


| Hạng mục      | Chi tiết                                                                  |
| ------------- | ------------------------------------------------------------------------- |
| **Frontend**  | Dashboard thống kê trên **Next.js** (base component / chart nếu được cấp) |
| **Backend**   | API thống kê nhân khẩu học bằng **Java**                                  |
| **Song song** | Sửa bug Auth theo góp ý tối Ngày 2                                        |




#### Lộ trình NÂNG CAO — Dashboard


| Hạng mục      | Chi tiết                                                              |
| ------------- | --------------------------------------------------------------------- |
| **Frontend**  | Tự xây Dashboard Admin trên **Next.js** (biểu đồ + bộ lọc)            |
| **Backend**   | Thống kê bằng **Stored Procedure (SP)** bắt buộc; Java API chỉ gọi SP |
| **Security**  | Chống SQL Injection / XSS trên luồng thống kê                         |
| **Song song** | Sửa bug Auth theo góp ý tối Ngày 2                                    |




### Phạm vi nghiệp vụ Dashboard (cả hai lộ trình)

- Line/Area: xu hướng đăng ký theo thời gian
- Doughnut: theo năm học / role quan tâm / mục tiêu
- Lọc theo khoảng ngày + UTM (nếu kịp)
- *(Nâng cao)* Dữ liệu từ **Stored Procedure**



### Buổi Mentor tối Ngày 3 (20h · 30 phút) — Review Dashboard

1. Học viên demo **Dashboard đã làm trong ngày** (+ Auth đã chỉnh)
2. Mentor **review / nghiệm thu Dashboard**
3. Chốt việc còn lại: clean code, `README.md` — chuẩn bị **demo sản phẩm** Ngày 4



### Deliverables bắt buộc (nộp cuối Ngày 3)

1. Mã nguồn trên **repo GitHub cá nhân đã fork**
2. Không lỗi compile, không code thừa / log debug
3. `README.md` setup local (Next.js + Java + **PostgreSQL**)
4. **Demo được đủ 2 luồng:** Auth + Dashboard thống kê

> Báo cáo / bảo vệ: **demo sản phẩm là đủ** — không cần chuẩn bị slide.

---



## NGÀY 4 — Nghiệm thu (tham khảo)

- Demo sản phẩm chạy thật với **Mentor**
- Mentor nhận xét → định hướng lộ trình OJT

---



## Script báo cáo 30 giây (dùng mỗi tối review)

```
Lộ trình: Cơ bản / Nâng cao
Luồng tonight review: Auth (Ngày 2) / Dashboard (Ngày 3)

Đã làm trong ngày:
- …

Blocker:
- … (đã thử: A, B)

Cần hỗ trợ:
- …

Plan tiếp theo:
- …
```

---



## Tiêu chí chấm (nhắc nhanh)


| Tiêu chí                                                      | Trọng số |
| ------------------------------------------------------------- | -------- |
| Hard skills (code chạy, sạch, đúng yêu cầu **theo lộ trình**) | **40%**  |
| Kỷ luật (đúng giờ, push đều lên repo fork, đúng deadline)     | **30%**  |
| Hou-Ren-So & phối hợp                                         | **20%**  |
| Tự học & thích ứng                                            | **10%**  |


