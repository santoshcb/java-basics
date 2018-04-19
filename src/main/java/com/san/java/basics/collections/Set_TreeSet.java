package com.san.java.basics.collections;

import java.util.*;

public class Set_TreeSet {

    public static void main(String[] args) {
        //Doesn't allow null
        //No duplicates
        //Retrieves in Ascending order
        //We can retrieve elements through for-each, iterator, Enumeration
        //We cant retrieve elements through ListIterator
        TreeSet ts = new TreeSet();
        ts.add(8);
        ts.add(8);
        ts.add(16);
        ts.add(4);
        ts.add(20);
//        ts.add(null);

        System.out.println("Using for-each loop..");
        for (Object obj : ts) {
            System.out.print(obj + "\t");
        }
        System.out.println("");

        System.out.println("Using Iterator..");
        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("");

//        System.out.println("Using ListIterator...");
//        ListIterator lit = ts.l
        System.out.println("Using Enumeration..");
        Enumeration ea = Collections.enumeration(ts);
        while (ea.hasMoreElements()) {
            System.out.print(ea.nextElement() + "\t");
        }
        System.out.println("");
    }

}
