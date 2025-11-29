package com.structural.design_pattern.composit;
/*
🧠 What is Composite Design Pattern?
Composite is a structural design pattern used to treat a group of objects and a single object in the same way.

Simple definition:
Composite pattern allows you to create a tree-like structure of objects and work with them uniformly.

So you don’t need separate logic for:
    Single object
    Collection of objects

🌳 Good Example: Company Employee Hierarchy

Imagine a company structure:
    CEO
    Managers
    Developers
    Designers

We want to perform an operation like:
👉 showDetails() on any employee (single)
👉 or on a whole department/team (group)

We should treat individual employees and groups of employees the same way.
This is where Composite Pattern is perfect.
*/
/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: Employee
 */
public interface Employee {
    void showDetails();
}
