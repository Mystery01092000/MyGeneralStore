package com.company.purchase;

import java.util.Scanner;

public class bill {
    public int bill(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item number followed by Quantity to add to bucket");
        System.out.println("Press Y to add item");
        String item = sc.next();

        while(item == "Y" || item == "y"){
            System.out.println("Enter item Number");
            long itemNumber = sc.nextLong();
            System.out.println("How much of this you want : ");
            int quantity = sc.nextInt();


        }
        return 1;

    }
}
