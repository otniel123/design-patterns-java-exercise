package FactoryMethod.first;

import FactoryMethod.first.Interface.Notification;
import FactoryMethod.first.controller.NotificationController;

public class Main {
    public static void main(String[] args) {
        NotificationController notifier = new NotificationController();
        notifier.send("EMAIL", "testing@gmail.com", "Hello, how are you?");
        notifier.send("SMS", "SMS-TESTING", "Hello, how are you?");
        notifier.send("PUSH", "PUSH-TESTING", "Hello, how are you?");
    }
}
