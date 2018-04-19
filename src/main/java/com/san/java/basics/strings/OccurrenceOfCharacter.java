package com.san.java.basics.strings;

import java.io.IOException;

public class OccurrenceOfCharacter {

    public static void main(String[] args) throws IOException {
        // create object of the string.
        String input = "Preetse Preetse";
        int count = 0, len = 0;
        do {
            try {
                // this loop will identify character and find how many times it occurs.
                char name[] = input.toCharArray();
                len = name.length;
                count = 0;
                for (int j = 0; j < len; j++) {
                    // use ASCII codes for searching.
                    if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
                        count++;
                }
                if (count != 0) {
                    // print all the repeated characters.
                    System.out.println(name[0] + " " + count);
                }
                input = input.replace("" + name[0], "");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        while (len != 1);
    }
}
//Output
//P 2
//r 2
//e 6
//t 2
//s 2
