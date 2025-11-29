package com.design_pattern.factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: FactoryTest
 */
public class FactoryTest {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.getNotificationInstance("sms");
        smsNotification.notifyUser();
        Notification mailNotification = NotificationFactory.getNotificationInstance("email");
        mailNotification.notifyUser();
        Notification pushNotification = NotificationFactory.getNotificationInstance("push");
        pushNotification.notifyUser();
    }
}