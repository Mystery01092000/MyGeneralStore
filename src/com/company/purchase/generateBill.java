package com.company.purchase;

import com.company.Admin.adminOptions;
import com.company.Product;

import java.util.ArrayList;

public class generateBill {
    //This function will fetch product name, price and call calculatePrice and generate a outBill
    ArrayList<OutputBillStructure> outputBill = new ArrayList<>();

    generateBill(ArrayList<purchase> cart){
        adminOptions store = new adminOptions();
        ArrayList<Product> storage = store.getStorage();

        int sizeOfStorage = storage.size();

        System.out.println("Generating Bill");

        int sizeOfOrder = cart.size();
        for(int cartItem = 0 ; cartItem < sizeOfOrder ; cartItem++ ){
            purchase item = cart.get(cartItem);
            int sno = item.serialNumber;
            long itemNumber = item.itemNumber;
            int itemQuantity = item.quantity;
            Product chosenProduct = null;
            for(int storageItem = 0; storageItem < sizeOfStorage ; storageItem++ ){
                Product p = storage.get(storageItem);
                if(p.getItemNumber() == itemNumber){
                    chosenProduct = p;
                    break;
                }
            }
            double productPrice = chosenProduct.getProductPrice();
            String productName = chosenProduct.getProductName();
            calculatePrice cp = new calculatePrice();
            double totalCost = cp.priceTimesQuantity(productPrice, itemQuantity);
            OutputBillStructure temp = new OutputBillStructure(sno, itemNumber, productName, productPrice,itemQuantity,totalCost);
            outputBill.add(temp);
        }
    }
}
