package com.design_pattern.builder;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: BuilderTest
 */
public class BuilderTest {

    public static void main(String[] args) {
        User user = new UserBuilder().setName("Abhi").setAge(29).setPhone("7890").buildUser();
        System.out.println("User: "+user);
    }
}