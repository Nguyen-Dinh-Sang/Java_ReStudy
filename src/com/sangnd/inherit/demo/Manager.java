package com.sangnd.inherit.demo;

public class Manager extends Employee{
    private Double responsibility;

    public Manager(String fullName, Double salary, Double responsibility) {
        super(fullName, salary);
        this.responsibility = responsibility;
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("Responsibility: %.0f", responsibility);
    }
}
