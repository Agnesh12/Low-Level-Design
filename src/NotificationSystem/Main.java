package NotificationSystem;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        NotificationService service1 = new NotificationService(email);
        service1.sendNotification("Send A Email Notification");
        Notification Sms = new SmsNotification();
        NotificationService service2 = new NotificationService(Sms);
        service2.sendNotification("Send A Sms Notification");
    }
}
