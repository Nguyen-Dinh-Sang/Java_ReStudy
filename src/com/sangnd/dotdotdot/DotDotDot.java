package com.sangnd.dotdotdot;

public class DotDotDot {
    public static void main(String[] args) {
        System.out.println("Dot dot dot");

        Integer[] integerArray = new Integer[3];
        integerArray[0] = 1;
        integerArray[1] = 1;
        integerArray[2] = 1;

        System.out.println("Total array 1: " + totalArray(integerArray));

        System.out.println("Total array 2: " + totalArray2(1, 2, 3, 4, 5));
    }

    private static Integer totalArray(Integer[] integerArray) {
        Integer totalArray = 0;

        for (Integer integerNumber : integerArray) {
            totalArray += integerNumber;
        }

        return totalArray;
    }

    private static Integer totalArray2(Integer... integerArray) {
        Integer totalArray = 0;

        for (Integer integerNumber : integerArray) {
            totalArray += integerNumber;
        }

        return totalArray;
    }
}
