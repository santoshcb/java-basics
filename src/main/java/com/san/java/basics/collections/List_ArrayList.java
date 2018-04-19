package com.san.java.basics.collections;

import java.util.*;

public class List_ArrayList {

    public static void main(String[] args) {
        //ArrayList is indexed
        //We can store any type of elements(int,float,double,String etc..)
        //Duplicates allowed
        //Null allowed
        //Stored in inserion order
        //Retrieved using its Index/for-eachloop/Iterator/ListIterator/Enumeration
        //Not Synchronized
        //Incase of single thread using ArrayList is faster than Vector
        //ArrayList increases its size everytime by 50%(half)

        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(10);
        arr.add(36);
        arr.add(23.4);
        arr.add(null);
        arr.add(null);
        arr.add("santosh");
        arr.add('A');

        //Retrieve ArrayList elements using index
        System.out.println("0th index:" + arr.get(0));
        System.out.println("Retrieve ArrayList elements using its Index..");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " \t ");
        }
        System.out.println("");
        //Retrieve elements Using for-each loop
        System.out.println("Retriving ArrayList elements using for each loop...");
        for (Object obj : arr) {
            System.out.print(obj + " \t ");
        }
        System.out.println("");
        //Retrieve elements using Iterator
        System.out.println("Retrieve ArrayList elements using Iterator...");
        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " \t ");
        }

        //Retrieve ArrayList elements using List Iterator
        System.out.println("");
        System.out.println("Retrieve ArrayList elements using ListIterator...");
        ListIterator lit = arr.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " \t ");
        }
        System.out.println("");

//        Retrieve ArrayList elements using Enumeration
        System.out.println("Retrieve ArrayList elements using Enumeration..");
        Enumeration ea = Collections.enumeration(arr);
        while (ea.hasMoreElements()) {
            System.out.print(ea.nextElement() + " \t ");
        }
        System.out.println("");
    }

}
