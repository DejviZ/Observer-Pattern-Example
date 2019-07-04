/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author Dejvi
 */
public interface Subject {
    public double getCurrentPrice();
    public void setNewPrice(double newPrice);
    public void addNewSubscriber(Observer newSuObserver);
    public void removeSubscriber(Observer unsubscriber);
    public void notifyAllSubscribers();
}