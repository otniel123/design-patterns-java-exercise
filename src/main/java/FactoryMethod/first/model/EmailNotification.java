package FactoryMethod.first.model;

import FactoryMethod.first.Interface.Notification;

public class EmailNotification implements Notification {
    private String email;

    public EmailNotification(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to " + recipient  +
                ". Message: " + message);
    }
}
