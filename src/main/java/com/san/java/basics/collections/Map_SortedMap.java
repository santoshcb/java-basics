package com.san.java.basics.collections;

import java.util.TreeMap;

public class Map_SortedMap {

    public static void main(String[] args) {
        //Key can not be null
        //duplicate values can be stored
        //values can be null
        //Stored in insertion order
        TreeMap tm = new TreeMap();
        tm.put(1, 12);
        tm.put(2, 12);
        tm.put(3, null);
        tm.put(4, null);
        tm.put(5, true);
        tm.put(6, 18);
        tm.put(7, 23);

        System.out.println(tm.values());
    }

}
