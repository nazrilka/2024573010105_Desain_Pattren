package Praktikum_3.bagian_5.antarmuka;

public class main {
    public static void main(String[] args){
        Bergerak mobil = new Mobil();
        mobil.bergerak();
        mobil.berhenti();

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak();
        pesawat.berhenti();

        Bergerak.info(); //Method static dari interface
    }
}
