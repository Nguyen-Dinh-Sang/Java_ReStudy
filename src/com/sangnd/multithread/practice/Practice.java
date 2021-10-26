package com.sangnd.multithread.practice;

import com.sangnd.multithread.practice.practice4.Thread1;
import com.sangnd.multithread.practice.practice4.Thread2;

public class Practice {
    public void run() {
//        practice1();
//        practice2();
//        practice3();
        practice4();
    }

    private void practice1() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }

    private void practice2() {
        try {
            MyThread2 myThread1 = new MyThread2(true);
            MyThread2 myThread2 = new MyThread2(false);

            Thread thread1 = new Thread(myThread1);
            Thread thread2 = new Thread(myThread2);

            thread1.start();
            thread1.join();
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void practice3() {
        ThreadOne threadOne = new ThreadOne();
        Thread thread1 = new Thread(threadOne);
        ThreadTwo threadTwo = new ThreadTwo(thread1);
        Thread thread2 = new Thread(threadTwo);
        thread1.start();
        thread2.start();
    }

    private void practice4() {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("RESULT");

        System.out.println("Thread 1: ");
        for (int i = 0; i < thread1.list1.size(); i++) {
            System.out.print(thread1.list1.get(i) + " ");
        }

        System.out.println("\nThread 2: ");
        for (int i = 0; i < thread2.list2.size(); i++) {
            System.out.print(thread2.list2.get(i) + " ");
        }
    }
}
