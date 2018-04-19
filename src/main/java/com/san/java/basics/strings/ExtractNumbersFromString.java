package com.san.java.basics.strings;

public class ExtractNumbersFromString {

    public static void main(String[] args) {
        String str = "Santosh123Bandage789";
        String numbers = str.replaceAll("[^0-9]", "");
        System.out.println("Numbers are: " + numbers);
    }
}
//Output:
//123789