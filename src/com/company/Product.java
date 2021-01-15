package com.company;

public class Product {

    long itemNumber;
    String productName;
    double productPrice;
    int productQuantity;

    public Product(long itemNumber, String productName, double productPrice, int productQuantity){
        this.itemNumber = itemNumber;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    public void printProduct(){
        System.out.println(this.itemNumber+ "  "+this.productName + "  " + this.productPrice + "  " + this.productQuantity);
    }
}
