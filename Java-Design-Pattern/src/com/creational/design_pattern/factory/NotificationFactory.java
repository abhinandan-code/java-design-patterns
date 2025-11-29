package com.creational.design_pattern.factory;

/*
    🧠 What is Factory Design Pattern?
    Factory Pattern is a creational design pattern that provides a way to create objects
    without exposing the object creation logic to the client.

    Simple definition:
        A Factory Pattern creates objects for you, instead of you creating them manually using new.

    ❓ Why do we use Factory Pattern?
    Because:
    It helps achieve loose coupling
    Object creation logic is centralized
    Easy to add new types without modifying existing code
    Improves maintainability and follows OOP best practices (SOLID)

    🌟 When to use Factory Pattern
        #   When object creation is complex
        #   When we have multiple classes implementing same interface
        #   When we want flexibility and scalability

    Examples in real world:

    *JDBC DriverManager (getConnection())
    *Spring Framework (ApplicationContext)
    *Logger frameworks
*/
/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: NotificationFactory
 */
public class NotificationFactory {
    public static Notification getNotificationInstance(String objectType) {
        if (objectType == null) {
            return null;
        }
        return switch (objectType.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> null;
        };
    }
}