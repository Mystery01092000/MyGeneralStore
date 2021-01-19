package com.company.database;

import com.company.Product;

import java.sql.*;
import java.util.ArrayList;

public class databaseMain {

    private final String url = "jdbc:sqlite:/Users/pranavtomar/IdeaProjects/MyGeneralStore/storedata.db";
    public ArrayList<Product> storage = new ArrayList<>();

    public int insertItem(Product item) throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

        String insertSQL = "INSERT INTO storage VALUES (" +
                item.getItemNumber() +"," +
                "'"+item.getProductName()+"'"+"," +
                item.getProductPrice()+","+
                item.getProductQuantity() +
                ")";

        System.out.println(insertSQL);
        statement.executeUpdate(insertSQL);

        statement.close();
        conn.close();
        return 0;
    }

    public void fetechStorage() throws SQLException {
        storage.clear();
        Connection conn = DriverManager.getConnection(url);
        Statement statement = conn.createStatement();

        String getData = "SELECT * FROM storage";
        ResultSet result = statement.executeQuery(getData);
        int sno=1;
        System.out.println("Storage Printing");
        while(result.next()){
            long itemNumber = result.getLong("itemNumber");
            String itemName = result.getString("itemName");
            double itemPrice = result.getDouble("itemPrice");
            int itemQuantity = result.getInt("itemQuantity");
            //System.out.println(sno+"    " + itemNumber + "   " + itemName + "   "+ itemPrice + "   " + itemQuantity);
            storage.add(new Product(itemNumber, itemName, itemPrice, itemQuantity));
        }
        statement.close();
        conn.close();
    }

//    public static void main(String[] args){
//        try {
//            //Class.forName("org.sqlite.JDBC");
//            databaseMain db = new databaseMain();
//            String username = "root";
//            String password = "toor";
//            db.fetechStorage();
////            Connection conn = DriverManager.getConnection(db.url);
////
////            Statement stmt = conn.createStatement();
//
////            String createTable = "CREATE TABLE IF NOT EXISTS storage  (itemNumber int," +
////                    "itemName varchar(100)," +
////                    "itemPrice int," +
////                    "itemQuantity int)";
////
////            stmt.executeUpdate(createTable);
////
////            String insertData = "INSERT INTO storage VALUES(1,'Mountain Dew',40,20)";
////            stmt.executeUpdate(insertData);
////            insertData = "INSERT INTO storage VALUES(2,'Pepsi',35,30)";
////            stmt.executeUpdate(insertData);
////            insertData = "INSERT INTO storage VALUES(3,'AppyFizz',15,124)";
////            stmt.executeUpdate(insertData);
////            insertData = "INSERT INTO storage VALUES(4,'Limca',50,55)";
////            stmt.executeUpdate(insertData);
////            insertData = "INSERT INTO storage VALUES(5,'Coca Cola',90,80)";
////            stmt.executeUpdate(insertData);
////
////            stmt.close();
////            conn.close();
////
////
////            }
//        } catch(SQLException ex) {
//            System.out.println("Something went wrong  " + ex.getErrorCode());
//            ex.printStackTrace();
//        }
//        finally {
//            System.out.println("Database section completed");
//        }
//    }

    public ArrayList<Product> getStorage(){
        return storage;
    }

}
