package com.sangnd.inherit.demo;

public class Demo {
    public void run() {
        test1();
        test2();
    }

    private void test1() {
        Employee employee = new Employee("Nguyen Dinh Sang", 7.0);
        employee.show();
    }

    private void test2() {
        Manager manager = new Manager("Nguyen Thi Xuan Linh", 8.0, 1.0);
        manager.show();
    }
}
