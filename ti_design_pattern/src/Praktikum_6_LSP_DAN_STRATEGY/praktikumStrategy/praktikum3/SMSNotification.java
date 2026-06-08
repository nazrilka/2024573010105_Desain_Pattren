package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum3;

public class SMSNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}