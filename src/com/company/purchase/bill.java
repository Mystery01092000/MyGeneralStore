package com.company.purchase;

import java.util.ArrayList;
import java.util.Scanner;

public class bill {

    //In this class we will do the billing part
    //The items purchased will be added to a list and then the bill for those items is generated
    public int bill(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item number followed by Quantity to add to bucket");
        System.out.println("Press Y to add item");
        String item = sc.next();
        ArrayList<purchase> list = new ArrayList<>();
        int sno=1;
        while(item == "Y" || item == "y"){
            System.out.println("Enter item Number");
            long itemNumber = sc.nextLong();
            System.out.println("How much of this you want : ");
            int quantity = sc.nextInt();

            list.add(new purchase(sno,itemNumber,quantity));
            //Add a print statement that will tell what item is purchased and how much and total price

            System.out.println("Do you wanna add more item : (press y for yes and any key for no");
            item  = sc.next();
        }



        return 1;

    }
}
