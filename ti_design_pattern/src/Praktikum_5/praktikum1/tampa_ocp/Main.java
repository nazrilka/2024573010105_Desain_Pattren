package Praktikum_5.praktikum1.tampa_ocp;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment type (CreditCard/E-Walet): ");
        String type = scanner.next();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(type, amount);
    }
}
