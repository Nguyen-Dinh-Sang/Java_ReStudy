package com.sangnd.exception.demo;

public class MyException extends Exception{
    private int message;

    public MyException(int message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "message=" + message +
                '}';
    }
}
