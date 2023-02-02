package org.example.referenceAnotations.references;

import org.example.model.Order;
import org.example.model.Product;
import org.example.services.OrderService;
import org.example.services.impl.OrderServiceImpl;
import org.example.services.impl.ProductServiceImpl;

import java.util.ArrayList;

public class References {


    public static void main(String[] args) {
        ProductServiceImpl productService=new ProductServiceImpl();
        ArrayList<Product> products=new ArrayList<>(productService.initializeProducts());
        References references=new References();
        references.referenceWithInterface();

    }

    public static void staticFunction(Product product){
        System.out.println(product.getId());
    }

    public void refenceStatic(ArrayList<Product> products){ //esta funcion llama a la funcion estatica de la clase por medio de referencia
        products.forEach(References::staticFunction);
    }

    public void referenceFunction(ArrayList<Product> products){ //llama a por referencia a un metodo de clase
        products.stream().map(Product::getName).forEach(System.out::println);
    }

    public void referenceArbitraryMethod(){ // llama por referencia a un metodo de clase arbitriario (Metodos diferentes a constructor o get y set)
        ArrayList<Cosa> cosas=new ArrayList<>();
        cosas.add(new Cosa("Empanada"));
        cosas.add(new Cosa("Sal"));
        cosas.stream().forEach(Cosa::printName);
    }

    public void referenceWithInterface(){ //llama por referencia a un constructor de una interface
        Interface inter=Cosa::new;
        Cosa pala=inter.createObject("Pala");
        System.out.println(pala.getName());

    }


}
