package com.sangnd.generics;

import java.util.ArrayList;

public class PersonModel<T> {
    public ArrayList<T> li = new ArrayList<>();

    public void addObject(T object) {
        li.add(object);
    }

    public void display() {
        for (T item : li) {
            System.out.println(item);
        }
    }
}
