package com.sangnd.multithread.demo;

public class SimpleThread extends Thread{

    public SimpleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Message from " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Second Thread error: " + e);
            }
        }
        System.out.println("===DONE===");
    }
}
