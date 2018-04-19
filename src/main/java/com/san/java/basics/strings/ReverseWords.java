package com.san.java.basics.strings;

import java.util.StringTokenizer;

public class ReverseWords {
    public static void main(String[] args) {

        String input = "My name is Santosh";

        StringTokenizer st = new StringTokenizer(input, " ");

        // strReverseLine is the function used to reverse a string.
        String strReversedLine = "";
        try {
            while (st.hasMoreTokens()) {
                strReversedLine = st.nextToken() + " " + strReversedLine;
            }
            System.out.println("Reversed string by word is : " + strReversedLine);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//Output:
//Santosh is name My