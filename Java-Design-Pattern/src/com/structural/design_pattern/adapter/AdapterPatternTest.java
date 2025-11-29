package com.structural.design_pattern.adapter;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: AdapterPatternTest
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        LaptopCharger laptopCharger = new LaptopCharger();
        Phone phone = new ChargerAdapter(laptopCharger);
        phone.charger();
    }
}