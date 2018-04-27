package com.san.java.basics.programs;

public class CountVowels {

    public static void main(String args[]) {
        String input = "Bangalore";
        char[] letters = input.toCharArray();
        int count = 0;
        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
            }
        }
        System.out.println("Number of vowels in String [" + input + "] is : " + count);
    }
}
//Output: 4

