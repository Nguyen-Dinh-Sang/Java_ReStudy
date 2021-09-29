package com.sangnd.array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoop {
    public static void main(String[] args) {
        System.out.println("Array and loop");
        executeDemo();
        executeTest();
    }

    private static void executeTest() {
        System.out.println("Test array");

        // Mảng số nguyên chưa biết số phần tử.
        int[] a;
        int b[];

        // Mảng chứa 5 chuổi.
        String[] c = new String[5];

        // Mảng có khởi tạo.
        double[] d1 = new double[]{1, 2, 3, 4, 5};
        double[] d2 = {1, 2, 3, 4, 5};
    }

    private static void executeDemo() {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        demo5();
    }

    private static void demo5() {
        System.out.println("Student array");

        String[] studentArray = enterStudentArray();
        Arrays.sort(studentArray);

        System.out.println("Student array: " + Arrays.toString(studentArray));
    }

    private static String[] enterStudentArray() {
        System.out.println("Enter array");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        Integer arrayLength = scanner.nextInt();

        String[] studentArray = new String[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("Enter student %d: ", index + 1);
            studentArray[index] = scanner.next();
        }

        return studentArray;
    }

    private static void demo4() {
        System.out.println("Integer array");

        int[] integerArray;
        integerArray = enterArray();

        Double averageOfIntegerArray = averageOfIntegerArray(integerArray);

        System.out.println("Average of integer array: " + averageOfIntegerArray);

        Integer EXPONENT = 3;
        exponentialOfIntegerArray(integerArray, EXPONENT);
    }

    private static void exponentialOfIntegerArray(int[] integerArray, int exponent) {
        System.out.println("Exponential of integer array");
        for (int integerNumber : integerArray) {
            System.out.printf("%d^%d = %f5", integerNumber, exponent, Math.pow(integerNumber, exponent));
            System.out.println("");
        }
    }

    private static Double averageOfIntegerArray(int[] integerArray) {
        Integer totalArray = 0;
        for (int integerNumber : integerArray) {
            totalArray += integerNumber;
        }

        Double averageOfIntegerArray = totalArray / integerArray.length * 1.0;

        return  averageOfIntegerArray;
    }

    private static int[] enterArray() {
        System.out.println("Enter array");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        Integer arrayLength = scanner.nextInt();

        int[] integerArray = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("Enter element %d: ", index + 1);
            integerArray[index] = scanner.nextInt();
        }

        return integerArray;
    }

    private static void demo3() {
        System.out.println("Multiplication table");

        for (int index = 1; index <= 10; index++) {
            System.out.println("7 * " + index + " = " + index * 7);
        }
    }

    private static void demo2() {
        System.out.println("Scores from 0 to 10");
        Integer minScores = 0;
        Integer maxScores = 10;

        Integer scores = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the scores: ");
            scores = scanner.nextInt();
        } while (scores >= minScores && scores <= maxScores);
    }

    private static void demo1() {
        multiplicationTable();
        averageNumbersDivisible3From27To250();
    }

    private static void averageNumbersDivisible3From27To250() {
        System.out.println("Average of numbers divisible by 3 from 27 to 250");

        Integer totalNumbersDivisible3 = 0;
        Integer countNumbersDivisible3 = 0;
        for (int index = 27; index <= 250; index++) {
            if (isDivisible3(index)) {
                totalNumbersDivisible3 += index;
                countNumbersDivisible3++;
            }
        }

        Double averageNumbersDivisible3From27To250 = average(totalNumbersDivisible3, countNumbersDivisible3);

        System.out.println("Average of numbers divisible by 3 from 27 to 250: " + averageNumbersDivisible3From27To250);
    }

    private static Double average(Integer total, Integer count) {
        if (count > 0) {
            return total / count * 1.0;
        } else {
            return 0.0;
        }
    }

    private static Boolean isDivisible3(Integer number) {
        if (number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void multiplicationTable() {
        System.out.println("Multiplication table");

        Integer index = 1;
        while (index <= 10) {
            System.out.printf("7 * %d = %d", index, index * 7);
            System.out.println("");
            index++;
        }
    }
}
