package Praktikum_3.bagian_5.Latihan;

// Interface
interface Berenang {
    void berenang();
}

// Abstract class
abstract class HewanAir {
    String nama;

    abstract void makan();
}

// Class Ikan (inherit + implements)
class Ikan extends HewanAir implements Berenang {

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }

    @Override
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Nemo";

        ikan.berenang();
        ikan.makan();
    }
}