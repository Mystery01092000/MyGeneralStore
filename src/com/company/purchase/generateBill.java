package com.company.purchase;

import com.company.Admin.adminOptions;
import com.company.Product;

import java.util.ArrayList;

public class generateBill {
    //This function will fetch product name, price and call calculatePrice and generate a outBill
    ArrayList<OutputBillStructure> outputBill = new ArrayList<>();

    generateBill(ArrayList<purchase> cart){
        adminOptions store = new adminOptions();
        store.initializeStorage();
        ArrayList<Product> storage = store.getStorage();

        System.out.println("Generating Bill");

        for (purchase item : cart) {
            int sno = item.serialNumber;
            long itemNumber = item.itemNumber;
            int itemQuantity = item.quantity;
            Product chosenProduct = null;
            for (Product p : storage) {
                if (p.getItemNumber() == itemNumber) {
                    chosenProduct = p;
                    break;
                }
            }
            assert chosenProduct != null;
            double productPrice = chosenProduct.getProductPrice();
            String productName = chosenProduct.getProductName();
            calculatePrice cp = new calculatePrice();
            double totalCost = cp.priceTimesQuantity(productPrice, itemQuantity);
            OutputBillStructure temp = new OutputBillStructure(sno, itemNumber, productName, productPrice, itemQuantity, totalCost);
            outputBill.add(temp);
        }

    }
    void printBill(){
        for (OutputBillStructure item: outputBill
             ) {
            System.out.println(item.serialNumber +"  "+ item.itemNumber + "  "+item.itemName +"  "+ item.itemPrice +"  "+ item.quantity +"  "+ item.totalPrice);
        }
    }
}
