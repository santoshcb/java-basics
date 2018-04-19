package com.san.java.basics.programs;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0, b = 1, c;

        System.out.println("Fibonacci series is:");

        for (int i = 0; i <= 10; i++) {

            c = a + b;
            a = b;
            b = c;
            System.out.println(c);

        }
    }

}
