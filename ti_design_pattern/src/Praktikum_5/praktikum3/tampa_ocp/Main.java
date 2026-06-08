package Praktikum_5.praktikum3.tampa_ocp;

public class Main {
    public  static  void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification("Email", "Hello via email");
        service.sendNotification("Email", "Hello via SMS!");
    }
}
