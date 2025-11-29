package com.creational.design_pattern.abstract_factory;

/*
🚌 Example: Vehicle Manufacturing Factory

Imagine a company produces two types of vehicles:
    Electric Vehicles (EV)
    Petrol Vehicles

Each vehicle family has two related products:
    Car
    Bike

🧠 What is Abstract Factory Design Pattern?
    Abstract Factory is a creational design pattern used to create families of related objects
    without specifying their concrete classes.

Simple Definition:
    Abstract Factory provides an interface to create multiple related objects without exposing the creation logic.

❓ Why do we need Abstract Factory?
    If you need to create groups / families of related objects
    If you want to keep code flexible and scalable
    If you want to avoid changing client code when adding new product variants

🧠 When to Use Abstract Factory?
    If you need multiple related objects
    System should be configurable by product family
    If you want to avoid if/else or switch everywhere
*/
/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: VehicleFactory
 */
public interface VehicleFactory {
    Bike createBike();
    Car createCar();
}