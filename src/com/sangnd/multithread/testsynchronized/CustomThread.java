package com.sangnd.multithread.testsynchronized;

public class CustomThread extends Thread {
    SharedData sharedData;

    public CustomThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedData.add(1);
        }
    }
}
