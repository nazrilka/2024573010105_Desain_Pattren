package Praktikum_6_LSP_DAN_STRATEGY.latihan;

public class Vehicle {
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void navigateTo(String destination) {
        System.out.println("Calculating route to " + destination);
        System.out.println("Following route to " + destination);
    }
}