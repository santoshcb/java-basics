package com.san.java.basics.strings;

public class ReverseEachWord {

    public static void main(String[] args) {

        String input = "My name is Santosh";

        String[] strarray = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s:strarray){
            if(!s.equals("")){
                StringBuilder strB = new StringBuilder(s);
                String rev = strB.reverse().toString();
                sb.append(rev+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
//Output:
//yM eman si hsotnaS
