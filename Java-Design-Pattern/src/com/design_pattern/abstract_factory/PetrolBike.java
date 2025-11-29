package com.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: PetrolBike
 */
public class PetrolBike implements Bike {
    /**
     * Ride Petrol Bike
     */
    @Override
    public void ride() {
        System.out.println("Riding petrol bike ..!");
    }
}