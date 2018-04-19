package com.san.java.basics.programs;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Enter the number to find Factorial:");
        int i, n, prod = 1;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for (i = n; i >= 1; i--) {
            prod = prod * i;
        }
        System.out.println("Factorial is:" + prod);
    }
}
