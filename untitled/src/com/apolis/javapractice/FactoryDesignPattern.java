package com.apolis.javapractice;


// Factory Design Pattern : it is used for creation of an object. It basically asks you to define an interface for
//                          creating objects and let the subclasses decide which class to instantiate.
public class FactoryDesignPattern {
    public static void main(String[] args) {
        NotificationFactory notificationFactory= new NotificationFactory();
        Notification notification= notificationFactory.notificationCreation("email");
        notification.notifyUser();
    }
}

interface Notification{
void notifyUser();
}

class TextNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notification in text form");
    }
}
class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notification in Email form");
    }
}
class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notification in application");
    }
}

class NotificationFactory{
    public Notification notificationCreation(String type)
    {
        if(type==null || type.isEmpty())
            return null;
        switch (type){
            case "text":
                return new TextNotification();
            case "email":
                return new EmailNotification();
            case "in app":
                return new PushNotification();

            default:
                throw  new IllegalArgumentException("Please check the type again"+ type);
        }
    }
}