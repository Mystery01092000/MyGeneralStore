package com.company;

import com.company.Admin.adminOptions;
import com.company.purchase.bill;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY GENERAL STORE");


        while(true){
            System.out.println("CHOOSE A SERVICE");
            System.out.println("PRESS 1 TO ENTER STORE STORAGE");
            System.out.println("PRESS 2 FOR USER SERVICE");
            int option  = sc.nextInt();
            switch (option){
                case 1: {
                    System.out.println("MOVING TO THE STORAGE SERVICE");
                    adminOptions a = new adminOptions();
                }

                case 2: {

                }

                default:
                    System.out.println("Quitting the services");
                    break;
            }
        }
    }
}
