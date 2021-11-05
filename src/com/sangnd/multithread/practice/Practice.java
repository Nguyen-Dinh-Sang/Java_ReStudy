package com.sangnd.multithread.practice;

import com.sangnd.multithread.practice.practice4.Thread1;
import com.sangnd.multithread.practice.practice4.Thread2;
import com.sangnd.multithread.testsynchronized.CustomThread;
import com.sangnd.multithread.testsynchronized.SharedData;

public class Practice {
    public void run() {
//        practice1();
//        practice2();
//        practice3();
//        practice4();
//        practiceSynchronized();
//        practiceSynchronized2();
        practiceSynchronized3();
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

    private void practiceSynchronized() {
        SharedData sharedData = new SharedData();
        CustomThread thread1 = new CustomThread(sharedData);
        CustomThread thread2 = new CustomThread(sharedData);
        CustomThread thread3 = new CustomThread(sharedData);
        thread1.start();
        thread2.start();
        thread3.start();
        // Khi có nhiều thread cùng sửa data thì lúc đó data sẽ không tăng theo thứ tự nữa -> vấn đề.
    }

    private void practiceSynchronized2() {
        SharedData sharedData = new SharedData();
        CustomThread thread1 = new CustomThread(sharedData);
        CustomThread thread2 = new CustomThread(sharedData);
        CustomThread thread3 = new CustomThread(sharedData);
        thread1.start();
        thread2.start();
        thread3.start();
        // Sau khi thêm synchronized thì dữ liệu được sửa đồng bộ nên sẽ tăng theo thứ tự.
    }

    private void practiceSynchronized3() {
        SharedData sharedData = new SharedData();
        com.sangnd.multithread.testsynchronized.ThreadOne threadOne = new com.sangnd.multithread.testsynchronized.ThreadOne(sharedData);
        com.sangnd.multithread.testsynchronized.ThreadTwo threadTwo = new com.sangnd.multithread.testsynchronized.ThreadTwo(sharedData);
        threadOne.start();
        threadTwo.start();

        // Chương trình sẽ bị treo do khóa và mở chưa hợp lý và chưa có điều kiện dừng
        // Khi thread chạy hết for vòng cuối không kết thúc thread mà đưa vào trạng thái wait.
        // Trên thực tế thì việc dừng luồng sẽ được xử lý từ đây.
    }
}
