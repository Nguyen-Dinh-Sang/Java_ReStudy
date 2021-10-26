package com.sangnd.multithread.practice;

public class MyThread2 implements Runnable {
    private Boolean isEvenNumber;

    public MyThread2(Boolean isEvenNumber) {
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (isEvenNumber) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}