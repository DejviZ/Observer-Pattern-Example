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
public class SubscriptionObserver implements Observer {
    private double price;
    private Subject subscriberGrabber;
    private static int subscriptionID;
    
    public SubscriptionObserver(Subject subscriptionGrabber) {
        this.subscriberGrabber = subscriptionGrabber;
        this.subscriptionID+=1;
        subscriberGrabber.addNewSubscriber(this);
        System.out.println("New Observer: " + this.subscriptionID);
    }
    
    public void update(double price) {
        System.out.println("Price changed from $" + this.price + " to $" + price);
        this.price = price;  
    }
}