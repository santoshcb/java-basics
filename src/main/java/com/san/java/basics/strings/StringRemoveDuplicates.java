package com.san.java.basics.strings;

import java.util.*;

public class StringRemoveDuplicates {

    public static void main(String[] args) {

        String str = "preetse preetse kannu muchi nanna preetse";
        String res[] = str.split(" ");
        System.out.println("Number of words: " + res.length);


        //Removing duplicates using HashSet
        //It removes duplicates and prints in random
        HashSet hs = new HashSet();
        for (Object obj : res) {
            hs.add(obj);
        }
        System.out.println("Using HashSet");
        System.out.println(hs);


        //Remove duplicates using TreeSet
        //It removes the duplicates and prints in sorted order
        TreeSet ts = new TreeSet();
        for (Object obj : res) {
            ts.add(obj);
        }
        System.out.println("Using TreeSet..");
        System.out.println(ts);

        //Using LinkedHashSet
        //Removes duplicates and prints as it is, doesnot sort
        LinkedHashSet lhs = new LinkedHashSet();
        for (Object obj : res) {
            lhs.add(obj);
        }
        System.out.println("Using LinkedHashSet..");
        System.out.println(lhs);

        //HashMap
        HashMap hm = new HashMap();
        for (Object obj : res) {
            hm.put("santu", obj);
//            hm.put("santu", obj);
        }
        System.out.println("HashMap: " + hm.get("santu"));
//        System.out.println("HashMap: "+hm.get("santu"));
        System.out.println("Using HashMap");
        System.out.println(hm);
    }

}
