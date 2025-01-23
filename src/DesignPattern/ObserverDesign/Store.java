package DesignPattern.ObserverDesign;

import DesignPattern.ObserverDesign.Observable.IphoneObservableImpl;
import DesignPattern.ObserverDesign.Observer.EmailNotificationObserver;
import DesignPattern.ObserverDesign.Observer.MobileNotificationObserver;
import DesignPattern.ObserverDesign.Observer.NotificationObserver;

public class Store {

    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();

        NotificationObserver observer1 = new EmailNotificationObserver("user1@email.com", iphoneObservable);
        NotificationObserver observer2 = new MobileNotificationObserver("user2@email.com", iphoneObservable);
        NotificationObserver observer3 = new EmailNotificationObserver("user3@email.com", iphoneObservable);

        iphoneObservable.addObserver(observer1);
        iphoneObservable.addObserver(observer2);
        iphoneObservable.addObserver(observer3);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(100);
    }
}
