package com.san.java.basics.collections;

import java.util.Hashtable;

public class Map_HashTable {

    public static void main(String[] args) {
        //Synchronized
        //Can not contain any null key or null values, if we store any null key or null value then it gives NullPointerException
        //Incase of Multiple thread using HashTable is faster
        Hashtable ht = new Hashtable();
        ht.put(1, 10);
        ht.put(2, 10);
        ht.put(3, 23);
        ht.put(4, 4);
        ht.put(5, 30);
        ht.put(6, 18);
        ht.put(7, 6);
        System.out.println("Get all values using clone():" + ht.clone());
        System.out.println("Get all values:" + ht.values());
        for (Object k : ht.values()) {
            System.out.println("k: " + k);
        }

    }

}
