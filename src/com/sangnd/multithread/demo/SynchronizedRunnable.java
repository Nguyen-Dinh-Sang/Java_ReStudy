package com.sangnd.multithread.demo;

public class SynchronizedRunnable implements Runnable{
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message from SynchronizedRunnable: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("SynchronizedRunnable error: " + e);
            }
        }
    }
}
