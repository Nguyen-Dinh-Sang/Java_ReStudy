package com.sangnd.io.demo;

import java.io.Serializable;

public class Stock implements Serializable {
    private int id;
    private String desc;
    private double price;
    private int quantity;

    public Stock(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
