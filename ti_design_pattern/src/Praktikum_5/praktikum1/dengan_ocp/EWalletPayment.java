package Praktikum_5.praktikum1.dengan_ocp;

public class EWalletPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing E-Walet Payment of" + amount);
    }
}
