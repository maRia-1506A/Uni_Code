interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification{
    public void notifyUser() {
        System.out.println("Notified by Email");
    }
}
class SMSNotification implements Notification{
    public void notifyUser() {
        System.out.println("Notified by SMS");
    }
}

class NotificationFactory {
    public static Notification notificationType(String type) {
        switch(type) {
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            default: return null;
        }
    }
} 

public class NotificationSystem {
    public static void main(String[] args) {
        Notification n1= NotificationFactory.notificationType("email");
        n1.notifyUser();
        Notification n2= NotificationFactory.notificationType("sms");
        n2.notifyUser();
    }   
}
