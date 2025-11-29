package com.creational.design_pattern.builder;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: User
 */
public class User {
    private String name;
    private int age;
    private String city;
    private String phone;

    public User(String name, int age, String city, String phone) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}