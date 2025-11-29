package com.creational.design_pattern.factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: PushNotification
 */
public class PushNotification implements Notification{
    /**
     * User will get PUSH notification
     */
    @Override
    public void notifyUser() {
        System.out.println("PUSH Notification Logic ..!");
    }
}