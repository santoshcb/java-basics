package com.san.java.basics.common;

import java.io.*;
import java.util.*;

public class ReadProperties {

    public static void main(String[] args) throws Exception {

        Properties prop = new Properties();
        InputStream in = new FileInputStream("src\\test\\resources\\config.properties");
        prop.load(in);
        Set<Object> set = prop.keySet();

        System.out.println("Reading all key values from properties file \n");

        for (Object o : set) {
            String key = (String) o;
            System.out.println("KEY: " + key + " VALUE: " + prop.getProperty(key));
        }
    }
}
