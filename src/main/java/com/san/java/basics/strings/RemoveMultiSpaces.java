package com.san.java.basics.strings;

import java.util.StringTokenizer;

public class RemoveMultiSpaces {

    public static void main(String a[]) {
        String input = "String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();
        while (st.hasMoreElements()) {
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
//Output
//String With Multiple Spaces
