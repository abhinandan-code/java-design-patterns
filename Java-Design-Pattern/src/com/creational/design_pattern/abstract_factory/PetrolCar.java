package com.creational.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: PetrolCar
 */
public class PetrolCar implements Car {
    /**
     *  Drive petrol car
     */
    @Override
    public void drive() {
        System.out.println("Driving petrol Car ..!");
    }
}