package com.san.java.basics.programs;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String original, reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to check Palindrome:");
        original = scan.next();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);

        }
        if (original.equals(reverse))
            System.out.println("It is Palindrome!!");
        else
            System.out.println("Not a palindrome!!");
    }

}
