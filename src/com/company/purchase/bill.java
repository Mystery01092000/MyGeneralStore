package com.company.purchase;

import java.util.ArrayList;
import java.util.Scanner;

public class bill {

    public ArrayList<purchase> cart = new ArrayList<>();
    //In this class we will do the billing part
    //The items purchased will be added to a list and then the bill for those items is generated
    public void bill(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Continue adding items to your cart");
        int option;
        int serialNumber=0;
        while(true){
            System.out.println("Press 1 to add item to your cart");
            option = sc.nextInt();
            if(option == 1){
                serialNumber++;
                System.out.println("Enter the item number of product");
                long itemNumber = sc.nextLong();
                System.out.println("Enter the quantity");
                int qty = sc.nextInt();
                purchase item = new purchase(serialNumber, itemNumber, qty);
                cart.add(item);
            } else{
                break;
            }
        }
        generateBill currentBill = new generateBill(cart);

        currentBill.printBill();
        return;
    }
    public static void main(String[] args)
    {
        bill b =  new bill();
        b.bill();
    }
}
