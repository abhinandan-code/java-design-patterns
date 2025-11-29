package com.structural.design_pattern.composit;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: CompositePatternTest
 */
public class CompositePatternTest {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Abhi", "Java");
        Employee dev2 = new Developer("Rohan", "React");
        Employee designer1 = new Designer("Priya", "Figma");
        Employee designer2 = new Designer("Priya", "PhotoShop");

        Manager engManager = new Manager("Suresh");
        engManager.add(dev1);
        engManager.add(dev2);

        Manager designManager = new Manager("Neha");
        designManager.add(designer1);
        designManager.add(designer2);

        Manager ceo = new Manager("Mr. CEO");
        ceo.add(engManager);
        ceo.add(designManager);
        ceo.remove(designManager);
        // One call prints entire hierarchy
        ceo.showDetails();
    }
}