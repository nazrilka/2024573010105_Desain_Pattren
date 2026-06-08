package Praktikum_5.praktikum2.dengan_ocp;

public class DiscountCalculator {
    public double calculateDiscount(Discount discountStrategy, double price) {
        return discountStrategy.applayDiscount(price);
    }
}
