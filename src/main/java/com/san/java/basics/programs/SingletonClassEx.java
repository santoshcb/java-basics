package com.san.java.basics.programs;

public class SingletonClassEx {

    private static SingletonClassEx myObj;

    static {
        myObj = new SingletonClassEx();
    }

    private SingletonClassEx() {

    }

    public static SingletonClassEx getInstance() {
        return myObj;
    }

    public void testMe() {
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]) {
        SingletonClassEx ms = getInstance();
        ms.testMe();
    }
}
//Output
//Hey.... it is working!!!