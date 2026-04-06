package Praktikum_3.bagian_5.antarmuka;

public interface Bergerak {
    //method abstract
    void bergerak();

    default void berhenti(){
        System.out.println("Berhenti bergerak");
    }

    static void info(){
        System.out.println("Ini adalah interface Bergerak");
    }
}
