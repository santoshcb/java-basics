package com.san.java.basics.collections;

import java.util.*;

public class List_Vector {

    public static void main(String[] args) {
        //Vector is indexed
        //Null allowed
        //Duplicates allowed
        //We can store any type of elements(int,double,float,String,character etc)
        //Stored in insertion order
        //We can retrieve elements using Index/for-each/Iterator/ListIterator/Enumeartion
        //Synchronized
        //Incase of multiple thread using Vector is faster than ArrayList
        //Vector increases its size everytime by doubling it
        Vector vct = new Vector();
        vct.add(21);
        vct.add(21);
        vct.add(43.6);
        vct.add("santu");
        vct.add(null);
        vct.add(null);
        vct.add('A');

        //Retrieve Vector elements using its index..
        System.out.println("Retrieve Vector elements using its index...");
        for (int i = 0; i < vct.size(); i++) {
            System.out.print(vct.get(i) + "\t");
        }
        System.out.println("");
        //Retrieve Vector elements using for-each loop
        System.out.println("Retrieve Vector elements using for-each...");
        for (Object obj : vct) {
            System.out.print(obj + "\t");
        }
        System.out.println("");

        //Retrieve Vector elements using iterator
        System.out.println("Retrieve Vector elements using Iterator...");
        Iterator itr = vct.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("");

        //Retrieve Vector elements using ListIterator
        System.out.println("Retrieve Vector elements using ListIterator ");
        ListIterator lit = vct.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + "\t");
        }
        System.out.println("");


//Retrieve Vector elements using Enumeration
        System.out.println("Retrieve Vector elements using Enumeration...");
        Enumeration ea = Collections.enumeration(vct);
        while (ea.hasMoreElements()) {
            System.out.print(ea.nextElement() + "\t");
        }
        System.out.println("");
    }

}
