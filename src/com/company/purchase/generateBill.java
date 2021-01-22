package com.company.purchase;

import com.company.Admin.adminOptions;
import com.company.Product;
import com.company.database.databaseMain;

import java.sql.SQLException;
import java.util.ArrayList;

public class generateBill {
    //This function will fetch product name, price and call calculatePrice and generate a outBill
    ArrayList<OutputBillStructure> outputBill = new ArrayList<>();

    generateBill(ArrayList<purchase> cart) throws SQLException {
        adminOptions store = new adminOptions();
//        store.initializeStorage();
        databaseMain db = new databaseMain();
        db.fetechStorage();
        ArrayList<Product> storage = db.getStorage();
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
            if(chosenProduct == null){
                continue;
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
        for (OutputBillStructure item: outputBill) {
            System.out.println(item.serialNumber +"  "+ item.itemNumber + "  "+item.itemName +"  "+ item.itemPrice +"  "+ item.quantity +"  "+ item.totalPrice);
        }
    }
    void printTotalPayable(){
        double sum=0.0;
        for (OutputBillStructure item: outputBill) {
            sum += item.totalPrice;
        }
        System.out.println("\t\t\t\t\t\t The total amount to be paid is :  " + sum);
    }
}
