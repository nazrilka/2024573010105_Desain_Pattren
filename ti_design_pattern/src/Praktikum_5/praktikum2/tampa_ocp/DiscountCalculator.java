package Praktikum_5.praktikum2.tampa_ocp;

public class DiscountCalculator {
    public  double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return  price * 0.1;
        } else if (customerType.equals("Preium")) {
            return price * 0.2;
        } else {
            return 0;
        }
    }
}
