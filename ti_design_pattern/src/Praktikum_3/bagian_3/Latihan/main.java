package Praktikum_3.bagian_3.Latihan;

// Class Processor
class Processor {
    void jalankan() {
        System.out.println("Processor sedang berjalan");
    }
}

// Class RAM
class RAM {
    void baca() {
        System.out.println("RAM membaca data");
    }

    void tulis() {
        System.out.println("RAM menulis data");
    }
}

// Class Laptop (Composition)
class Laptop {
    private Processor processor;
    private RAM ram;

    // Constructor
    public Laptop() {
        this.processor = new Processor();
        this.ram = new RAM();
    }

    void nyalakanLaptop() {
        System.out.println("Laptop dinyalakan");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.nyalakanLaptop();
    }
}
