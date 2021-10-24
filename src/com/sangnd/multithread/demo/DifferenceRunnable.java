package com.sangnd.multithread.demo;

public class DifferenceRunnable implements Runnable{
    private int counter = 0;

    @Override
    public void run() {
        counter++;
        System.out.println("DifferenceRunnable: " + counter);
    }
}
