package com.sangnd.inherit.demo;

public class Employee {
    private String fullName;
    private Double salary;

    public Employee(String fullName, Double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public void show() {
        System.out.printf("%s salary %.0f million\n", fullName, salary);
    }
}
