package com.sangnd.arraylist;

import com.sangnd.class_object.demo1.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
//        executeDemo();
        executeTest();
    }

    private static void executeTest() {
        Integer index = 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Loop: " + index);

            System.out.print("Enter more(Y/N): ");
            if(scanner.nextLine().equals("N")) {
                break;
            }

            index++;
        }
    }

    private static void executeDemo() {
//        sort1();
//        sort2();
//        sort3();
//        sort4();
    }

    private static void sort1() {
        List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(10);

        Collections.sort(integerList);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        Collections.reverse(integerList);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

    private static void sort2() {
        List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(10);

        integerList.sort(Comparator.naturalOrder());
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

    private static void sort3() {
        List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        integerList.add(1);
        integerList.add(10);

        Collections.sort(integerList, (a, b) -> a.compareTo(b));

        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

    private static void sort4() {
        List<Student> studentArrayList = new java.util.ArrayList<>();

        studentArrayList.add(new Student("A", 10.0));
        studentArrayList.add(new Student("B", 1.0));
        studentArrayList.add(new Student("D", 3.0));
        studentArrayList.add(new Student("H", 5.0));
        studentArrayList.add(new Student("J", 7.0));

        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        };

        Collections.sort(studentArrayList, studentComparator);

        for (Student student : studentArrayList) {
            System.out.println(student.getFullName() + " : " + student.getPoints());
        }
    }
}
