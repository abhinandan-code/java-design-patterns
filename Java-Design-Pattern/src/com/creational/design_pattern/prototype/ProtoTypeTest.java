package com.creational.design_pattern.prototype;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: ProtoTypeTest
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Abhinandan", "IT");
        Employee employee2 = employee1.clone();

        System.out.println(employee1);
        System.out.println(employee2);
    }
}