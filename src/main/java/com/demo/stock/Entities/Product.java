package com.demo.stock.Entities;


import jakarta.persistence.*;

@Entity
@Table(name="stock")
public class Product {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="productcode")
    private String productCode;

    @Column(name="productname")
    private String productName;

    @Column(name="stockcount")
    private int productCount;

    public Product(int id, String productCode, String productName, int productCount) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.productCount = productCount;
    }

    public Product() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
