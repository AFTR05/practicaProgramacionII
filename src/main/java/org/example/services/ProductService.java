package org.example.services;

import org.example.model.Product;

import java.util.ArrayList;

public interface ProductService {
    ArrayList<Product> initializeProducts();
    void sortBookCheep();
    void toysDiscount();
    void chepperBook();

    void expensivePerCategory();
}
