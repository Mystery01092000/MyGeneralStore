package com.company.database;

import java.sql.*;

public class databaseMain {
    public static void main(String[] args){
        try {
            //Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:/Users/pranavtomar/IdeaProjects/MyGeneralStore/storedata.db";
            String username = "root";
            String password = "toor";
            Connection conn = DriverManager.getConnection(url);

//            Statement stmt = conn.createStatement();
//
//
//            String strSelect = "select title, price, qty for product";
//            System.out.println("The sql state is : " + strSelect + "\n");
//
//            ResultSet rset = stmt.executeQuery(strSelect);
//            System.out.println("The records selected are :");
//            int rowCount = 0;
//            while (rset.next()) {
//                String title = rset.getString("title");
//                double price = rset.getDouble("price");
//            }
        } catch(SQLException ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
    }
}
