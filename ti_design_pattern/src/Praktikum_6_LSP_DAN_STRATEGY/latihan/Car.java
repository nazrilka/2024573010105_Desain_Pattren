package Praktikum_6_LSP_DAN_STRATEGY.latihan;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating Car route to " + destination);
    }
}