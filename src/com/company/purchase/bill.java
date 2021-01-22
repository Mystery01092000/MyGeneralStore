package com.company.purchase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class bill {

    public ArrayList<purchase> cart = new ArrayList<>();
    //In this class we will do the billing part
    //The items purchased will be added to a list and then the bill for those items is generated
    public void bill() throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================================================");
        System.out.println("\t\t\t\t\t\tContinue adding items to your cart");
        System.out.println("===========================================================================================");
        int option;
        int serialNumber=0;
        while(true){
            System.out.println("\t\t\t\t\t\tPress 1 to add item to your cart");
            option = sc.nextInt();
            if(option == 1){
                serialNumber++;
                System.out.println("\t\t\t\t\t\tEnter the item number of product");
                long itemNumber = sc.nextLong();
                System.out.println("\t\t\t\t\t\tEnter the quantity");
                int qty = sc.nextInt();
                purchase item = new purchase(serialNumber, itemNumber, qty);
                cart.add(item);
            } else{
                break;
            }
        }
        generateBill currentBill = new generateBill(cart);

        currentBill.printBill();
        currentBill.printTotalPayable();
        return;
    }
//    public static void main(String[] args)
//    {
//        bill b =  new bill();
//        b.bill();
//    }
}
