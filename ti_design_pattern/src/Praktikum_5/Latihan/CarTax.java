package Praktikum_5.Latihan;

public class CarTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.1; // Pajak 10% untuk mobil
    }
}