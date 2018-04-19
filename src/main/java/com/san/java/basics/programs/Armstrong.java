package com.san.java.basics.programs;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        int num, sum = 0, temp, r;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = scan.nextInt();
        temp = num;

        while (temp != 0) {

            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;

        }

        if (num == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number..");
        }

    }


}
