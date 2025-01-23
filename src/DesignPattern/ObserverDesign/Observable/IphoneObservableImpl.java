package DesignPattern.ObserverDesign.Observable;

import java.util.ArrayList;
import java.util.List;

import DesignPattern.ObserverDesign.Observer.NotificationObserver;

public class IphoneObservableImpl implements Observable   {

   public List<NotificationObserver> observers = new ArrayList<>();
   public int stockCount = 0;
@Override
public void addObserver(NotificationObserver notificationObserver) {
  
   observers.add(notificationObserver);
}
@Override
public void removeObserver(NotificationObserver notificationObserver) {

   observers.remove(notificationObserver);
}
@Override
public void notifyObserver() {

   for(NotificationObserver observer: observers){
    observer.update();
   }
}

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifyObserver();
            System.out.println("new stock added " + newStockCount);
        }
        stockCount = newStockCount;
        
    }
    
}
