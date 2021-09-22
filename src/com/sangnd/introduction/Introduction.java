package com.sangnd.introduction;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Introduction");
        executeDemo();
        executePractice();
    }

    private static void executePractice() {
//        practice1();
//        practice2();
//        practice3();
//        practice4();
    }

    private static void practice2() {
        System.out.println("Practice 2");

        Scanner scanner = new Scanner(System.in);
        Integer side1OfRectangle;
        Integer side2OfRectangle;

        System.out.print("Enter the edge 1 of rectangle: ");
        side1OfRectangle = scanner.nextInt();
        System.out.print("Enter the edge 2 of rectangle: ");
        side2OfRectangle = scanner.nextInt();

        Integer perimeter = (side1OfRectangle + side2OfRectangle) * 2;
        Integer area = side1OfRectangle * side2OfRectangle;
        Integer minValueOfBoth = Math.min(side1OfRectangle, side2OfRectangle);

        System.out.println("Rectangle perimeter: " + perimeter);
        System.out.println("Rectangle area: " + area);
        System.out.println("Min value of 2 sides of the rectangle: " + minValueOfBoth);
    }

    private static void practice3() {
        System.out.println("Practice 3");

        Scanner scanner = new Scanner(System.in);
        Integer cubeEdge;

        System.out.print("Enter the cube edge: ");
        cubeEdge = scanner.nextInt();

        Double volumeOfCube = Math.pow(cubeEdge, 3);

        System.out.println("Volume of cube: " + volumeOfCube);
    }

    private static void practice4() {
        System.out.println("Practice 4");

        Scanner scanner = new Scanner(System.in);
        Integer coefficientA;
        Integer coefficientB;
        Integer coefficientC;

        System.out.print("Enter the coefficient A: ");
        coefficientA = scanner.nextInt();
        System.out.print("Enter the coefficient B: ");
        coefficientB = scanner.nextInt();
        System.out.print("Enter the coefficient C: ");
        coefficientC = scanner.nextInt();

        Double delta = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        Double squareRootOfDelta = Math.sqrt(delta);

        System.out.println("Delta: " + delta);
        System.out.println("Square root of delta: " + squareRootOfDelta);
    }

    private static void practice1() {
        demo4();
    }

    private static void executeDemo() {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
    }

    private static void demo1() {
        System.out.println("Variable");

        Integer a = 10;
        Integer b = 20;
        Integer c = a + b;

        System.out.println(c);
    }

    private static void demo2() {
        System.out.println("Operator");

        Integer subjectsAScore = 5;
        Integer subjectsBScore = 8;
        Integer subjectsCScore = 9;

        Double GPA = (subjectsAScore * 2 + subjectsBScore + subjectsCScore) / 4.0;
        System.out.println("GPA: " + GPA);
    }

    private static void demo3() {
        System.out.println("Print");

        String fullName = "Nguyễn Đình Sang";
        Integer age = 23;

        System.out.print(fullName);
        System.out.printf(" năm nay %d ", age);
        System.out.println("tuổi");
    }

    private static void demo4() {
        System.out.println("Scanner");

        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        Integer age = scanner.nextInt();

        System.out.print(fullName);
        System.out.printf(" năm nay %d ", age);
        System.out.println("tuổi");
    }

    private static void demo5() {
        System.out.println("Math");

        Scanner scanner = new Scanner(System.in);

        Double randomNumberFrom5To12 = Math.random() * (12 - 5) + 5;
        Double squareRootOfRandomNumber = Math.sqrt(randomNumberFrom5To12);

        System.out.println("Random number from 5 to 12: " + randomNumberFrom5To12);
        System.out.println("Square root of random number from 5 to 12: " + squareRootOfRandomNumber);

        Double realNumber1 = scanner.nextDouble();
        Double realNumber2 = scanner.nextDouble();
        Double powerOfRealNumber1AndRealNumber2 = Math.pow(realNumber1, realNumber2);
        Double minValueOfRealNumber1AndRealNumber2 = Math.min(realNumber1, realNumber2);

        System.out.println("Power of real number 1 and real number 2: " + powerOfRealNumber1AndRealNumber2);
        System.out.println("Min value of real number 1 and real number 2: " + minValueOfRealNumber1AndRealNumber2);
    }
}
