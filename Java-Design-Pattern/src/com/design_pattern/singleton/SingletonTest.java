package com.design_pattern.singleton;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: SingletonTest
 */
public class SingletonTest {
    public static void main(String[] args) {
        Runnable task1 = () -> { 
            SingletonDemo singletonDemo = SingletonDemo.getInstance();
            System.out.println(Thread.currentThread().getName()+" Object hashCode: "+singletonDemo);
        };
        Runnable task2 = () -> { 
            SingletonDemo singletonDemo = SingletonDemo.getInstance();
            System.out.println(Thread.currentThread().getName()+" Object hashCode: "+singletonDemo);
        };
        Runnable task3 = () -> { 
            SingletonDemo singletonDemo = SingletonDemo.getInstance();
            System.out.println(Thread.currentThread().getName()+" Object hashCode: "+singletonDemo);
        };
        Runnable task4 = () -> { 
            SingletonDemo singletonDemo = SingletonDemo.getInstance();
            System.out.println(Thread.currentThread().getName()+" Object hashCode: "+singletonDemo);
        };
        Runnable task5 = () -> { 
            SingletonDemo singletonDemo = SingletonDemo.getInstance();
            System.out.println(Thread.currentThread().getName()+" Object hashCode: "+singletonDemo);
        };
        
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        Thread thread5 = new Thread(task5);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}