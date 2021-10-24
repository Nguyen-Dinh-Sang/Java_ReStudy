package com.sangnd.multithread.demo;

public class DebitCard {
    int amount = 1000;

    public synchronized void withdraw(int m) {
        System.out.println("Bạn đang rút tiền...");
        if (amount < m) {
            System.out.println("không đủ tiền để rút!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        amount -= m;
        System.out.println("Rút tiền thành công!");
    }

    public synchronized void deposit(int m) {
        System.out.println("Bạn đang nạp tiền...");
        amount += m;
        System.out.println("Nạp tiền thành công!");
        notify();
    }
}
