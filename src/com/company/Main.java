package com.company;

import com.company.purchase.bill;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY GENERAL STORE");
        System.out.println("CHOOSE A SERVICE");
        System.out.println("PRESS 1 TO ENTER STORE STORAGE");
        System.out.println("PRESS 2 FOR USER SERVICE");
        int option  = sc.nextInt();

        //while(true){
            if(option == 1){
                System.out.println("WELCOME TO STORE'S STORAGE");

            }else if(option == 2){

                System.out.println("WELCOME TO THE STORE");
                System.out.println("GENERATE YOUR BILL HERE");
                bill b =  new bill();
                b.bill();

            }
        //}
    }
}
