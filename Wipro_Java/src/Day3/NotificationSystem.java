package Day3;

import java.util.Scanner;

abstract class Notification {
    abstract void send();
}

class EmailNotification extends Notification {
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification extends Notification {
    void send() {
        System.out.println("Sending Push Notification");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();

        Notification n;

        if (type.equals("email")) {
            n = new EmailNotification();
        } else if (type.equals("sms")) {
            n = new SMSNotification();
        } else if (type.equals("push")) {
            n = new PushNotification();
        } else {
            System.out.println("Invalid notification type");
            scanner.close();
            return;
        }

        n.send();
        scanner.close();
    }
}
