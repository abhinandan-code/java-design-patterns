package com.structural.design_pattern.composit;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: Designer
 */
public class Designer implements Employee {
    private String name;
    private String tools;

    public Designer(String name, String tools) {
        this.name = name;
        this.tools = tools;
    }

    /**
     * showDetails of Designer
     */
    @Override
    public void showDetails() {
        System.out.println("Designer Name: "+name+" Tools: "+tools);
    }
}