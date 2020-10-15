package fr.i.demo1210.web.controller.web;

import java.util.ArrayList;
import java.util.List;

public class ProductImplDao implements ProductDao{


public static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(0,"tablette",120));
        products.add(new Product(1,"pc",1200));
        products.add(new Product(2,"souris",12));
        products.add(new Product(3,"clavier",20));
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int code){
        return products.get(code);
    }

    @Override
    public Product save(Product product){
        products.add(product);
        return product;
    }


}
