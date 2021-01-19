package com.company.Admin;

import com.company.Main;
import com.company.Product;
import com.company.database.databaseMain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class adminOptions {

    databaseMain db = new databaseMain();
    public static ArrayList<Product> storage = new ArrayList<>();
    //temporary function to intialize store with some products
//    public void initializeStorage(){
//        storage.add(new Product(1,"Soap",2332,1000));
//        storage.add(new Product(2,"Shampoo",1092,1000));
//        storage.add(new Product(3,"Biscuit",4221,1000));
//        storage.add(new Product(4,"Almond",234123,1000));
//        storage.add(new Product(5,"Bread",574,1000));
//    }

    Scanner sc = new Scanner(System.in);
    public void adminEntry() throws SQLException {
        System.out.println("WELCOME TO ADMIN PRIVILEGE ROOM , WHAT DO YOU WANNA DO");

        while(true){
            System.out.println("1. ADD ITEMS");
            System.out.println("2. CHECK ITEMS");
            int optionChosen = sc.nextInt();
            switch (optionChosen){

                case 1: addItemToStorage();
                    break;

                case 2: printStorageDetails();
                    break;

                default:
                    return;
            }
        }
    }
    private void addItemToStorage() throws SQLException {
        System.out.println("Add items to the storage");
        System.out.println("Enter item number");
        long itemNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter item name");
        String itemName = sc.nextLine();
        System.out.println("Enter the price of the item");
        double itemPrice = sc.nextDouble();
        System.out.println("Enter the quantity of item added into the storage");
        int itemQuantity = sc.nextInt();

        Product item = new Product(itemNumber, itemName, itemPrice, itemQuantity);
        db.insertItem(item);
        //storage.add(item);
    }

    private void printStorageDetails() {
        storage = db.getStorage();
        for(int i = 0 ; i < storage.size(); i++ ){
            storage.get(i).printProduct();
        }
        return;
    }

    public ArrayList<Product> getStorage(){
        return storage;
    }
}
