package com.testshop.testshop.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testshop.testshop.Model.Entity.ClothingProduct;
import com.testshop.testshop.Repository.ClothingProductRepo;
import com.testshop.testshop.Service.ClothingProductService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/clothing-products")
public class ClothingProductController {

    @Autowired
    private ClothingProductRepo clothingProductRepo;

    @GetMapping("products")
    public List<ClothingProduct> getAllClothingProducts() {
        return clothingProductRepo.findAll();
    }
    @PostMapping("/save-all")
    public List<ClothingProduct> saveAllClothingProducts(@RequestBody List<ClothingProduct> clothingProducts) {
        return clothingProductRepo.saveAll(clothingProducts);
    }
    @PostMapping("save")
    public ClothingProduct saveClothingProduct(@RequestBody ClothingProduct clothingProduct) {
        return clothingProductRepo.save(clothingProduct);
    }
    @GetMapping("/add")
    public String showAddClothingProductForm() {
    return "addProduct"; // This corresponds to the Thymeleaf template name
}
}

    
