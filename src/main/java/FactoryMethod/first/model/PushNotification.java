package FactoryMethod.first.model;

import FactoryMethod.first.Interface.Notification;

public class PushNotification implements Notification {
    private String notificationTitle;

    public PushNotification(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending notification: " + this.notificationTitle + " to " + recipient + ". " +
                "Message: " + message);
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }
}
