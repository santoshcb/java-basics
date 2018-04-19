package com.san.java.basics.programs;

public class ArrayCommonElement {

    public static void main(String[] args) {

        int[] arr1 = {33, 40, 88, 10, 70, 78};
        int[] arr2 = {70, 10, 80, 50, 90, 12};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

}
