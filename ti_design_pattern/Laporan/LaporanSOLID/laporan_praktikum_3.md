# LAPORAN PRAKTIKUM
### Praktikum: SOLID PRINCIPAL
## Mata Kuliah: Design Pattern

| | |
|---|---|
| **Nama** | Nazril Kanahaya Akbar |
| **NIM** | 2024573010105 |
| **Kelas** | TI 2A |
| **Mata Kuliah** | Design Pattern |

---

# BAB I
# PENDAHULUAN

## 1.1 Latar Belakang

---

# BAB II
# PRAKTIKUM

## 2.1 SOLID Principle : Single Responsibility Principle (SRP)
Single Responsibility Principle (SRP) atau prinsip tanggung jawab tunggal adalah salah satu dari lima prinsip SOLID dalam desain perangkat lunak yang menyatakan bahwa setiap kelas atau modul dalam sebuah sistem hanya boleh memiliki satu alasan untuk berubah. Artinya, setiap kelas harus memiliki satu tanggung jawab utama atau satu tujuan spesifik.
Prinsip ini pertama kali diperkenalkan oleh Robert C. Martin (Uncle Bob) dalam bukunya "Agile Software Development: Principles, Patterns, and Practices." Tujuan utama SRP adalah untuk meningkatkan modularitas, kemudahan pemeliharaan (maintainability), dan fleksibilitas (extensibility) dalam pengembangan perangkat lunak.

### 2.1.1 Mengapa SRP penting
Mengurangi Kompleksitas: Kelas yang memiliki banyak tanggung jawab akan menjadi kompleks dan sulit untuk dipahami atau diubah.
Meningkatkan Kemudahan Pemeliharaan: Jika suatu kelas memiliki satu tanggung jawab, perubahan pada kode hanya akan berdampak pada satu aspek sistem.
Memudahkan Pengujian (Testing): Kelas yang hanya memiliki satu tugas akan lebih mudah diuji secara unit testing karena dependensinya lebih sedikit.
Mencegah Efek Samping yang Tidak Diinginkan: Jika satu kelas menangani banyak hal, perubahan kecil dapat menyebabkan bug di bagian lain yang tidak berhubungan.

### 2.1.2  kelebihan dan kekurangan dari Single Responsibility Principle (SRP):

tabel nanti

## 2.1.2 Tujuan Praktikum
1. Memahami prinsip Single Responsibility Principle (SRP) dalam SOLID.
2. Mengetahui manfaat penerapan prinsip SOLID dalam pengembangan perangkat lunak.
3. Mampu mengidentifikasi pelanggaran SRP dalam kode.
4. Mampu melakukan refactoring kode agar sesuai dengan prinsip SRP.

## 2.1.3 Praktikum 1 : Membuat Program Report Manager

- Kode yang melanggar RSP

1. Buat package baru di dalam modul Praktikum_4 dan beri nama praktikum_1.

2. Kemudian buat sebuah package baru di dalam praktikum_1 dan beri nama tampa_srp.

3. Setelah itu, buat sebuah class di dalam package tampa_srp dan berinama `ReportManager` dan isikan dengan kode di bawah ini.

```java
package praktikum_4.pratikum_1.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
    private final String content;

    public ReportManager(String content){
        this.content = content;
    }

    public String generateReport(){
        return "=== LAPORAN ===\n" + content + "\n============";
    }

    public void saveToFile(String filename){
        String folderPath = "ti_design_pattern/src/pratikum_4/pratikum_1/tanpa_srp";

        File file = new File(folderPath + filename);

        try (FileWriter writer = new FileWriter(file)){
            writer.write(content);
            System.out.println("laporan disimpan ke file: " + filename);
        } catch (IOException e){
            System.out.println("gagal menyimpan laporan: " + e.getMessage());
        }
    }

    public void printReport(){
        System.out.println("\nlaporan yang dicetak\n" + content);
    }
}

```

5. Buat sebuah class baru dengan nama `Main`.
```java
package praktikum_4.pratikum_1.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("masukan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generateReport();

        reportManager.saveToFile(reportFileName + ".txt");
        reportManager.printReport();
    }
}

```

- Output:

<img src="" width="500">

- Kode yang menggunakan srp

1. Buat folder baru dengan nama `dengan_srp` di dalam folder `praktikum_1`
2. Kemudaian buat sebuah class dengan nama `ReportGenerator` dan isikan dnegan kode di bawah ini.

```java
package praktikum_4.pratikum_1.dengan_srp;

public class ReportGenerator {
    private final String content;

    public ReportGenerator(String content){
        this.content = content;
    }

    public String generateReport(){
        return "=== LAPORAN ===\n" + content + "\n============";
    }
}
```
3. Selanjutnya buat sebuah class dengan nama `ReportSaver` dan isi dengan kode di bawah ini.

```java
package praktikum_4.pratikum_1.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveToFile(String filename, String content) {
        String folderPath = "ti_design_pattern/src/pratikum_4/pratikum_1/dengan_srp";

        File file = new File(folderPath + filename);

        try (
                FileWriter writer = new FileWriter(file)){
            writer.write(content);
            System.out.println("laporan disimpan ke file: " + filename);
        } catch (
                IOException e){
            System.out.println("gagal menyimpan laporan: " + e.getMessage());
        }

    }
}
```
4. Setelah report class `ReportSaver` buat sebuah class baru dengan nama `ReportPrinter` dan isikan kode berikut.

```java
package praktikum_4.pratikum_1.dengan_srp;

public class ReportPrinter {
    public void printReport(String content){
        System.out.println("\nlaporan yang dicetak:\n" + content);
    }
}
```
5. Terakhir buat sebuah class dengan nama `main` dan isikan kode berikut.

```java
package praktikum_4.pratikum_1.dengan_srp;

import praktikum_4.pratikum_1.tanpa_srp.ReportManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan isi laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("masukan nama file laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generateReport();

        reportManager.saveToFile(reportFileName + ".txt");
        reportManager.printReport();
    }
}
```

- Output:

<img src="" width="500">

### 2.1.4 Praktikum 2 : Membuat Program Manajemen Pengguna

- Kode yang melanggar SRP

1. Buat package baru di dalam `praktikum_4` dengan nama `praktikum_2`

2. Didalam package `praktikum_2` buat sebuah package dengan nama `tampa_srp`

3. Pada package `tampa_srp` buat class baru dengan nama `UserManager` dan isikan dengan kode berikut.

```java
package praktikum_4.pratikum_2.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserManager {
    private final String name;
    private final String email;

    public UserManager(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase(){
        String folderPath = "ti_design_pattern/src/pratikum_4/pratikum_2/tanpa_srp";
        String fileName = "user.txt";

        File file = new File(folderPath + fileName);

        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(name + " - " + email + "\n");
            System.out.println("pengguna berhasil disimpan: " + name);
        } catch (IOException e){
            System.out.println("gagal menyimpan pengguna: " + e.getMessage());
        }
    }

    public void sendWelcomeEmail(){
        System.out.println("\nmengirim email ke " + email + "....");
        System.out.println("halo " + name + ", selamat datang di sistem kami!\n");
    }


}
```
4. Selanjutnya buat class dengan nama `main`

```java
package praktikum_4.pratikum_2.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nama pengguna: ");
        String name = scanner.nextLine();

        System.out.print("masukan email pengguna: ");
        String email = scanner.nextLine();

        UserManager userManager = new UserManager(name , email);
        userManager.saveToDatabase();
        userManager.sendWelcomeEmail();
    }
}
```
- Output:

<img src="" width="500">

- Kode yang menggunakan SRP

1. Buat sebuah package baru di dalam package `praktikum_2` dan beri nama `dengan_srp`

2. pada package `dengan_srp` buat sebuah class dengan nama `user` dan isi dengan kode di berikut ini.

```java
package praktikum_4.pratikum_2.dengan_srp;

public class User {
    private String name;
    private String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }
}

```

3. Kemudian buat class lagi dengan nama `UserRepository` dan isi dengan kode berikut ini.

```java
package praktikum_4.pratikum_2.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserRepository {
    private static final String  FOLDER_PATH= "ti_design_pattern/src/pratikum_4/pratikum_2/dengan_srp";
    private static final String DATABASE_FILE = "user.txt";

    public void save(User user){
        File file = new File(FOLDER_PATH + DATABASE_FILE);

        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(user.getName() + " - " + user.getEmail() + "\n");
            System.out.println("pengguna berhasil disimpan: " + user.getName());
        } catch (IOException e){
            System.out.println("gagal menyimpan pengguna: " + e.getMessage());
        }
    }
}
```

4. Selanjutnya buat class baru setelah `UserRepository` dengan nama `UserService` dan isi dengan kode di berikut ini.

```java
package praktikum_4.pratikum_2.dengan_srp;

public class UserService {
    public void sendWelcomeEmail(User user){
        System.out.println("\nmengirim email ke " + user.getEmail() + "....");
        System.out.println("halo " + user.getName() + ", selamat datang di sistem kami!\n");
    }
}

```

5. Kemudian buat class baru dengan nama `Main` dan isi dengan kode berikut ini.

```java
package praktikum_4.pratikum_2.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nama pengguna: ");
        String name = scanner.nextLine();

        System.out.print("masukan email pengguna: ");
        String email = scanner.nextLine();

        User user = new User (name, email);
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService();

        userRepository.save(user);
        userService.sendWelcomeEmail(user);
    }
}

```

- Output:

<img src="" width="500">

### 2.1.5 Latihan Praktikum 4

1. Analisis kode yang telah diberikan.
2. Identifikasi bagian mana yang melanggar SRP.
3. Pisahkan tanggung jawab ke dalam kelas-kelas yang sesuai agar mematuhi SRP. 

Buatkan solusinya dengan:

2. Buat sebuah package baru di dalam modul_4 dengan nama latihan
2. Tuliskan solusi anda dalam package tersebut.

Jawaban:


## 2.2 SOLID Principle : : Open-Closed Principle (OCP)

### 2.2.1 Mengapa OCP penting

### 2.2.2  kelebihan dan kekurangan dari Open-Closed Principle (OCP):

tabel nanti

## 2.2.3 Tujuan Praktikum
1. Memahami prinsip Open-Closed Principle (OCP) dalam SOLID.
2. Mengetahui manfaat penerapan prinsip SOLID dalam pengembangan perangkat lunak.
3. Mampu mengidentifikasi pelanggaran OCP dalam kode.
4. Mampu melakukan refactoring kode agar sesuai dengan prinsip SRP.

## 2.2.4 Praktikum 1 : Aplikasi Sistem Pembayaran

- Kode yang melanggar aturan OCP

1. Buat package baru dengan nama `praktikum_5` sebagai package utama kita dalam praktikum OCP ini
2. Kemudian di dalam package `praktikum_5` buat package baru dengan nama `praktikum1`
3. Lalu buat package di dalam `praktikum1` `dengan nama tampa_ocp`
4. Buat sebuah class di dalam package `tampa_ocp` dengan nama `PaymentProcessor`

```java
package Praktikum_5.praktikum1.tampa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymenType, double amount) {
        if (paymenType.equals("CreditCard")) {
            System.out.println("Processing Credit Card Payment of" + amount);
        } else if (paymenType.equals("E-walet")) {
            System.out.println("Processing E-waletPayment of" + amount);
        } else {
            System.out.println("Invalid Payment Method");
        }
    }
}

```
5. Kemudian buat class baru dengan nama `main`

```java
package Praktikum_5.praktikum1.tampa_ocp;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment type (CreditCard/E-Walet): ");
        String type = scanner.next();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(type, amount);
    }
}


```
- Output:

<img src="" width="500">

- Kode yang menggunakan konsep OCP

1. Buat sebuah package baru dengan nama `dengan_ocp`
2. Buat interface dengan nama `PaymentMethod` dan isikan kode berikut.

```java
package Praktikum_5.praktikum1.dengan_ocp;

public interface PaymentMethod {
    void  process(double amount);

}

```
3. Kemudian buat sebuah class baru dengan nama `CreditCardPayment` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum1.dengan_ocp;

public class CreditCardPayment implements PaymentMethod{
    public void  process(double amount) {
        System.out.println("Processing Credit Card Payment of" + amount);
    }
}

```
4. Buat sebuah class baru dengan nama `EWalletPayment` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum1.dengan_ocp;

public class EWalletPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing E-Walet Payment of" + amount);
    }
}

```

5. Selanjutnya buat calass baru dengan nama `CreditCardPayment` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum1.dengan_ocp;

public class CreditCardPayment implements PaymentMethod{
    public void  process(double amount) {
        System.out.println("Processing Credit Card Payment of" + amount);
    }
}

```
6. Trakhir buat sebuah class `main` dan isikan dengan kode barikut.

```java
package Praktikum_5.praktikum1.dengan_ocp;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod paymentMethod;

        if (type.equalsIgnoreCase("CreditCard")){
            paymentMethod = new CreditCardPayment();
        } else if (type.equalsIgnoreCase("E-walet")) {
            paymentMethod = new EWalletPayment();
        } else {
            System.out.println("Invalid payment method");
            return;
        }

        processor.processPayment(paymentMethod, amount);
    }
}

```

- Output:

<img src="" width="500">

## 2.2.4 Praktikum 2 : Sistem Perhitungan Diskon

- Kode yang melanggar aturan OCP

1. Buat package baru di dalam `praktikum_5` dengan nama `praktikum1`
2. di dalam package `praktikum1` buat sebuah package dengan nama `tampa_ocp`
3. kemudian buat class baru di dalam package `tampa_ocp` dengan nama `DiscountCalculator` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum2.tampa_ocp;

public class DiscountCalculator {
    public  double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return  price * 0.1;
        } else if (customerType.equals("Preium")) {
            return price * 0.2;
        } else {
            return 0;
        }
    }
}

```

4. Buat sebuah class dengan nama `main` dan isikan dengan kode barikut.

```java
package Praktikum_5.praktikum2.tampa_ocp;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular Customer Discount: " + calculator.calculateDiscount("Regular", 100));
        System.out.println("Premium Customer Discount" + calculator.calculateDiscount("Premium", 100));
    }
}

```

- Kode yang menggunakan OCP

1. Buat sebuah package baru dengan nama `dengan_ocp`
2. Buat sebuah interface baru dengan nama `Discount` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum2.dengan_ocp;

public interface Discount {
    double applayDiscount(double price);
}

```

3. Kemudian buat class baru dengan nama `RegularDiscount` dan isikan dengan kdoe berikut.

```java
package Praktikum_5.praktikum2.dengan_ocp;

public class RegularDiscount implements Discount {
    @Override
    public double applayDiscount(double price) {
        return price * 0.2;
    }
}

```
4. Selanjutnya bauat sebuah class baru dengan nama `PremiumDiscount` dan isikan dengan kdoe berikut.

```java
package Praktikum_5.praktikum2.dengan_ocp;

public class PremiumDiscount implements Discount{
    @Override
    public double applayDiscount(double price) {
        return price * 0.2;
    }
}

```

5. lalu buat sebuah class dengan nama `DiscountCalculator` dan isikan dengan kode barikut.

```java
package Praktikum_5.praktikum2.dengan_ocp;

public class DiscountCalculator {
    public double calculateDiscount(Discount discountStrategy, double price) {
        return discountStrategy.applayDiscount(price);
    }
}

```

- Output:

<img src="" width="500">

## 2.2.4 Praktikum 3 : Sistem Notifikasi

1. Buat sebuah package baru di dalam `praktikum_5` dengan nama `praktikum3`
2. Buat sebuah package baru didalam `praktikum3` dengan nama `tampa_ocp`
3. Lalu buat class baru di dalam package `tampa_ocp` dengan nama `NotificationService` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum3.tampa_ocp;

public class NotificationService {
    public  void sendNotification(String type, String message) {
        if (type.equals("Email")) {
            System.out.println("Sending Email:" + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS" + message);
        } else {
            System.out.println("Invalid notification type");
        }
    }
}

```
4. Kemudian buat sebuah class dengan nama `main`

```java
package Praktikum_5.praktikum3.tampa_ocp;

public class Main {
    public  static  void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("Email", "Hello via email");
        service.sendNotification("Email", "Hello via SMS!");
    }
}

```
- Output:

<img src="" width="500">

- Kode yang menggunakan OCP

1. Buat sebuah package baru dengan nama `dengan_ocp`
2. Buat sebuah interface baru dengan nama `Notifier` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum3.dengan_ocp;

public interface Notifier {
    void send(String message);
}

```
3. Kemudian buat sebuah class dengan nama `EmailNotifier` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum3.dengan_ocp;

public class EmailNotifier implements Notifier {
    public  void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

```

4. Buat sebuah class dengan nama `SMSNotifier` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum3.dengan_ocp;

public class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

```
5. Kemudian buat sebuah clas dengan nama `NotificationService` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum3.dengan_ocp;

public class NotificationService {
    public void sendNotification(Notifier notifier, String message) {
        notifier.send(message);
    }
}

```
6. Selanjutnya buat class dengn nama `main` dan isikan dengan kode berikut.

```java
package Praktikum_5.praktikum3.dengan_ocp;

public class Main {
    public  static  void main(String[] args) {
        NotificationService service = new NotificationService();

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        service.sendNotification(emailNotifier, "Hello via Email!");
        service.sendNotification(smsNotifier, "Hello via SMS!");

    }
}


```

### 2.2.5 Latihan Praktikum 4



Modifikasi kode di atas agar memenuhi prinsip OCP, sehingga kita bisa menambahkan jenis kendaraan baru tanpa mengubah kode yang sudah ada.

Petunjuk:

Gunakan polimorfisme dengan membuat interface TaxStrategy.
Buat class CarTax dan MotorcycleTax yang mengimplementasikan TaxStrategy.
Ubah TaxCalculator agar menerima strategi pajak sebagai parameter, bukan langsung menerima vehicleType.
Tambahkan kelas baru TruckTax (dengan pajak 15%) tanpa mengubah TaxCalculator.
Setelah refactoring, program harus bisa dengan mudah menangani kendaraan baru tanpa mengubah kode TaxCalculator.

Langkah membuat solusi latihan:

Buat sebuah package baru di dalam modul_5 dengan nama latihan
Tuliskan solusi Anda dalam package tersebut.

