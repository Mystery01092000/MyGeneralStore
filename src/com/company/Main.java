package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product p = new Product(1,100000231,"Apple",23.23, 5);
        System.out.println(p.itemNumber);
        System.out.println(p.productName);
        System.out.println(p.productPrice);
    }
}
