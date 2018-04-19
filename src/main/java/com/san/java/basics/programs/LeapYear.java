package com.san.java.basics.programs;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter the year:  ");
        Scanner scan = new Scanner(System.in);
        int yr = scan.nextInt();
        if (yr % 100 == 0) {
            if (yr % 400 == 0) {
                System.out.println("Given year is leap!!");
            } else {
                System.out.println("Not leap year");
            }
        } else {
            if (yr % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not leap year");
            }
        }
    }

}
