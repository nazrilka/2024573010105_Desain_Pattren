package Praktikum_3.bagian_4.Latihan;

// Superclass
class BangunDatar {
    double hitungLuas() {
        return 0;
    }
}

// Subclass Persegi
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

// Subclass Lingkaran
class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(7);

        System.out.println("Luas Persegi: " + p.hitungLuas());
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
    }
}
