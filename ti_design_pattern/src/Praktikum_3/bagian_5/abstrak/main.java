package Praktikum_3.bagian_5.abstrak;

public class main {
    public static void main(String[] args){
        Hewan kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.makan(); //method konkret dari abstract class
        kucing.bersuara(); //method abstract yang di override

        Hewan anjing = new anjing();
        anjing.nama = "Doggy";
        anjing.makan(); //method konkret dari abstract class
        anjing.bersuara(); //method abstract yang di override
    }
}
