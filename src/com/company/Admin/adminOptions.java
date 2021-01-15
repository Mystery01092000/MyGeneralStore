package com.company.Admin;

import com.company.Main;
import com.company.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class adminOptions {
    ArrayList<Product> storage = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    public adminOptions(){
        System.out.println("WELCOME TO ADMIN PRIVILEGE ROOM , WHAT DO YOU WANNA DO");

//        addItemToStorage();
//        addItemToStorage();
//        addItemToStorage();
//        addItemToStorage();
//        addItemToStorage();addItemToStorage();
//        printStorageDetails();
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
                            Main m = new Main();
                            break;

               }
        }
    }

    private void addItemToStorage() {
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
        storage.add(item);
    }

    private void printStorageDetails() {
        for(int i = 0 ; i < storage.size(); i++ ){
            storage.get(i).printProduct();
        }
    }
}
