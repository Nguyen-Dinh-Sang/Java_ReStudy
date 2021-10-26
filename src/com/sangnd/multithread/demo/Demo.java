package com.sangnd.multithread.demo;

import java.util.PrimitiveIterator;

public class Demo {
    public void run() {
//        createFromRunnable();
//        createFromThread();
//        differenceRunnableAndThread();
//        join();
//        synchronizedRunnable();
//        relationshipThreads();
    }

    private void createFromRunnable() {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        Thread thread1 = new Thread(firstThread);
        Thread thread2 = new Thread(secondThread);

        thread1.start();
        thread2.start();
    }

    private void createFromThread() {
        SimpleThread simpleThread1 = new SimpleThread("Ho Chi Minh");
        SimpleThread simpleThread2 = new SimpleThread("Ha Noi");

        simpleThread1.start();
        simpleThread2.start();
    }

    private void differenceRunnableAndThread() {
        DifferenceRunnable differenceRunnable = new DifferenceRunnable();

        Thread thread1 = new Thread(differenceRunnable);
        Thread thread2 = new Thread(differenceRunnable);

        thread1.start();
        thread2.start();

        DifferenceThread differenceThread1 = new DifferenceThread();
        DifferenceThread differenceThread2 = new DifferenceThread();
        differenceThread1.run();
        differenceThread2.run();
    }

    private void join() {
        try {
            SimpleThread simpleThread1 = new SimpleThread("Thread 1");
            SimpleThread simpleThread2 = new SimpleThread("Thread 2");

            simpleThread1.start();
            simpleThread1.join();
            simpleThread2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void synchronizedRunnable() {
        SynchronizedRunnable synchronizedRunnable = new SynchronizedRunnable();

        Thread thread1 = new Thread(synchronizedRunnable);
        Thread thread2 = new Thread(synchronizedRunnable);
        Thread thread3 = new Thread(synchronizedRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private void relationshipThreads() {
        DebitCard debitCard = new DebitCard();

        Thread thread1 = new Thread() {
          public void run() {
              debitCard.withdraw(1500);
          }
        };
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
         debitCard.deposit(2000);
            }
        });
        thread2.start();
    }
}
