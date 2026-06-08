package Praktikum_5.praktikum1.tampa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymenType, double amount) {
        if (paymenType.equals("CreditCard")) {
            System.out.println("Processing Credit Card Payment of" + amount);
        } else if (paymenType.equals("E-walet")) {
            System.out.println("Processing E-waletPayment of" + amount);
        } else {
            System.out.println("Invalid Payment Method");
        }
    }
}

