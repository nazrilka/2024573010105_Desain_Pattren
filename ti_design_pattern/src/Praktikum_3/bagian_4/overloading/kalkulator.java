package Praktikum_3.bagian_4.overloading;

public class kalkulator {
    //method overloading: penjumblahan dua bilangan bulat
    int tambah(int a, int b){
        return a + b;
    }

    //method overloading: penjumblahan tiga bilangan bulat
    int tambah(int a, int b, int c){
        return a + b + c;
    }

    //method overloading: penjumblahan bilangan desimal
    double tambah(double a, double b){
        return a + b;
    }

}
