package Praktikum_5.praktikum1.dengan_ocp;

public class PaymentProcessor {
   public  void processPayment(PaymentMethod method, double amount) {
       method.process(amount);
   }
}
