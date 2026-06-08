package Praktikum_5.praktikum1.dengan_ocp;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod paymentMethod;

        if (type.equalsIgnoreCase("CreditCard")){
            paymentMethod = new CreditCardPayment();
        } else if (type.equalsIgnoreCase("E-walet")) {
            paymentMethod = new EWalletPayment();
        } else {
            System.out.println("Invalid payment method");
            return;
        }

        processor.processPayment(paymentMethod, amount);
    }
}
