package Praktikum_3.bagian_3;

// Class untuk Composition
class Mesin {
    void hidupkan(){
        System.out.println("Mesin Menyala");
    }
    void matikan(){
        System.out.println("Mesin dimatikan");
    }
}

// Superclass untuk Inheritance
class kendaraan {
    void bergerak(){
        System.out.println("Kendaraan Sedang Bergerak");
    }
}

// Subclass
class Mobil extends kendaraan {
    private Mesin mesin; // Composition

    public Mobil() {
        this.mesin = new Mesin(); // membuat objek Mesin
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti");
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.mulai();
        mobil.bergerak();
        mobil.berhenti();
    }
}