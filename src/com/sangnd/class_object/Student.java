package com.sangnd.class_object;

public class Student {
    private String fullName;
    private Double points;

    public Student(String fullName, Double points) {
        this.fullName = fullName;
        this.points = points;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public void rankedAcademic() {
        System.out.println("Ranked Academic");
    }
}
