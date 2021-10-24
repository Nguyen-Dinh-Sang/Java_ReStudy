package com.sangnd.multithread;

import com.sangnd.multithread.demo.Demo;

public class Multithread {
    public static void main(String[] args) {
        executeDemo();
    }

    private static void executeDemo() {
        Demo demo = new Demo();
        demo.run();
    }
}
