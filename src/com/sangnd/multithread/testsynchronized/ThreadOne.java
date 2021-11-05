package com.sangnd.multithread.testsynchronized;

import java.util.Random;

public class ThreadOne extends Thread{
    private SharedData sharedData;

    public ThreadOne(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            synchronized (sharedData) {
                int rd = random.nextInt(10);
                sharedData.random = rd;
                System.out.println("Thread One: " + rd);

                sharedData.notifyAll();

                if (i != 5) {
                    try {
                        sharedData.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
