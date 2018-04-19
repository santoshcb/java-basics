package com.san.java.basics.strings;

public class FirstLetterCapital {

    public static void main(String[] args) {

        String str = "my name is santosh";

        StringBuilder result = new StringBuilder(str.length());
        String words[] = str.split("\\ ");

        for (int i = 0; i < words.length; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");

        }
        System.out.println(result);
    }
}
//Output: My Name Is Santosh
