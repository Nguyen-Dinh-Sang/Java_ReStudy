package com.sangnd.datatype_operator_conditional;

import java.util.Scanner;

public class DataTypeOperatorConditional {
    public static void main(String[] args) {
        System.out.println("Data type, operator, conditional");
        executeDemo();
    }

    private static void executeDemo() {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
    }

    private static void demo4() {
        System.out.println("Personal computer");

        System.out.println("+---------------------+");
        System.out.println("| 1: Summation        |");
        System.out.println("| 2: Minus            |");
        System.out.println("| 3: Exit             |");
        System.out.println("+---------------------+");

        System.out.println("");
        System.out.print("Enter the option: ");
        Scanner scanner = new Scanner(System.in);
        Integer option = scanner.nextInt();

        switch (option) {
            case 1:{
                System.out.println("Summation");
                break;
            }
            case 2: {
                System.out.println("Minus");
                break;
            }
            case 3: {
                System.out.println("Exit");
                break;
            }
            default:{
                System.out.println("Error");
                break;
            }
        }
    }

    private static void demo3() {
        System.out.println("Number of days in the month");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        Integer month = scanner.nextInt();
        System.out.print("Enter the year: ");
        Integer year = scanner.nextInt();

        Integer numberOfDaysInMonth = getNumberOfDaysInMonth(month, year);
        System.out.println("Number of days in the month: " + numberOfDaysInMonth);
    }

    private static Integer getNumberOfDaysInMonth(Integer month, Integer year) {
        Integer MONTH_31_DAYS = 31;
        Integer MONTH_30_DAYS = 30;
        Integer MONTH_28_DAYS = 28;
        Integer MONTH_29_DAYS = 29;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                return MONTH_31_DAYS;
            }
            case 2: {
                if (isLeapYear(year)) {
                    return MONTH_29_DAYS;
                } else {
                    return MONTH_28_DAYS;
                }
            }
            default: {
                return MONTH_30_DAYS;
            }
        }
    }

    private static Boolean isLeapYear(Integer year) {
        if (year % 400 == 0) {
            return true;
        }

        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }

        return false;
    }

    private static void demo2() {
        System.out.println("Personal income tax");

        System.out.print("Enter the personal income: ");
        Scanner scanner = new Scanner(System.in);
        Integer personalIncome = scanner.nextInt();

        Double personalIncomeTax = getPersonalIncomeTax(personalIncome);

        System.out.print("Personal income Tax: " + personalIncomeTax);
    }

    private static Double getPersonalIncomeTax(Integer personalIncome) {
        if (personalIncome < 9) {
            return 0.0;
        }

        if (personalIncome < 15) {
            return personalIncome * 0.1;
        }

        if (personalIncome < 30) {
            return personalIncome * 0.15;
        }

        return personalIncome * 0.2;
    }

    private static void demo1() {
        System.out.println("Demo 1");

        System.out.print("Enter the integer number: ");
        Scanner scanner = new Scanner(System.in);
        Integer integerNumber = scanner.nextInt();

        if (integerNumber > 0) {
            double squareRootOfIntegerNumber = Math.sqrt(integerNumber);
            System.out.println("Square root of integer number: " + squareRootOfIntegerNumber);
        } else {
            System.out.println("It is a negative number");
        }
    }
}
