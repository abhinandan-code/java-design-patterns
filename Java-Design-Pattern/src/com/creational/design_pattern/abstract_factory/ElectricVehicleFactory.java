package com.creational.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: ElectricVehicleFactory
 */
public class ElectricVehicleFactory implements VehicleFactory {
    /**
     * createBike
     */
    @Override
    public Bike createBike() {
        return new ElectricBike();
    }

    /**
     * createCar
     */
    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}