package Praktikum_3.bagian_5.abstrak;

abstract class Hewan {
    //Atribut
    String nama;

    //Method konkret
    void makan(){
        System.out.println(nama + "Sedang makan.");
    }

    //Method Abstract
    abstract void bersuara();

}

