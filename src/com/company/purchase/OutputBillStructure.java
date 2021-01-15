package com.company.purchase;

public class OutputBillStructure {
    //This class will contain the formal of output bill
    //That will contain, S.No., itemNumber, itemName, itemPrice, quantity, and price*quantity
    int serialNumber;
    long itemNumber;
    String itemName;
    double itemPrice;
    int quantity;
    double totalPrice;

    OutputBillStructure(int serialNumber, long itemNumber, String itemName, double itemPrice, int quantity, double totalPrice){
        this.serialNumber = serialNumber;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
}
