# TỔNG HỢP CÂU HỎI VÀ ĐÁP ÁN BÀI ĐÁNH GIÁ

## PHẦN 1: CẤU TRÚC DỮ LIỆU (Data Structures)

### **Câu hỏi 1 (Question 1 of 12)**

**Câu hỏi:** Một quy trình xử lý dữ liệu lưu trữ các khoảng thời gian của cảm biến trong một mảng có kích thước cố định. Trong quá trình chèn thường xuyên vào giữa mảng, hệ thống phải dịch chuyển nhiều phần tử, gây ra độ trễ cao. Điều này dẫn đến các tổng hợp không chính xác trong các tính toán thời gian thực vì hệ thống không thể theo kịp các điều kiện cập nhật biến động liên tục. Để hiểu tại sao hiệu suất trở nên không ổn định, phát biểu nào mô tả chính xác độ phức tạp thời gian của việc chèn một phần tử vào giữa một mảng tiêu chuẩn?

**Các lựa chọn:**

* O(n²) — mỗi lần chèn yêu cầu các vòng lặp lồng nhau
* O(1) — thời gian hằng số, không cần dịch chuyển
* O(n) — việc dịch chuyển các phần tử làm cho việc chèn chậm hơn khi mảng lớn lên
* O(log n) — việc chèn yêu cầu tìm kiếm nhị phân

### **Câu hỏi 3 (Question 3 of 12)**

**Câu hỏi:** Một mô-đun xác thực dữ liệu sẽ sử dụng các cấu trúc dữ liệu khác nhau như mảng (array), ngăn xếp (stack) và hàng đợi (queue) để xử lý các đầu vào. Khi khối lượng đầu vào tăng lên, nhóm phải chọn các thuật toán duy trì sự hiệu quả ngay cả đối với các tập dữ liệu lớn. Loại phân tích nào giúp so sánh cách các thuật toán hoặc cấu trúc dữ liệu khác nhau hoạt động khi kích thước đầu vào tăng lên?

**Các lựa chọn:**

* Phân tích độ phức tạp tiệm cận (Asymptotic complexity analysis)
* Chạy thử nghiệm theo thời gian tuần tự (Sequential timed test runs)
* So sánh cấu trúc phân lớp (Layered structural comparisons)
* Lấy mẫu thông lượng ngẫu nhiên (Randomized throughput sampling)

### **Câu hỏi 4 (Question 4 of 12)**

**Câu hỏi:** Một chuyên gia phân tích dữ liệu nhận thấy rằng khi cơ sở dữ liệu khách hàng của công ty tăng từ 1.000 lên 1.000.000 bản ghi, công cụ tìm kiếm của họ trở nên chậm hơn đáng kể. Để đảm bảo công cụ vẫn nhanh và có thể dự đoán được bất kể có bao nhiêu dữ liệu được thêm vào, điều chỉnh nào là hiệu quả nhất?

**Các lựa chọn:**

* Sử dụng Ngăn xếp (Stack) thay vì Mảng (Array) để lưu trữ
* Tăng tần suất quét toàn bộ cơ sở dữ liệu
* Nâng cấp phần cứng lên CPU nhanh hơn
* Chuyển từ Tìm kiếm tuyến tính (Linear Search) sang Tìm kiếm nhị phân (Binary Search)

### **Câu hỏi 6 (Question 6 of 12)**

**Câu hỏi:** Một hệ thống phân tích tài liệu chia các báo cáo lớn thành các phần nhỏ hơn để trích xuất các bản tóm tắt. Đối với các tài liệu lồng nhau sâu (phần -> tiểu phần -> tiểu tiểu phần), bộ đánh giá đệ quy đôi khi đi quá sâu, gây ra sự mất ổn định và kết quả không nhất quán. Để giữ cho quá trình xử lý đáng tin cậy, hệ thống cần một phương pháp giới hạn độ sâu đệ quy trong khi vẫn kết hợp các kết quả một phần một cách chính xác theo cách có thể dự đoán được. Phương pháp nào cải thiện tính nhất quán tốt nhất trong tình huống này?

**Các lựa chọn:**

* Tạo thêm các nhánh trùng lặp để phân tích nhiều đường dẫn hơn
* Khám phá toàn bộ tất cả các cấp độ lồng nhau bất kể độ sâu
* Sử dụng phân đoạn đệ quy có cấu trúc (structured recursive segmentation)
* Tăng cường quay lui (backtracking) qua các nhánh giống nhau lặp đi lặp lại

### **Câu hỏi 7 (Question 7 of 12)**

**Câu hỏi:** Một bảng băm (hashmap) được sử dụng để tra cứu nhanh bắt đầu tạo ra các truy xuất không nhất quán khi xung đột khóa (key collisions) tăng lên. Sửa đổi cấu trúc nào đảm bảo hiệu suất truy cập ổn định trong các điều kiện tập dữ liệu đang mở rộng?

**Các lựa chọn:**

* Thêm sơ đồ dò tìm cân bằng (balanced probing scheme)
* Bỏ qua tần suất xung đột
* Tăng dung lượng nhóm (bucket capacity)
* Chèn các nhóm khóa ngẫu nhiên

### **Câu hỏi 8 (Question 8 of 12)**

**Câu hỏi:** Một dịch vụ xử lý nhật ký (log) nhận được các lô bản ghi sự kiện chưa được sắp xếp thường xuyên từ các cảm biến phân tán. Trong thời gian lưu lượng truy cập tăng đột biến, hệ thống phải liên tục sắp xếp các tập dữ liệu có kích thước trung bình để các sự kiện có thể được xử lý theo đúng thứ tự. Việc sắp xếp với độ phức tạp thời gian bậc hai (quadratic time) gây ra sự chậm trễ và sự gia tăng đột biến không thể đoán trước làm cho hiệu suất ổn định, có thể mở rộng trở nên thiết yếu. Chiến lược sắp xếp nào duy trì tốt nhất hành vi có thể dự đoán được trong khối lượng công việc biến động?

**Các lựa chọn:**

* Xáo trộn ngẫu nhiên lô trước khi sắp xếp
* Sao chép công việc hợp nhất (merging) nhiều lần
* Mở rộng các vòng sắp xếp bậc hai (ví dụ: sắp xếp nổi bọt/chọn)
* Sử dụng thuật toán sắp xếp trộn dựa trên phương pháp chia để trị (divide-and-conquer merge-based sort)

### **Câu hỏi 9 (Question 9 of 12) - Chọn nhiều đáp án**

**Câu hỏi:** Một hệ thống tối ưu hóa danh mục đầu tư tài chính phải chọn một tập con các tài sản để tối đa hóa lợi nhuận kỳ vọng trong khi vẫn tuân thủ các giới hạn ngân sách nghiêm ngặt và các ràng buộc về rủi ro. Mỗi tài sản có một chi phí liên quan, lợi nhuận kỳ vọng và điểm rủi ro. Hệ thống phải tạo ra các danh mục đầu tư tối ưu hoặc được chứng minh là gần như tối ưu, duy trì khả năng tính toán có thể mở rộng và xử lý các tính toán lại thường xuyên khi điều kiện thị trường thay đổi. Các phương pháp thuật toán nào sau đây là phù hợp nhất để giải quyết vấn đề này?

**Các lựa chọn:**

* Chia các lớp tài sản bằng phương pháp chia để trị
* Sử dụng đệ quy với các bài toán con chồng chéo (overlapping subproblems)
* Áp dụng quy hoạch động (dynamic programming) tương tự như bài toán cái túi (knapsack)
* Sắp xếp tài sản theo tỷ lệ lợi nhuận trên rủi ro
* Chọn tài sản theo thuật toán tham lam (greedily) dựa trên lợi nhuận cao nhất

### **Câu hỏi 10 (Question 10 of 12)**

**Câu hỏi:** Một tập dữ liệu lớn được xử lý bằng một bảng băm (hashmap) theo dõi số lượng tổng hợp cho các khóa động. Trong quá trình tính toán cao điểm, một số khóa nhất định bất ngờ ghi đè lên các giá trị hiện có. Phương pháp nào đảm bảo cập nhật chính xác trong khi duy trì hiệu suất nhất quán trong các hoạt động chèn và cập nhật thường xuyên?

**Các lựa chọn:**

* Sử dụng danh sách đã sắp xếp để lập chỉ mục
* Tạo lại bảng băm trên mỗi lần cập nhật
* Thay thế bảng băm bằng mảng cố định
* Sử dụng các thao tác cập nhật nguyên tử (atomic update operations)

### **Câu hỏi 11 (Question 11 of 12) - Chọn nhiều đáp án**

**Câu hỏi:** Một công cụ đề xuất thương mại điện tử phân tích khối lượng lớn dữ liệu hành vi lịch sử của người dùng (số lần nhấp, mua hàng, xếp hạng) để tạo bảng xếp hạng sản phẩm được cá nhân hóa. Hệ thống phải đảm bảo tính ổn định của xếp hạng, có khả năng mở rộng trên hàng triệu người dùng và mặt hàng, đồng thời tái sử dụng các tính toán trước đó để đáp ứng các yêu cầu về độ trễ trong thời gian lưu lượng truy cập cao điểm. Các phương pháp thuật toán nào sau đây là hiệu quả nhất để thiết kế một hệ thống đề xuất như vậy?

**Các lựa chọn:**

* Phân khúc người dùng bằng phương pháp chia để trị
* Sử dụng lựa chọn tham lam mà không tính toán lại mức độ liên quan
* Sắp xếp các đề xuất bằng thuật toán sắp xếp trộn (merge sort)
* Sử dụng phân cụm đệ quy không cần ghi nhớ (memoization)
* Sử dụng quy hoạch động để tái sử dụng điểm tương đồng

### **Câu hỏi 12 (Question 12 of 12)**

**Câu hỏi:** Một luồng công việc (workflow) thực thi các tác vụ tuần tự, đôi khi kích hoạt các bước khôi phục (rollback) đòi hỏi phải đảo ngược ngay lập tức hành động gần nhất. Cấu trúc nào quản lý các hoạt động này một cách hiệu quả?

**Các lựa chọn:**

* Kiểm soát hành động dựa trên Ngăn xếp (Stack-based action control)
* Nhóm phần tử không có thứ tự (Unordered element grouping)
* Hàng đợi dựa trên mức độ ưu tiên (Priority-driven queueing)
* Chuỗi danh sách dựa trên độ dài (Length-based list chaining)

## PHẦN 2: PHÁT TRIỂN ỨNG DỤNG (Application Development - Lập trình)

### **Câu hỏi 1 (Question 1 of 3)**

**Tiêu đề:** Chi phí của Chuỗi (Cost of the String)

Một chuỗi mã hóa được định nghĩa là một chuỗi trong đó mỗi ký tự (từ 'a' đến 'z') được thay thế bằng một chữ số nhị phân theo quy tắc sau:

* Nếu ký tự là nguyên âm, thay thế ký tự bằng chữ số nhị phân '1'.
* Nếu ký tự là phụ âm, thay thế ký tự bằng chữ số nhị phân '0'.

Cho một chuỗi `S`, bao gồm các chữ cái viết thường của bảng chữ cái tiếng Anh. Chuyển đổi chuỗi `S` thành một chuỗi mã hóa và sau đó tính toán chi phí của chuỗi mã hóa `S`.
Chi phí của chuỗi mã hóa là giá trị thập phân của chuỗi mã hóa đó.

In ra chi phí của chuỗi nhị phân.

**Lưu ý:**

* Chuỗi `S` chỉ bao gồm các chữ cái tiếng Anh viết thường.

**Mô tả Hàm:**
Trong đoạn mã được cung cấp, hãy triển khai phương thức `binaryString(...)` để in ra chi phí của chuỗi nhị phân. Bạn có thể viết mã của mình trong không gian bên dưới cụm từ "WRITE YOUR LOGIC HERE".

**Ràng buộc:**

* 1 <= S.size() <= 30

**Định dạng Đầu vào:**
Đầu vào chứa một chuỗi, `S`.

**Đầu vào Mẫu:**
`abcd`

**Định dạng Đầu ra:**
Đầu ra chứa một số nguyên duy nhất biểu thị chi phí của chuỗi nhị phân.

### **Câu hỏi 3 (Question 3 of 3)**

**Tiêu đề:** Sức khỏe Tối đa (Maximum Health)

Cho một mảng số nguyên `A` có kích thước `N`. Mỗi số nguyên trong mảng có thể là số dương hoặc số âm.
Bạn cũng có một số `X`, là số lượng phần tử tối đa bạn có thể chọn từ mảng.

Sức khỏe ban đầu của bạn là 0. Bạn có thể chọn tối đa `X` số từ mảng.

Dưới đây là cách việc chọn số ảnh hưởng đến sức khỏe của bạn:

* Nếu bạn chọn một số âm, sức khỏe của bạn tăng lên bằng giá trị tuyệt đối của nó. (Ví dụ: chọn -4 làm tăng sức khỏe thêm 4)
* Nếu bạn chọn một số dương, sức khỏe của bạn giảm đi bằng số đó. (Ví dụ: chọn 5 làm giảm sức khỏe đi 5)

Mục tiêu của bạn là chọn các số sao cho sức khỏe cuối cùng của bạn cao nhất có thể.

In ra sức khỏe cuối cùng cao nhất có thể.

**Lưu ý:**
Bạn không thể chọn quá `X` phần tử trong mảng, và có thể bạn không chọn bất kỳ phần tử nào từ mảng.

**Định dạng Đầu vào:**

* Dòng đầu tiên chứa hai số nguyên, `N` và `X`, lần lượt biểu thị kích thước của Mảng và số nguyên được cho.
* Dòng thứ hai chứa `N` số nguyên cách nhau bằng khoảng trắng, biểu thị các phần tử của mảng `A`.

## PHẦN 3: SQL VÀ CƠ SỞ DỮ LIỆU (SQL and Databases)

### **Câu hỏi 1 (Question 1 of 4)**

**Câu hỏi:** Kết quả đầu ra sẽ là gì sau khi thực thi lệnh ping sau với đối số (như được hiển thị)?
`ping "sample"`

**Các lựa chọn:**

* pong
* connection refused (kết nối bị từ chối)
* connection close (đóng kết nối)
* sample

### **Câu hỏi 2 (Question 2 of 4)**

**Câu hỏi:** Bạn muốn viết một chú thích nhiều dòng (multiline comment) trong thủ tục lưu trữ (stored procedure) của mình để dễ đọc hơn. Bạn có thể sử dụng ký hiệu nào để ngăn việc thực thi các dòng cụ thể trong mã của mình?

**Các lựa chọn:**

* `-`
* `--`
* `/*` và `*/`
* `*`

### **Câu hỏi 3 (Question 3 of 4)**

**Câu hỏi:** Viết một lệnh cho các tác vụ được cho sau đây:

1. Chặn máy khách (client) trong 120 giây không cho thực thi bất kỳ lệnh nào.
2. Nếu dữ liệu đến trong danh sách `test1`, nó sẽ hiển thị dữ liệu và đẩy dữ liệu đó sang một danh sách khác tên là `test2`, nếu không thì trả về nil.

**Các lựa chọn:**

* BRLPUSH test1 test2 120
* BRPOPLPUSH test1 test2 120 timeout
* Insert test1 test2 120 timeout
* BRPOPLPUSH test1 test2 120

### **Câu hỏi 4 (Question 4 of 4)**

**Câu hỏi:** Ghép nối các hàm đã cho với các chức năng của chúng.

* I. Rand
* II. CHARINDEX
* III. PI
* IV. NOW
* A. Tìm vị trí của một chuỗi con trong một chuỗi
* B. Lấy một số ngẫu nhiên trong một phạm vi
* C. Trả về ngày và giờ hiện tại
* D. Trả về giá trị của pi

**Các lựa chọn:**

* I - A, II - B, III - C, IV - D
* I - B, II - C, III - A, IV - D
* I - B, II - A, III - D, IV - C
* I - D, II - B, III - A, IV - C
