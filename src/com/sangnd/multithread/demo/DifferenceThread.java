package com.sangnd.multithread.demo;

public class DifferenceThread extends Thread{
    private int counter = 0;

    @Override
    public void run() {
        counter++;
        System.out.println("DifferenceThread: " + counter);
    }
}
