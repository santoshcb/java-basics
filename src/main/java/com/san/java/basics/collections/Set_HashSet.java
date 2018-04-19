package com.san.java.basics.collections;

import java.util.*;

public class Set_HashSet {

    public static void main(String[] args) {
        //No duplicates, if we add duplicates no error but it will only prints non duplicates
        //only one null allowed
        //storage random
        //Retrieve elements only though for-each loop and iterator
        //Not possible to retrieve elements using Index,ListIterator and Enumeration

        HashSet hs = new HashSet();
        hs.add(56);
        hs.add(56);
        hs.add(32);
        hs.add(32);
        hs.add(12);
        hs.add(8);
        hs.add(null);
        hs.add(null);

        System.out.println("Using for-each loop");
        for (Object obj : hs) {
            System.out.print(obj + "\t");
        }
        System.out.println("");

        System.out.println("Using Iterator..");
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("");

//            System.out.println("Using ListIterator..");
//            ListIterator lit = hs.li
//            System.out.println("Using Enumeration");
//            Enumeartion ea = Collections.enumeration(hs);

    }

}
