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
public class ObserverPattern {
    public static void main(String[] args) {
        SubscriptionGrabber subscriptionGrabber = new SubscriptionGrabber();
        SubscriptionObserver subscriptionObserver = new SubscriptionObserver(subscriptionGrabber);
        SubscriptionObserver subscriptionObserver2 = new SubscriptionObserver(subscriptionGrabber);
        SubscriptionObserver subscriptionObserver3 = new SubscriptionObserver(subscriptionGrabber);
        subscriptionGrabber.setNewPrice(5);
    }
}
