package Praktikum_5.Latihan;

public class TaxCalculator {
    public double calculateTax(TaxStrategy taxStrategy, double price) {
        return taxStrategy.calculateTax(price);
    }
}
