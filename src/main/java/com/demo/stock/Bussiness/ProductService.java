package com.demo.stock.Bussiness;

import com.demo.stock.DataAccess.IProductDal;
import com.demo.stock.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService implements IProductService{

    private IProductDal iProductDal;

    @Autowired
    public ProductService(IProductDal iProductDal) {
        this.iProductDal = iProductDal;
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        return this.iProductDal.getAll();
    }

    @Override
    @Transactional
    public void add(Product product) {
        this.iProductDal.add(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        this.iProductDal.delete(product);
    }

    @Override
    @Transactional
    public void update(Product product) {
        this.iProductDal.update(product);
    }

    @Override
    @Transactional
    public Product getById(int id) {
        return this.iProductDal.getById(id);
    }
}
