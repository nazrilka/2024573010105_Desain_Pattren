package Praktikum_3.bagian_3.compotition;

public class mobil {
    private final Mesin mesin; //Compotition

    public mobil() {
        this.mesin = new Mesin();
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan.");
    }

    void berhenti(){
        mesin.matikan();
        System.out.println("Mobil berhenti.");
    }
}
