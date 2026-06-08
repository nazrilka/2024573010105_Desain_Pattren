package Praktikum_5.Latihan;

public class TruckTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.15; // Pajak 15% untuk truk
    }
}
