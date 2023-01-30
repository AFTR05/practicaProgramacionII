package org.example.services.impl;

import org.example.model.*;
import org.example.services.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {
    private ArrayList<Order> orders;

    @Override
    public ArrayList<Order> initializeOrders(ArrayList<Costumer> costumers, ArrayList<Product> products) {
        orders=new ArrayList<Order>();
        ArrayList<DetailProduct> detailsProducts1=new ArrayList<>();
        detailsProducts1.add(new DetailProduct(products.get(0),4));
        detailsProducts1.add(new DetailProduct(products.get(1),2));
        ArrayList<DetailProduct> detailsProducts2=new ArrayList<>();
        detailsProducts2.add(new DetailProduct(products.get(2),2));
        detailsProducts2.add(new DetailProduct(products.get(3),2));
        ArrayList<DetailProduct> detailsProducts3=new ArrayList<>();
        detailsProducts3.add(new DetailProduct(products.get(4),1));
        detailsProducts3.add(new DetailProduct(products.get(5),1));
        ArrayList<DetailProduct> detailsProducts4=new ArrayList<>();
        detailsProducts4.add(new DetailProduct(products.get(6),1));
        detailsProducts4.add(new DetailProduct(products.get(7),1));
        ArrayList<DetailProduct> detailsProducts5=new ArrayList<>();
        detailsProducts5.add(new DetailProduct(products.get(8),1));
        orders.add(new Order(651L,"Active",LocalDate.of(2021,2,1),LocalDate.of(2021,2,2),detailsProducts1,costumers.get(2)));
        orders.add(new Order(651L,"Active",LocalDate.of(2021,2,2),LocalDate.of(2021,2,3),detailsProducts1,costumers.get(2)));
        orders.add(new Order(751L,"Active",LocalDate.of(2021,8,23),LocalDate.of(2021,8,24),detailsProducts2,costumers.get(3)));
        orders.add(new Order(152L,"Active",LocalDate.of(2021,2,5),LocalDate.of(2021,2,6),detailsProducts3,costumers.get(4)));
        orders.add(new Order(794L,"Active",LocalDate.of(2021,3,3),LocalDate.of(2021,3,3),detailsProducts4,costumers.get(6)));
        orders.add(new Order(894L,"Active",LocalDate.of(2021,3,3),LocalDate.of(2021,3,4),detailsProducts5,costumers.get(7)));
        return orders;
    }

    @Override
    public void sortJustBaby() {
        //la funcionalidad es para organizar pedidos con productos de baby se usa anyMatch para capturar aquellos que solo tengan algun producto
        //y allMatch para capturar aquellos que tengan todos baby category
        orders.stream().filter(x->x.getProducts().stream().allMatch(detailProduct -> detailProduct.getProduct().getCategory().equals(Category.BABY))).forEach(x-> System.out.println(x.getCostumer().getName()+" | "+x.getCostumer().getTier()+" | "+x.getProducts().get(0).getProduct().getName()+" | "+x.getProducts().get(0).getProduct().getCategory().getNameCategory()+" | "+x.getProducts().get(0).getAmount()+" | "+x.getOrderDate()+" | "+x.getDeliveryDate()));
    }

    @Override
    public void sortLevel2Order() {
        orders.stream().filter(x->x.getCostumer().getTier().equals(2)).filter(x->x.getOrderDate().isAfter(LocalDate.of(2021,1,31))).filter(x->x.getOrderDate().isBefore(LocalDate.of(2021,4,2)))
                .collect(Collectors.toList()).forEach(x-> System.out.println(x.getCostumer().getName()+" | "+x.getCostumer().getTier()+" | "+x.getProducts().get(0).getProduct().getName()+" | "+x.getProducts().get(0).getProduct().getCategory().getNameCategory()+" | "+x.getProducts().get(0).getAmount()+" | "+x.getOrderDate()+" | "+x.getDeliveryDate()));
    }

    @Override
    public void promByDate(){
        //calcula promedio de fecha especifica
        orders.stream().filter(x->x.getOrderDate().isEqual(LocalDate.of(2021,3,3))).forEach(x-> System.out.println(x.getTotalPrice()));
        System.out.println(orders.stream().filter(x->x.getOrderDate().isEqual(LocalDate.of(2021,3,3))).mapToDouble(Order::getTotalPrice).summaryStatistics().getAverage());
    }

    @Override
    public void sumByMonth(){
        orders.stream().filter(x-> x.getOrderDate().isAfter(LocalDate.of(2021,2,28)) && x.getOrderDate().isBefore(LocalDate.of(2021,4,1))).forEach(x-> System.out.println(x.getTotalPrice()));
        System.out.println(orders.stream().filter(x-> x.getOrderDate().isAfter(LocalDate.of(2021,2,28)) && x.getOrderDate().isBefore(LocalDate.of(2021,4,1))).mapToDouble(Order::getTotalPrice).summaryStatistics().getSum());
    }

    @Override
    public void recentOrder(){
        orders.stream().sorted(Comparator.comparing(Order::getOrderDate).reversed()).limit(3).forEach(x-> System.out.println(x.getOrderDate()));
    }

    @Override
    public void mapClientWithOrder(){
        System.out.println(orders.stream().collect(Collectors.groupingBy(Order::getCostumer)).toString());
    }
}
