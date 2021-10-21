package com.sangnd.string_regular_expression.demo;

import java.util.Scanner;

public class Demo {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
//        demo1();
//        demo2();
        demo3();
    }

    private void demo1() {
        System.out.println("Demo 1");

        String userName;
        String password;

        System.out.print("Enter user name: ");
        userName = scanner.nextLine();

        System.out.print("Enter password: ");
        password = scanner.nextLine();

        //equalsIgnoreCase compare zero case sensitive
        if (userName.equalsIgnoreCase("hello") && password.length() > 6) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    private void demo2() {
        System.out.println("Demo 2");

        String fullName;

        System.out.print("Enter full name: ");
        fullName = scanner.nextLine();

        Integer lastIndex = fullName.lastIndexOf(" ");
        String name = fullName.substring(lastIndex + 1);

        System.out.println("Name: " + name);
    }

    private void demo3() {
        System.out.println("Demo 3");

        String email;

        System.out.print("Enter email: ");
        email = scanner.nextLine();

        String regularExpressionEmail = "\\w+@\\w+\\.\\w+";

        if (email.matches(regularExpressionEmail)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
