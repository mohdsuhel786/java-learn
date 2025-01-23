package DesignPattern.ObserverDesign.Observer;

import DesignPattern.ObserverDesign.Observable.Observable;

public class EmailNotificationObserver implements NotificationObserver {
                Observable observable;
                String name;


    public EmailNotificationObserver(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }
    @Override
    public void update() {
        // TODO Auto-generated method stub
        sendEmailNotification();
    }
    
    public void sendEmailNotification(){
        System.out.println("Email send succesfully to: " + name);
    }
}