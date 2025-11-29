package com.structural.design_pattern.composit;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: Developer
 */
public class Developer implements Employee {
    private String name;
    private String skill;

    public Developer(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    /**
     * showDetails of Developer
     */
    @Override
    public void showDetails() {
        System.out.println("Developer Name: "+name+" Skill: "+skill);
    }
}