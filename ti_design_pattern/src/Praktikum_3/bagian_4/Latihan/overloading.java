package Praktikum_3.bagian_4.Latihan;

class Matematika {

    // tambah 2 parameter int
    int tambah(int a, int b) {
        return a + b;
    }

    // tambah 3 parameter int
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // tambah 2 parameter double
    double tambah(double a, double b) {
        return a + b;
    }
}

public class overloading {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println("2 int: " + m.tambah(2, 3));
        System.out.println("3 int: " + m.tambah(2, 3, 4));
        System.out.println("2 double: " + m.tambah(2.5, 3.5));
    }
}
