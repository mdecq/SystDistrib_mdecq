package fr.i.demo1210.web.controller.web;

import java.util.List;

public interface ProductDao {
    public List<Product> findAll();
    public Product findById(int code);
    public Product save(Product product);


}
