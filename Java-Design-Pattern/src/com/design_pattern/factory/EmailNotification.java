package com.design_pattern.factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: EmailNotification
 */
public class EmailNotification implements Notification{
    /**
     * User will get Email notification
     */
    @Override
    public void notifyUser() {
        System.out.println("Email Notification Logic ..!");
    }
}