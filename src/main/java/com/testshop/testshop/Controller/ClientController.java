package com.testshop.testshop.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testshop.testshop.Model.Entity.Product;
import com.testshop.testshop.Service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "client")
public class ClientController {
     @Autowired
     private  ProductService productService;

     
    @GetMapping("")
    public  List<Product> getMethodName(@RequestParam(required = false) String param) {
        return productService.getProducts();
    }
    
}