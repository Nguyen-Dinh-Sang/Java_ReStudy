package com.sangnd.exception.demo;

public class Demo {
    public void run() {
//        demo1();
//        demo2();
//        demo3();
//        deme4();
        demo5();
    }

    private void demo1() {
        Integer a = 10;
        Integer b = 0;

        try {
            Integer c = a / b;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("After doing the math!");
    }

    private void demo2() {
        try {
            int b = 0;
            int a = 10 / b;
            int c[] = {2};
            c[5] = 3;
            System.out.println("a= " + a);
        } catch (ArithmeticException e) {   //(1)
            System.out.println("Phep chia cho 0: " + e);
        } catch (Exception e) {             //(2)
            System.out.println("Co loi: " + e);
        }
    }

    private void demo3() {
        proA();
        proB();
        proC();
    }

    private void proA() {
        try {
            System.out.println("In proA");
            throw  new RuntimeException("ProA");
        } finally {
            System.out.println("Finally proA");
        }
    }

    private void proB() {
        try {
            System.out.println("In proB");
            return;
        } finally {
            System.out.println("Finally proB");
        }
    }

    private void proC() {
        try {
            System.out.println("In proC");
        } finally {
            System.out.println("Finally proC");
        }
    }

    private void deme4() {
        demoThrow1();
        try {
            demoThrow2();
        } catch (NullPointerException e) {
            System.out.println("Catch demo4: " + e);
        }
    }

    private void demoThrow1() {
        try {
            throw new NullPointerException("TestThrow1");
        } catch (NullPointerException e) {
            System.out.println("Catch demoThrow1: " + e);
        }
    }

    private void demoThrow2() {
        try {
            throw new NullPointerException("TestThrow2");   //(1)
        } catch (NullPointerException e) {
            System.out.println("Catch demoThrow2: " + e);
            throw e;                                        //(2)
        }
    }

    private void demo5() {
        try {
            testException(1);
            testException(20);
        } catch (MyException e) {
            System.out.println("Caugh: " + e);
        }
    }

    public void testException(int a) throws MyException{
        if (a < 10) {
            throw  new MyException(a);
        }
        System.out.println("Test exception!");
    }
}
