package com.creational.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: PetrolVehicleFactory
 */
public class PetrolVehicleFactory implements VehicleFactory {
    /**
     * createBike
     * @return
     */
    @Override
    public Bike createBike() {
        return new PetrolBike();
    }

    /**
     * createCar
     * @return
     */
    @Override
    public Car createCar() {
        return new PetrolCar();
    }
}