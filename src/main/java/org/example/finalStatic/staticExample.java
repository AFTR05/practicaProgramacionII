package org.example.finalStatic;

import javax.swing.*;

public class staticExample {
    //Static Variable and Method (aka class Variable and class Method)
    //Variable => common property of all objects (it gets memory only once in the class area)
    String prodName;
    Double prodPrice;
    static String shop;

    //Constructor
    public staticExample(String prodName, Double prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    /*Method => Belongs to the class rather than the object of it,
         can be invoked without creating an instance of a class,
         can access static data and change its value,
         can't use non-static data member or call non-static method directly,
         this and supper aren't allowed
     */
    static void changeShop(String Shop){
        shop = Shop;
        JOptionPane.showMessageDialog(null, "The new shop name is: "+shop);
    }
    //Static Block (It's executed before the main method while classloading)
    static{
        shop="my shop";
        System.out.println("The shop is initialized "+shop);
    }

    //Static Class (only for nested classes)

}