package Praktikum_5.praktikum1.dengan_ocp;

public class CreditCardPayment implements PaymentMethod{
    public void  process(double amount) {
        System.out.println("Processing Credit Card Payment of" + amount);
    }
}
