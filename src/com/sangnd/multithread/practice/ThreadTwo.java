package com.sangnd.multithread.practice;

public class ThreadTwo implements Runnable {
    private Thread threadOne;

    public ThreadTwo(Thread threadOne) {
        this.threadOne = threadOne;
    }

    @Override
    public void run() {
        System.out.println("Thread one join...");
        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread two: " + i);
        }
    }
}
