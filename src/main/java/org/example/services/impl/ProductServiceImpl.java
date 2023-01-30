package org.example.services.impl;

import org.example.model.Category;
import org.example.model.Product;
import org.example.services.ProductService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{
    private ArrayList<Product> products;

    @Override
    public ArrayList<Product> initializeProducts() {
        products=new ArrayList<Product>();
        products.add(new Product(875L,"Yoyo", Category.TOYS,200.0));
        products.add(new Product(871L,"Pillow",Category.BABY,300.0));
        products.add(new Product(123L,"Middlemarch",Category.BOOKS,195.0));
        products.add(new Product(521L,"El principito",Category.BOOKS,40.0));
        products.add(new Product(845L,"Hamlet",Category.BOOKS,61.0));
        products.add(new Product(456L,"Hot wheels",Category.TOYS,23.0));
        products.add(new Product(852L,"Lego",Category.TOYS,50.0));
        products.add(new Product(741L,"Hat",Category.BABY,80.0));
        products.add(new Product(861L,"Fiufiu",Category.BABY,12.0));
        return products;
    }

    @Override
    public void sortBookCheep() {
        products.stream().filter(x->x.getPrice()<100).filter(x->x.getCategory().equals(Category.BOOKS)).forEach(x-> System.out.println(x.getName()+" | "+x.getCategory().getNameCategory()+" | "+x.getPrice()));
    }

    @Override
    public void toysDiscount() {
        //peek sirve para modificar datos y dejar curso abierto
        System.out.println("10% discount in toys\n");
        ArrayList<Product> sisi=new ArrayList<>(products.stream().filter(x->x.getCategory().equals(Category.TOYS)).peek(x-> x.setPrice(x.getPrice()- x.getPrice()*0.1)).collect(Collectors.toList()));
        sisi.stream().forEach(x-> System.out.println(x.getPrice()));
    }

    @Override
    public void chepperBook() {
        products.stream().filter(x->x.getCategory().equals(Category.BOOKS)).filter(x->x.getPrice()<50).forEach(x-> System.out.println(x.getName()+" | "+x.getCategory().getNameCategory()+" | "+x.getPrice()));
    }

    @Override
    public void expensivePerCategory(){
        //se tomo el dato mayor xd
        Map<Category, Optional<Product>> maxi=products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))));
        for (Category i:maxi.keySet()){
            Double price=maxi.get(i).get().getPrice();
            System.out.println("Category "+i+ ","+ price);
        }
        /*System.out.println(products.stream().filter(x->x.getCategory().equals(Category.BOOKS)).max(Comparator.comparing(Product::getPrice)).get().getName());
        System.out.println(products.stream().filter(x->x.getCategory().equals(Category.BABY)).max(Comparator.comparing(Product::getPrice)).get().getName());
        System.out.println(products.stream().filter(x->x.getCategory().equals(Category.TOYS)).max(Comparator.comparing(Product::getPrice)).get().getName());
*/


    }
}
