package com.sangnd.class_object.demo1;

import com.sangnd.class_object.demo2.Student;

public class ClassAndObject {
    public static void main(String[] args) {
        executeDemo();
    }

    private static void executeDemo() {
        Student student = new Student();
        student.input();
        student.output();
        student.rankedAcademic();

        Student student2 = new Student("Nguyen Dinh Sang", 10.0);
        student2.output();
        student2.rankedAcademic();
    }
}
