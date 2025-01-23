package DesignPattern.ObserverDesign.Observable;

import DesignPattern.ObserverDesign.Observer.NotificationObserver;

public interface Observable {
    
   void addObserver(NotificationObserver notificationObserver);
    void removeObserver(NotificationObserver notificationObserver);
    void notifyObserver();

}
