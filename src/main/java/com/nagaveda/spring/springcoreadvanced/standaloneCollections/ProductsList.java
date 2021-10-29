package com.nagaveda.spring.springcoreadvanced.standaloneCollections;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductsList {
    private List productNames;

    public List getProductNames() {
        return productNames;
    }

    public void setProductNames(List productNames) {
        this.productNames = productNames;
    }

    @Override
    public String toString() {
        return "ProductsList [productNames=" + productNames + "]";
    }

}
