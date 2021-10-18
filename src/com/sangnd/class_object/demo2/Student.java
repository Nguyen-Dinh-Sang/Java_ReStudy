package com.sangnd.class_object.demo2;

import java.util.Scanner;

public class Student {
    private String fullName;
    private Double score;

    public Student(String fullName, Double score) {
        this.fullName = fullName;
        this.score = score;
    }

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void rankedAcademic() {
        if (score != null) {
            if (score > 5) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        } else {
            System.out.println("No score");
        }
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        this.fullName = scanner.nextLine();

        System.out.print("Enter score: ");
        this.score = scanner.nextDouble();
    }

    public void output() {
        System.out.println(this.fullName + " : " +this.score);
    }
}
