package Praktikum_6_LSP_DAN_STRATEGY.latihan;

public class Bicycle extends Vehicle{
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating bike route to " + destination);
        // Bikes have different route calculation logic
    }
}