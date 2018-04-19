package com.san.java.basics.programs;

public class Swap2Numbers {

    public static void main(String[] args) {
        int x = 400;
        int y = 68;
        System.out.println("Numbers before Swapping:");
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        // Without using third variable
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:");
        System.out.println("x=" + x);
        System.out.println("y=" + y);


        //Using third variable
        System.out.println("Numbers after swapping:");
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }

}
