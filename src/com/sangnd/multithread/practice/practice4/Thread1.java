package com.sangnd.multithread.practice.practice4;

import java.util.ArrayList;
import java.util.Random;

public class Thread1 extends Thread {
    public ArrayList<Integer> list1;

    public Thread1() {
        list1 = new ArrayList<>();
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int rad = random.nextInt(100);
            list1.add(rad);

            System.out.println("Thread 1: " + rad);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
