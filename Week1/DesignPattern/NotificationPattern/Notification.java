package Week1.DesignPattern.NotificationPattern;

public interface Notification {
    void send(String message);
}


class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.send(message);
    }
}

