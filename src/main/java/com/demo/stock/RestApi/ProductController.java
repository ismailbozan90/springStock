package com.demo.stock.RestApi;


import com.demo.stock.Bussiness.IProductService;
import com.demo.stock.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    IProductService iProductService;


    @Autowired
    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }


    @GetMapping("/products")
    public List<Product> get() {
        System.out.println("GELDİ");
        return iProductService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Product product) {
        iProductService.add(product);
    }

    @PostMapping("/update")
    public void update(@RequestBody Product product) {
        iProductService.update(product);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Product product) {
        iProductService.delete(product);
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable int id){
        return iProductService.getById(id);
    }

}
