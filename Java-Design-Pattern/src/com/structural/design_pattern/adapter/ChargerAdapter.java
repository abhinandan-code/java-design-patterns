package com.structural.design_pattern.adapter;

/*
🧠 What is Adapter Design Pattern?
    Adapter is a structural design pattern that allows two incompatible interfaces to work together.

Simple definition:
    Adapter acts like a bridge between two classes that normally cannot communicate because their method formats are different.

🎯 Real-life Example (Easy Understanding)
    Mobile Charger Adapter
    If you have:
        A plug with USB-C
        But your socket supports Type-A
        You need an adapter to convert USB-C → Type-A.

    Without the adapter → cannot connect
    With the adapter → works smoothly

🧠 When do we use Adapter Pattern?

    You want to integrate an existing class but its methods don’t match expected format
    Replace or upgrade a legacy system with new system
    Connect API formats that are different

🧠 Real Industry Examples
    Java IO =>	InputStreamReader, OutputStreamWriter
    Collections Framework =>	Arrays.asList()
    Database =>	JPA adapters to SQL/NoSQL
    Payment system integration => 	Convert vendor API formats
    Legacy → New migration =>	Old XML system converted to JSON format
*/
/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: ChargerAdapter
 */
public class ChargerAdapter  implements Phone {

    LaptopCharger laptopCharger;

    public ChargerAdapter(LaptopCharger laptopCharger) {
        this.laptopCharger = laptopCharger;
    }

    /**
     * Charger
     */
    @Override
    public void charger() {
        laptopCharger.supplyPower(); // Converting Format
        System.out.println("Phone is charging by Adaptor Using Laptop USB ");

    }
}