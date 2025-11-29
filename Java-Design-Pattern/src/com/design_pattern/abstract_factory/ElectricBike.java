package com.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: ElectricBike
 */
public class ElectricBike implements Bike {
    /**
     * Ride Electric Bike
     */
    @Override
    public void ride() {
        System.out.println("Riding Electric Bike ..!");
    }
}