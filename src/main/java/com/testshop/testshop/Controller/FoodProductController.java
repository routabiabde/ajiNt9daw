package com.testshop.testshop.Controller;

import com.testshop.testshop.Model.Entity.FoodProduct;
import com.testshop.testshop.Service.FoodProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food-products")
public class FoodProductController {

    @Autowired
    private FoodProductService foodProductService;

    // Save a single FoodProduct
    @PostMapping("/save")
    public FoodProduct saveFoodProduct(@RequestBody FoodProduct foodProduct) {
        return foodProductService.saveFoodProduct(foodProduct);
    }

    // Save multiple FoodProducts
    @PostMapping("/save-all")
    public List<FoodProduct> saveAllFoodProducts(@RequestBody List<FoodProduct> foodProducts) {
        return foodProductService.saveAllFoodProducts(foodProducts);
    }
}