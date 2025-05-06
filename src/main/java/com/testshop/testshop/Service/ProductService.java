package com.testshop.testshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testshop.testshop.Model.Entity.Product;
import com.testshop.testshop.Repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }
}
