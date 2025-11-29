package com.creational.design_pattern.factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: SmsNotification
 */
public class SmsNotification implements Notification{
    /**
     * User will get SMS notification
     */
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification Logic..!");
    }
}