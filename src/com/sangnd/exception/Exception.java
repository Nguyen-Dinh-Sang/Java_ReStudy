package com.sangnd.exception;

import com.sangnd.exception.demo.Demo;

public class Exception {
    public static void main(String[] args) {
        executeDemo();
    }

    private static void executeDemo() {
        Demo demo = new Demo();
        demo.run();
    }
}
