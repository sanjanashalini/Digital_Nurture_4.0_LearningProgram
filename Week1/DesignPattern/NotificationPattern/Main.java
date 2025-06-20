package Week1.DesignPattern.NotificationPattern;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser("Your order has been shipped!");

        service.setNotification(new SMSNotification());
        service.notifyUser("Your order will arrive tomorrow.");
    }
}
