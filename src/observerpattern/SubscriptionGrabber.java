/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;
import java.util.*;

/**
 *
 * @author Dejvi
 */
public class SubscriptionGrabber implements Subject { 
    private List<Observer> subscribers = new ArrayList<Observer>();
    private double price;
    
    public SubscriptionGrabber() {
        subscribers = new ArrayList<Observer>();
    }
    
    public double getCurrentPrice() {
        return price;
    }
    
    public void setNewPrice(double newPrice) {
        this.price = newPrice;
        notifyAllSubscribers();
    }
    
    public void addNewSubscriber(Observer newSubscriber) {
        subscribers.add(newSubscriber);
    }
    
    public void removeSubscriber(Observer unsubscriber) {
        int indexOfUnsubscriber = subscribers.indexOf(unsubscriber);
        subscribers.remove(indexOfUnsubscriber);
    }
    
    public void notifyAllSubscribers() {
        for (Observer subscriber : subscribers){
            subscriber.update(price);
        }
    }
}