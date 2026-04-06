package Praktikum_3.bagian_3.pewarisan;

public class mobil extends kendaraan {
    int jumblahPintu;

    void displayInfoMobil(){
        displayInfo(); // Memanggil metod dari superclass
        System.out.println("Jumblah Pintu:" + jumblahPintu);

    }
}
