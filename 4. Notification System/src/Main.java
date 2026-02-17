public class Main {
    public static void main(String[] args){
        NotificationService service = new NotificationService();
        Notification email = new EmailNotifications();
        Notification sms = new SMSNotifications();
        Notification push = new PushNotifications();

        service.sendNotification(email, "Hello!", "someone@gmail.com");
        service.sendNotification(sms, "Hello!", "9876543210");
        service.sendNotification(push, "Hello!", "a1b2c3d4");
    }
}
