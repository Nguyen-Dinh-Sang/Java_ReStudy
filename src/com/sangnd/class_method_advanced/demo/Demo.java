package com.sangnd.class_method_advanced.demo;

public class Demo {

    public void run() {
//        demo1();
        demo2();
    }

    private void demo1() {
        int a = 5;
        int[] b = {1, 2, 3};

        add(a);
        add(b);

        System.out.println("A: " + a);
        System.out.println("B: " + b[0]);
    }

    private void add(int[] x) {
        x[0] += 10;
    }

    private void add(int x) {
        x += 10;
    }

    private void demo2() {
        System.out.println("A: " + sum(1));
        System.out.println("A: " + sum(1,2,3,4));
        int[] x = {1,2,3,4,5,6};
        System.out.println("A: " + sum(x));
    }

    private int sum(int...x) {
        int sum = 0;
        for (int item : x) {
            sum += item;
        }
        return sum;
    }
}
