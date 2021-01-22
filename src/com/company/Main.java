package com.company;

import com.company.Admin.adminOptions;
import com.company.database.databaseMain;
import com.company.purchase.bill;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws SQLException {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================================================");
        System.out.println("\t\t\t\t\t\t WELCOME TO MY GENERAL STORE");
        System.out.println("===========================================================================================");

        databaseMain db = new databaseMain();

        while(true){
            System.out.println("\t\t\t\t\t\t CHOOSE A SERVICE");
            System.out.println("\t\t\t\t\t\t PRESS 1 TO ENTER STORE STORAGE");
            System.out.println("\t\t\t\t\t\t PRESS 2 FOR USER SERVICE");
            db.fetechStorage();
            int option  = sc.nextInt();
            switch (option){
                case 1: {
                    System.out.println("\t\t\t\t\t\tMOVING TO THE STORAGE SERVICE");
                    adminOptions a = new adminOptions();
                    a.adminEntry();
                    break;
                }

                case 2: {
                    System.out.println("\t\t\t\t\t\tBuying option is available");
                    bill b = new bill();
                    b.bill();
                    break;
                }

                default:
                    System.out.println("\t\t\t\t\t\tQuitting the services");
                    break;
            }
            if(option != 1 && option != 2){
                break;
            }
        }

        System.out.println("\t\t\t\t\t\tProcess Ended");
    }
}
