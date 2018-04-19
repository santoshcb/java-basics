package com.san.java.basics.collections;

import java.util.*;

public class Set_LinkedHashSet {

    public static void main(String[] args) {
        //No duplicates
        //One null allowed
        //Retrieves in Insertion order
        //Retrieve is not possible by ListIterator
        //It takes null but gives NullPointerException
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(12);
        lhs.add(12);
        lhs.add(8);
        lhs.add(45);
        lhs.add(16);
        lhs.add(null);
        lhs.add(null);
        System.out.println("Using for-each loop..");
        for (Object obj : lhs) {
            System.out.print(obj + "\t");
        }
        System.out.println("");

        System.out.println("Using Iterator..");
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("");

//        System.out.println("Using ListIterator..");
//        ListIterator lit = lhs.l

        System.out.println("Using Enumeration..");
        Enumeration ea = Collections.enumeration(lhs);
        while (ea.hasMoreElements()) {
            System.out.print(ea.nextElement() + "\t");
        }
        System.out.println("");
    }

}
