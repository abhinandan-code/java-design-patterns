package com.creational.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: ElectricCar
 */
public class ElectricCar implements Car {
    /**
     * Drive a electric car
     */
    @Override
    public void drive() {
        System.out.println("Driving Electric Car ..!");
    }
}