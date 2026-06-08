package Praktikum_5.Latihan;

public class MotorcycleTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.05; // Pajak 5% untuk motor
    }
}