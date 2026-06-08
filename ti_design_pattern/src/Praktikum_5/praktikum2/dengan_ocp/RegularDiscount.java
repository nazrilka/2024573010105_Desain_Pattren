package Praktikum_5.praktikum2.dengan_ocp;

public class RegularDiscount implements Discount {
    @Override
    public double applayDiscount(double price) {
        return price * 0.2;
    }
}
