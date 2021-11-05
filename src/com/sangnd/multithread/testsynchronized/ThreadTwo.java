package com.sangnd.multithread.testsynchronized;

public class ThreadTwo extends Thread {
    private SharedData sharedData;

    public ThreadTwo(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (sharedData) {
                sharedData.notifyAll();


                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int result = sharedData.random * sharedData.random;
                System.out.println("Thread Two: " + result);

                // kiểm tra và dừng luồn thay vì bỏ qua awit
                if (i == 5) {
                    stop();
                }
            }
        }
    }
}
