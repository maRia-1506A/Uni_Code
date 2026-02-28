interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Notified by email");
    }
}
class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Notified by SMS");
    }
}
class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Notified by push notification");
    }
}

class NotificationFactory{
    public static Notification create(String type) {
        switch(type){
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            case "push": return new PushNotification();
            default: return null;
        }
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification n1= NotificationFactory.create("email");
        n1.notifyUser();
        Notification n2= NotificationFactory.create("push");
        n2.notifyUser();
    }
    
}
