package com.san.java.basics.programs;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = scan.nextInt();

        if (i % 2 == 0) {

            System.out.println("Given number is Even");

        } else {

            System.out.println("Given number is Odd");

        }
    }
}
