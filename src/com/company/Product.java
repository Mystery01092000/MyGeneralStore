package com.company;

public class Product {

    int serialNumber;
    long itemNumber;
    String productName;
    double productPrice;
    int productQuantity;

    Product(int serialNumber, long itemNumber, String productName, double productPrice, int productQuantity){
        this.serialNumber = serialNumber;
        this.itemNumber = itemNumber;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }


}
