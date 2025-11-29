package com.design_pattern.singleton;

/*
    🧠 What is Singleton Design Pattern?

    > Singleton is a creational design pattern which ensures that:
    > Only one object (instance) of a class is created.
    > That object is globally accessible from anywhere in the program.

    # Simple definition:
        > Singleton means one and only one instance of a class throughout the application.

    📍 Real-life examples:
        Example	Why Singleton?
            Database connection	=> Only one connection shared saves resources
            Logger	=> One logging instance for entire app
            Configuration/settings manager =>	Same settings everywhere
            Thread pool =>	Central task manager
            Cache / Shared memory =>	Consistency
*/

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: SingletonDemo
 */
public class SingletonDemo implements Cloneable{

    /**
     * Created static volatile variable with same name of class
     * to store single Object
     *  SingletonDemo
     */
    private static volatile SingletonDemo singletonDemo;

    /**
     * Created private constructor
     *  if constructor is private no one create object
     *
     *  Private constructor => block new
     */
    private SingletonDemo() {}

    /**
     * We need a global access point to get the same object everywhere in Application
     *
     *  return same instance every time
     *  getInstance
     */
    public static SingletonDemo getInstance() {
        if (singletonDemo == null) {
            synchronized (SingletonDemo.class){
                if (singletonDemo == null) {
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }

    /**
     * We can not clone singleton object
     */
    @Override
    public SingletonDemo clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }

}