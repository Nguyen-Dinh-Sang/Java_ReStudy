package com.sangnd.multithread.demo;

public class FirstThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message from First Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("First Thread error: " + e);
            }
        }
    }
}
