package com.sangnd.multithread.practice.practice4;

import java.util.ArrayList;
import java.util.Random;

public class Thread2 extends Thread{
    public ArrayList<Character> list2;

    public Thread2() {
        list2 = new ArrayList<>();
    }

    @Override
    public void run() {
        Random random = new Random();
        int min = (int) 'a';
        int max = (int) 'z';
        int limit = max - min;

        for (int i = 0; i < 10 ; i++) {
            char c = (char) (random.nextInt(limit) + min);
            list2.add(c);

            System.out.println("Thread 2: " + c);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
