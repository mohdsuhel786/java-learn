package DesignPattern.ObserverDesign.Observer;

import DesignPattern.ObserverDesign.Observable.Observable;

public class MobileNotificationObserver implements NotificationObserver{

    Observable observable;
    String name;
    public MobileNotificationObserver(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }



    @Override
    public void update() {
        // TODO Auto-generated method stub
       sendNotification();
    }

    public void sendNotification(){
        System.out.println("Mobile notification succesfully to: " + name);
    }
}
