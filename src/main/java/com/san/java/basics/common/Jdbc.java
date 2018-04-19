package com.san.java.basics.common;

import java.sql.*;

public class Jdbc {

//    static {
//        //STEP 1 : Registering The Driver Class
//
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Unable To Load The class");
//        }
//    }
//
//    public static void main(String[] args) {
//        Connection con = null;
//
//        Statement stmt = null;
//
//        ResultSet rs = null;
//
//        try {
//            String URL = "jdbc:oracle:thin:@localhost:1521:XE";
//
//            String username = "username";
//
//            String password = "password";
//
//            //STEP 2 : Creating The Connection Object
//
//            con = DriverManager.getConnection(URL, username, password);
//
//            //STEP 3 : Creating The Statement Object
//
//            stmt = con.createStatement();
//
//            String sql = "select * from AnyTable";
//
//            //Step 4 : Executing The Queries
//
//            rs = stmt.executeQuery(sql);
//
//            while (rs.next()) {
//                //Process the records here
//            }
//        } catch (SQLException e) {
//            System.out.println("SQLException Occurred");
//        } finally {
//            //STEP 5 : Closing The DB Resources
//
//            try {
//                if (rs != null) {
//                    rs.close();
//                    rs = null;
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (stmt != null) {
//                    stmt.close();
//                    stmt = null;
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (con != null) {
//                    con.close();
//                    con = null;
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void main(String[] args) throws Exception {

        String URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "username";
        String password = "password";
        String query = "SELECT * FROM ANY_TABLE";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //STEP 1 : Registering The Driver Class
        Class.forName("oracle.jdbc.driver.OracleDriver");
        try {

            //STEP 2 : Creating The Connection Object
            con = DriverManager.getConnection(URL, username, password);

            //STEP 3 : Creating The Statement Object
            stmt = con.createStatement();

            //Step 4 : Executing The Queries
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                //Process the records here
            }
        } catch (SQLException e) {
            System.out.println("SQLException Occurred");
        } finally {
            //STEP 5 : Closing The DB Resources
            if (con != null) {
                con.close();
            }

        }
    }
}
