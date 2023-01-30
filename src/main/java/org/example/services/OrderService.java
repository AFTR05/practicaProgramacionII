package org.example.services;

import org.example.model.Costumer;
import org.example.model.Order;
import org.example.model.Product;

import java.util.ArrayList;

public interface OrderService {
    ArrayList<Order> initializeOrders(ArrayList<Costumer> costumers, ArrayList<Product> products);
    void sortJustBaby();
    void sortLevel2Order();

    void promByDate();

    void sumByMonth();

    void recentOrder();

    void mapClientWithOrder();
}
