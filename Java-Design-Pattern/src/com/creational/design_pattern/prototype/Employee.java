package com.creational.design_pattern.prototype;

/*
🧠 What is Prototype Design Pattern?
    Prototype is a creational design pattern that allows you to create
    new objects by cloning an existing object, instead of creating from scratch.

Simple Definition:
Prototype pattern makes a copy (clone) of an object so you don’t need to recreate it again and again.

❓ Why Use Prototype Pattern?
    Creating a new object is costly or time-consuming (e.g., database queries, API calls, heavy computation)
    You want many similar objects with small variations
    You need object duplication performance

🎯 Real-life Example (Easy understanding)

Original passport → Copy → Copy → Copy → ...
    Passport Xerox Machine
    If you need 10 copies of your passport:
    You don’t rewrite the whole passport manually
    You take 1 original and Xerox clone it quickly many times
*/
/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: Employee
 */
public class Employee implements Cloneable {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}