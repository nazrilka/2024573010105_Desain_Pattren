package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum3;

public class PushNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Mengirim notifikasi push: " + message);
    }
}