package com.demo.stock.Bussiness;

import com.demo.stock.Entities.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAll();
    void add(Product product);
    void delete(Product product);
    void update(Product product);

    Product getById(int id);

}
