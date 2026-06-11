package FactoryMethod.first.model;

import FactoryMethod.first.Interface.Notification;

public class SmsNotification implements Notification {
    private String smsTitle;

    public SmsNotification(String smsTitle) {
        this.smsTitle = smsTitle;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS: " + this.smsTitle + " to " + recipient + ". Message: " + message);
    }

    public String getSmsTitle() {
        return smsTitle;
    }

    public void setSmsTitle(String smsTitle) {
        this.smsTitle = smsTitle;
    }
}
