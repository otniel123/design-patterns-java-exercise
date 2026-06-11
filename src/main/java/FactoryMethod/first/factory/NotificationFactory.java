package FactoryMethod.first.factory;

import FactoryMethod.first.Interface.Notification;
import FactoryMethod.first.model.EmailNotification;
import FactoryMethod.first.model.PushNotification;
import FactoryMethod.first.model.SmsNotification;

public class NotificationFactory {

    public static Notification createNotification(String channelType){

        if (channelType.equals("EMAIL")){
            EmailNotification n = new EmailNotification("smtp@gmail.com");
            return n;
        } else if (channelType.equals("SMS")) {
            SmsNotification n = new SmsNotification("api-key-123");
            return n;
        }else if (channelType.equals("PUSH")){
            PushNotification n = new PushNotification("firebase-config");
            return n;
        }
        return null;
    }
}
