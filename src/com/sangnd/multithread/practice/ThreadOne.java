package com.sangnd.multithread.practice;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread one: " + i);
        }
    }
}
