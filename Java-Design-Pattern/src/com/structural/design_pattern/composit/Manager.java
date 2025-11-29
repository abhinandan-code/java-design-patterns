package com.structural.design_pattern.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: abhinandan
 * Date: 29/11/25
 * <p>
 * Class Name: Manager
 */
public class Manager implements Employee {
    private String name;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    /**
     * Add the Employee
     */
    public void add(Employee employee) {
        team.add(employee);
    }

    /**
     * Remove the Employee
     */
    public void remove(Employee employee) {
        team.remove(employee);
    }

    /**
     *
     */
    @Override
    public void showDetails() {
        System.out.println("\nManager: "+name);
        for (Employee emp: team) {
            emp.showDetails();
        }
    }
}