package com.san.java.basics.programs;

public class Sorting {

    public static void main(String[] args) {
        int temp;
        int[] a = {20, 4, 53, 2, 46, 1};
//        System.out.println("a[0]:"+a[0]);
//        System.out.println(a.length);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
            System.out.print(",");
        }

    }

}
