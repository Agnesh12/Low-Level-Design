package NotificationSystem;

public class NotificationService {
    public Notification notification;
     public NotificationService(Notification notification) {
         this.notification = notification;

     }
     public void sendNotification(String message) {
         notification.send(message);
     }
}
