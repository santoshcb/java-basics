package com.san.java.basics.collections;

import java.util.*;

public class Queue_PriorityQueue {

    public static void main(String[] args) {
        //In PriorityQueue null are allowed, if we add null values no compilation error but we get NullPointerExc at runtime
        //Duplicates allowed
        //Null not allowed
        //Storage random
        //Retrieved using FIFO order
        //peek() retrieves Head element
        //poll() retrieves Head element and removes it
        //We can not add an element in between

        PriorityQueue pq = new PriorityQueue();
        pq.add(67);
        pq.add(67);
        pq.add(32);
        pq.add(45);
        pq.add(8);
//        pq.add(null); not allowed
        System.out.println("Head element is retrieved:" + pq.peek());

        //Retrieve PriorityQueue element using for-each loop
        System.out.println("Retrieve PriorityQueue element using for-each loop...");
        for (Object obj : pq) {
            System.out.print(obj + "\t");
        }
        System.out.println("");

        //Retrieve PriorityQueue elemet using Iterator
        System.out.println("Retrieve PriorityQueue element using Iterator...");
        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("");

        //Retrieve PriorityQueue elements using ListIterator
//        System.out.println("Retrieve PriorityQueue elements using ListIterator");
//        ListIterator lit = pq.

        System.out.println("Using Enumeration..");
        Enumeration ea = Collections.enumeration(pq);
        while (ea.hasMoreElements()) {
            System.out.print(ea.nextElement() + "\t");
        }
    }

}
