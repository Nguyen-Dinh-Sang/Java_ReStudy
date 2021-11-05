package com.sangnd.multithread.testsynchronized;

public class SharedData {
    public int x = 0;

    public int random = 0;

//    public  void add(int pulus){
//        x += pulus;
//        System.out.println("X = " + x);
//    }

    // update
    public synchronized void add(int pulus){
        x += pulus;
        System.out.println("X = " + x);
    }
}
