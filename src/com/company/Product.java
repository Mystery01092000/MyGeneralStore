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
        System.out.printf("%-20.20s %-20.20s %-20.20s %-20.20s%n" ,this.itemNumber,this.productName , this.productPrice ,this.productQuantity);
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
