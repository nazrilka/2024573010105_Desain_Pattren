package Praktikum_5.praktikum3.dengan_ocp;

public class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
