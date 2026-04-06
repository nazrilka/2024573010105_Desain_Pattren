package Praktikum_1.Latihan;
import java.util.Scanner;

public class Latihan_modul_1_L2 {
    public static void main(String[] args) {
        System.out.println("Program Penarian Luas Persegi");
        System.out.println("--------------------------------");

        Scanner value = new Scanner(System.in);
        System.out.println("Maukkan Panjang Persegi:");
        float p = value.nextFloat();
        System.out.println("Maukkan Lebar Persegi:");
        float l = value.nextFloat();

        float luas = p * l;

        System.out.println("Luas persegi panjang tersebut adalah:" + luas);
        System.out.println("--------------------------------");

    }
}

