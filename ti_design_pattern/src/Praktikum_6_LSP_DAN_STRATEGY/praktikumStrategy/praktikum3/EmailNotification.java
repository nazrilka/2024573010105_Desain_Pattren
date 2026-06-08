package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum3;

public class EmailNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Mengirim email: " + message);
    }
}