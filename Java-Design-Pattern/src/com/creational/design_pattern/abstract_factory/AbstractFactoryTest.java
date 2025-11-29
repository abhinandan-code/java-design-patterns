package com.creational.design_pattern.abstract_factory;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: AbstractFactoryTest
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new ElectricVehicleFactory();

        Car car = vehicleFactory.createCar();
        Bike bike = vehicleFactory.createBike();

        car.drive();
        bike.ride();

        VehicleFactory vehicleFactory1 = new PetrolVehicleFactory();

        Car car1 = vehicleFactory1.createCar();
        Bike bike1 = vehicleFactory1.createBike();

        car1.drive();
        bike1.ride();
    }
}