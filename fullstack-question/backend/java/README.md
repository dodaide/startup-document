# Câu hỏi phỏng vấn Java

![](./assets/java.jpg)

# Java là gì?

Java là ngôn ngữ lập trình hướng đối tượng, bậc cao, đa nền tảng (“write once, run anywhere”). Mã nguồn biên dịch thành bytecode chạy trên **JVM** (Java Virtual Machine). Java được dùng rộng rãi cho backend doanh nghiệp, Android, big data, microservices, v.v.

**Ưu điểm tiêu biểu:**
- **Đa nền tảng**: bytecode + JVM giúp chạy trên nhiều OS.
- **Hệ sinh thái lớn**: thư viện, framework (Spring, Jakarta EE), công cụ build (Maven, Gradle).
- **Quản lý bộ nhớ tự động**: garbage collector; không cần `free`/`delete` như C/C++.
- **An toàn kiểu mạnh**, hỗ trợ đa luồng, reflection, generics.

Vì Java phổ biến trong doanh nghiệp, nên chuẩn bị cả câu hỏi cơ bản và nâng cao sẽ giúp phỏng vấn tốt hơn.

## Mục lục

[1. Java khác với C/C++ như thế nào?](#1-java-khác-với-cc-như-thế-nào)

[2. JVM là gì?](#2-jvm-là-gì)

[3. Bộ dọn rác trong Java?](#3-bộ-dọn-rác-trong-java)

[4. Các kiểu / đặc điểm lớp trong Java?](#4-các-kiểu--đặc-điểm-lớp-trong-java)

[5. Sự khác biệt giữa lớp trừu tượng và interface?](#5-sự-khác-biệt-giữa-lớp-trừu-tượng-và-interface)

[6. Java có ref / out như C# không? Thay thế ra sao?](#6-java-có-ref--out-như-c-không-thay-thế-ra-sao)

[7. “Mở rộng” phương thức trong Java?](#7-mở-rộng-phương-thức-trong-java)

[8. Generic trong Java?](#8-generic-trong-java)

[9. Java có lớp partial như C# không?](#9-java-có-lớp-partial-như-c-không)

[10. Late binding và early binding trong Java?](#10-late-binding-và-early-binding-trong-java)

[11. Mảng trong Java là gì?](#11-mảng-trong-java-là-gì)

[12. Sự khác biệt giữa mảng (array) và ArrayList?](#12-sự-khác-biệt-giữa-mảng-array-và-arraylist)

## Câu hỏi phỏng vấn Java cho Fresher

### 1. Java khác với C/C++ như thế nào?

**C** gần với lập trình bậc thấp: phù hợp hệ điều hành, nhúng, hiệu năng tối đa; quản lý bộ nhớ thủ công.

**C++** bậc trung: OOP + tốc độ C; biên dịch trực tiếp sang mã máy; không có máy ảo như Java.

**Java** bậc cao: mã `.java` → **bytecode** → JVM thông dịch/JIT sang mã máy. Có **GC**, không con trỏ thủ công như C/C++. Đơn kế thừa lớp, đa kế thừa qua **interface**. Tương tự C#/.NET về ý tưởng “chạy trên runtime có quản lý bộ nhớ”.

### 2. JVM là gì?

**Java Virtual Machine (JVM)** là máy ảo thực thi bytecode Java. JVM đảm nhiệm:
- Nạp lớp (**class loading**)
- Quản lý bộ nhớ & **garbage collection**
- Tối ưu JIT
- Bảo mật (sandbox), đa luồng

Có thể minh họa kiến trúc tương tự CLR: *Java source → compiler → bytecode → JVM → native code*.

![](./assets/Java_Virtual_Machine_JVM.png)

*(Gợi ý: thêm ảnh minh họa JVM vào thư mục `assets` nếu cần.)*

### 3. Bộ dọn rác trong Java?

**Garbage collection (GC)** giải phóng đối tượng không còn được tham chiếu trên **heap**. Lập trình viên không gọi `delete`; có thể gợi ý GC (`System.gc()`) nhưng **không đảm bảo** chạy ngay.

GC thường kích hoạt khi:
- Heap gần đầy / đạt ngưỡng
- JVM quyết định theo chiến lược GC (G1, ZGC, v.v. tùy phiên bản)

### 4. Các kiểu / đặc điểm lớp trong Java?

Java không có đủ 1-1 với C# nhưng có các khái niệm tương ứng:

- **`static` nested class**: lớp tĩnh lồng trong lớp ngoài; không gắn instance ngoài (khác **inner class** thường).
- **`abstract class`**: không thể `new` trực tiếp nếu chưa có lớp con cụ thể; có thể có phương thức có thân và phương thức trừu tượng.
- **`final class`**: lớp **không cho phép kế thừa** (tương đương ý `sealed` trong C#).
- **Không có `partial class`**: chia code qua nhiều file cùng một lớp — xem mục 9.

```java
public final class Config {
    // cannot be subclassed
}
```

### 5. Sự khác biệt giữa lớp trừu tượng và interface?

- **Abstract class**: có thể có trạng thái (field), constructor; một lớp chỉ **extends** một abstract class.
- **Interface**: từ Java 8 có **default** và **static** method; trước đây chủ yếu là hợp đồng hành vi. Một lớp có thể **implements** nhiều interface.
- Cả hai đều hỗ trợ đa hình; interface phù hợp “hợp đồng”, abstract class phù hợp “khung chung có code dùng lại”.

##### Lớp trừu tượng:

```java
public abstract class Shape {
    public abstract void draw();
}
```

##### Interface:

```java
public interface Paintable {
    void paint();
}
```

### 6. Java có ref / out như C# không? Thay thế ra sao?

Java chỉ truyền tham số **by value**: với kiểu tham chiếu, giá trị truyền là **bản sao tham chiếu** (không thể đổi tham chiếu của biến caller giống `ref` C#).

Thay thế thường gặp:
- Trả về **object** / **record** chứa nhiều giá trị
- Dùng **mảng một phần tử** `int[] box = {0}` để “trả qua tham số”
- **`AtomicReference`**, **`Optional`** (cho kết quả), wrapper mutable (cẩn thận thiết kế)

### 7. “Mở rộng” phương thức trong Java?

C# có **extension methods**. Java **không có** cú pháp tương tự. Cách gần nghĩa:
- **Default method** trên interface (Java 8+)
- **Lớp tiện ích** chứa `static` method nhận đối tượng làm tham số đầu
- **Wrapper** hoặc kế thừa (nếu kiểm soát được mã nguồn)

### 8. Generic trong Java?

Generics cho phép tham số hóa kiểu (`List<String>`, `Map<K,V>`). **Khác C#**: Java dùng **type erasure** — tại runtime hầu hết thông tin generic bị xóa; không thể `new T()` trừ khi dùng trick `Class<T>` + reflection.

```java
List<String> names = new ArrayList<>();
List<Integer> ids = new ArrayList<>();
```

### 9. Java có lớp partial như C# không?

**Không.** Một `public class Foo` trong một package thường nằm trong **một file** `Foo.java` (tên file trùng tên lớp public). Để tách code: tách **nhiều lớp**, **inner class**, hoặc module hóa theo package.

### 10. Late binding và early binding trong Java?

- **Early binding**: ví dụ `static` method, `private`, `final` — định vị lúc biên dịch (không đa hình động).
- **Late binding (dynamic dispatch)**: phương thức **instance non-final** — JVM chọn implementation lúc chạy theo kiểu thực tế của object (đa hình).

### 11. Mảng trong Java là gì?

Tập phần tử **cùng kiểu**, độ dài **cố định** sau khi tạo. Mảng là **object** trên heap, chỉ số bắt đầu từ `0`.

Cú pháp: `int[] a` hoặc `int a[]` (khuyến nghị kiểu trước `[]`).

```java
String[] teas = { "green", "chamomile", "black", "lemon" };
```

![](./assets/arrays_in_Java.png)

*(Gợi ý: thêm ảnh minh họa mảng vào `assets` nếu cần.)*

### 12. Sự khác biệt giữa mảng (array) và ArrayList?

| | **Array** | **ArrayList** |
|---|-----------|---------------|
| Kích thước | Cố định | Động (grow) |
| Kiểu phần tử | Cùng kiểu, **generic array** hạn chế | `ArrayList<E>` an toàn kiểu hơn (generics) |
| Chứa null | Phần tử reference có thể `null` | Cho phép `null` (tùy dùng) |
| API | Ít tiện ích | `add`, `remove`, `contains`, v.v. |

```java
import java.util.ArrayList;

ArrayList<Object> al = new ArrayList<>();
al.add("Bruno");
al.add("Husky");
al.add(10);
al.add(10.10);

for (Object names : al) {
    System.out.println(names);
}
```

## Câu hỏi phỏng vấn Java cho Experienced

### 13. Kế thừa và đa kế thừa trong Java?

**Đơn kế thừa lớp**: `class B extends A`. **Đa kế thừa hành vi** qua **nhiều interface**: `class C implements I1, I2`.

```java
import java.util.ArrayList;
import java.util.List;

class Scaler {
    public void features() {
        List<String> myFeatures = new ArrayList<>();
        myFeatures.add("Abstraction");
        myFeatures.add("Encapsulation");
        myFeatures.add("Inheritance");
        System.out.println("Features provided by OOPS:");
        for (String e : myFeatures) {
            System.out.println(e);
        }
    }
}

class Scaler2 extends Scaler {
    public void languages() {
        List<String> myFeatures = new ArrayList<>();
        myFeatures.add("C++");
        myFeatures.add("Java");
        myFeatures.add("Kotlin");
        System.out.println("\nLanguages that use OOPS concepts:");
        for (String e : myFeatures) {
            System.out.println(e);
        }
    }
}

class ScalerToScaler extends Scaler2 {
}

// Một file chỉ một lớp public; tên file = InheritanceDemo.java.
public class InheritanceDemo {
    public static void main(String[] args) {
        ScalerToScaler obj = new ScalerToScaler();
        obj.features();
        obj.languages();
    }
}
```

Java **không** `extends` hai lớp cùng lúc; dùng interface để tránh kim cương chết.

### 14. Boxing và Unboxing trong Java?

**Autoboxing**: chuyển **primitive** → **wrapper** (`int` → `Integer`).

**Unboxing**: `Integer` → `int`.

```java
int num = 23;
Object obj = num;   // autobox to Integer, reference to Object
int i = (Integer) obj; // unboxing
```

### 15. Thuộc tính (getter/setter) trong Java?

Java không có **property** kiểu C#. Thường dùng **field private** + **getter/setter public** để đóng gói.

```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Java 14+ có **record** cho dữ liệu bất biến có sẵn accessor.

### 16. “Indexer” trong Java?

Java **không có indexer** `this[]`. Thay bằng:
- `get(int index)` / `set(int index, value)`
- Hoặc dùng `Map`, `List` bên trong lớp

```java
public class SmartArray {
    private final int[] data;

    public SmartArray(int[] data) {
        this.data = data;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }
}
```

### 17. Sự khác biệt giữa `==` và `equals()`?

- **`==`**: với primitive so sánh **giá trị**; với reference so sánh **cùng đối tượng** (cùng địa chỉ).
- **`equals()`**: mặc định của `Object` giống `==`; các lớp như `String`, `Integer` **override** để so sánh nội dung / giá trị.

```java
Integer x = 10;
Integer y = 10;
System.out.println(x == y);       // có thể true do cache Integer nhỏ — cẩn thận!
System.out.println(x.equals(y)); // true (giá trị)

String a = new String("hi");
String b = new String("hi");
System.out.println(a == b);       // false (khác object)
System.out.println(a.equals(b));  // true
```

### 18. Nạp chồng (overloading)?

Cùng tên phương thức, khác **danh sách tham số** (số lượng, kiểu, thứ tự). **`main` có thể overload** nhưng JVM chỉ chạy `main(String[] args)`.

```java
public class Area {
    public double area(double x) {
        return x * x;
    }

    public double area(double a, double b) {
        return a * b;
    }
}
```

### 19. Reflection trong Java?

**Reflection** introspect lớp, phương thức, field lúc chạy qua `java.lang.reflect` và `Class<?>`. Dùng cho framework (DI, ORM, serialization). **Chi phí và rủi ro** (vượt đóng gói nếu `setAccessible(true)`).

Ví dụ khái niệm: `Class.forName(...)`, `getDeclaredMethods()`, `Method.invoke(...)`.

### 20. `static final` vs `final` (và hằng thực sự)?

- **`static final`**: hằng gắn **lớp**, một bản cho mọi instance; phải gán trước khi dùng (khi khai báo hoặc static block).
- **`final` (instance)**: gán một lần (khai báo hoặc **mọi** constructor).

```java
class Ib {
    public static final int XVAR = 20;
    public static final String STR = "InterviewBit";

    public final int xvar1;
    public final int yvar2;

    public Ib(int b, int c) {
        this.xvar1 = b;
        this.yvar2 = c;
        System.out.println("The value of xvar1 " + xvar1 + ", and yvar2 " + yvar2);
    }

    public static void main(String[] args) {
        System.out.println("The value of xvar: " + XVAR);
        System.out.println("The value of str: " + STR);
        new Ib(50, 60);
    }
}
```

### 21. Sự khác biệt giữa `String` và `StringBuilder` / `StringBuffer`?

- **`String`**: **bất biến**; nối chuỗi trong vòng lặp tạo nhiều object trung gian.
- **`StringBuilder`**: **mutable**, không đồng bộ, nhanh cho nối trong loop.
- **`StringBuffer`**: mutable, **đồng bộ** (thread-safe), thường chậm hơn `StringBuilder` khi không cần lock.

```java
// costly: many intermediate Strings
String s = "";
for (int i = 0; i < 1000; i++) {
    s += i + " ";
}

// better
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i).append(' ');
}
String result = sb.toString();
```

---

## Bài tập coding (Java)

Các file mẫu tương ứng thư mục C# `coding/`:

- `coding/ShortestFizzBuzz.java`
- `coding/SumOfArrayPlusOne.java`
- `coding/HotelRoom.java`
- `coding/LongestWords.java`
