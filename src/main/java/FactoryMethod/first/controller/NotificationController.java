package FactoryMethod.first.controller;

import FactoryMethod.first.Interface.Notification;
import FactoryMethod.first.factory.NotificationFactory;
import FactoryMethod.first.model.EmailNotification;
import FactoryMethod.first.model.PushNotification;
import FactoryMethod.first.model.SmsNotification;

public class NotificationController {
    public void send(String channel, String recipient, String message){
        Notification notification = NotificationFactory.createNotification(channel);

        notification.send(recipient, message);
    }
}
