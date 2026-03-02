package modul_1.Latihan;
import java.util.Scanner;

//Buat program untuk menentukan apakah suatu bilangan genap atau ganji

public class Latihan_modul_1_L3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maukkan angka yang ingin di uji:");

        int  a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println(a + " Adalah bilangan genap");
        }else{
            System.out.println(a + "  bilangan ganjil");
        }
    }
}
