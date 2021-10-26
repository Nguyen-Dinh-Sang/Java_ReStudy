package com.sangnd.multithread;

import com.sangnd.multithread.demo.Demo;
import com.sangnd.multithread.practice.Practice;

public class Multithread {
    public static void main(String[] args) {
        executeDemo();
        executePractice();
    }

    private static void executeDemo() {
        Demo demo = new Demo();
        demo.run();
    }

    private static void executePractice() {
        Practice practice = new Practice();
        practice.run();
    }
}
