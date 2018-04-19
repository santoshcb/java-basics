package com.san.java.basics.collections;

import java.util.HashMap;

public class Map_HashMap {

    public static void main(String[] args) {
        //Stores objects in key-value pair
        //Values are retrieved using key
        //If we store duplicate values at same key then recently added value is stored
        //HashMap can have more than one null value
        //Stored in insertion order, if key is null then it gets higher priority than 1
        //It can contain only one null key and multiple null values
        //Incase of Single thread using HashMap is faster than HashTable
        //Not Synchronized
        HashMap hm = new HashMap();
        hm.put(1, 30);
        hm.put(1, 45);
        hm.put(1, 8);//We get recently added value
        hm.put(2, null);
        hm.put(3, null);
        hm.put(null, 32);
        hm.put(null, 46);
        hm.put(true, 56);
        hm.put("santu", null);
        System.out.println("Get at 1:" + hm.get(1));
        System.out.println("Get at 2:" + hm.get(2));
        System.out.println("Get at 3:" + hm.get(3));
        System.out.println("Get at null:" + hm.get(null));
        System.out.println("Get at true:" + hm.get(true));

        System.out.println("" + hm.values());
//        for(Object obj: hm)
        //for-each loop is not applicable in HashMap

//        System.out.println("Using iterator...");
//        Iterator itr = hm.i
        //Using iterator also not possible
//        ListIterator lit = hm.i
        System.out.println("Clone:" + hm.clone());
        //hm.clone returns key-value pair...
        for (Object obj : hm.values()) {
            System.out.println("Obj: " + obj);
        }
    }

}
