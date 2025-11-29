package com.creational.design_pattern.builder;

/*
🧠 What is Builder Design Pattern?
Builder is a creational design pattern used to create complex objects.

Simple definition:
    Builder helps construct objects with many parameters in a readable and flexible way.
❓ Why do we need Builder?
When a class has many fields (optional + required), using constructors becomes difficult.

Example of bad code:
User user = new User("Abhi", 25, "India", "98765xxxxx", "developer", "MCA", "single");

    Hard to read
    Hard to remember order
    Adding new fields breaks all code

🔥 Benefits:
    Easy to read
    Easy to modify
    Set only what you need (optional values allowed)
    No confusion with parameters order

🧠 Real-world examples of Builder Pattern
    StringBuilder	=> StringBuilder sb = new StringBuilder().append("Hi").append("Bro");
    Java Streams	=> Stream.builder().add(1).add(2).build()
    Lombok	=> @Builder annotation
    HTTP Requests => OkHttp Request.Builder()
    Object creation in frameworks	=> Hibernate, Spring
*/
/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: UserBuilder
 */
public class UserBuilder {
    private String name;
    private int age;
    private String city;
    private String phone;

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User buildUser() {
        return new User(name, age, city, phone);
    }
}