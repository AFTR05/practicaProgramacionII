package org.example.application;

import org.example.herencia.Examples;
import org.example.model.Category;
import org.example.model.Costumer;
import org.example.model.Order;
import org.example.model.Product;
import org.example.polimorfismo.Polimorfismo;
import org.example.services.CostumerService;
import org.example.services.impl.CostumerServiceImpl;
import org.example.services.impl.OrderServiceImpl;
import org.example.services.impl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CostumerServiceImpl costumerService=new CostumerServiceImpl();
        ProductServiceImpl productService=new ProductServiceImpl();
        OrderServiceImpl orderService=new OrderServiceImpl();
        ArrayList<Product> products=productService.initializeProducts();
        ArrayList<Costumer> costumers=costumerService.initializeCostumers();
        ArrayList<Order> orders=orderService.initializeOrders(costumers,products);
        productService.expensivePerCategory();

        Polimorfismo polimorfismo = new Polimorfismo();
        polimorfismo.test();


        Examples examplesPerson = new Examples();
        examplesPerson.addPeople();
    }
}