package com.sangnd.generics;

import java.util.ArrayList;
import java.util.Random;

public class Practice {
    public void run() {
//        practice1();
//        practice2();
//        practice3();
//        practice4();
        practice5();
    }

    private void practice1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(9.5);
        arrayList.add(true);
        arrayList.add("SangND");

        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println("ArrayList[" + index + "] = " + arrayList.get(index));
        }
    }

    private void practice2() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt());
        }

        for (Integer integer: arrayList) {
            System.out.println("ArrayList: " + integer);
        }
    }

    private void practice3() {
        PersonModel<Student> personModel = new PersonModel<>();
        personModel.addObject(new Student(1, "Dinh Sang 01", 20));
        personModel.addObject(new Student(2, "Dinh Sang 02", 22));
        personModel.display();
    }

    private void practice4() {
        PersonModel<Employee> personModel = new PersonModel<>();
        personModel.addObject(new Employee(1, "Dinh Sang 01", 5000.0));
        personModel.addObject(new Employee(2, "Dinh Sang 02", 2000.0));
        personModel.display();
    }

    private void practice5() {
        PersonModel<String> personModel = new PersonModel<>();
        personModel.addObject("Dinh Sang 01");
        personModel.addObject("Dinh Sang 02");
        personModel.display();
    }
}
