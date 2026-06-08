package Praktikum_5.praktikum3.dengan_ocp;

public class NotificationService {
    public void sendNotification(Notifier notifier, String message) {
        notifier.send(message);
    }
}
