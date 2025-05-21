package com.testshop.testshop.Service;

import com.testshop.testshop.Model.Entity.FoodProduct;
import com.testshop.testshop.Repository.FoodProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodProductService {

    @Autowired
    private FoodProductRepo foodProductRepo;

    // Save a single FoodProduct
    public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
        return foodProductRepo.save(foodProduct);
    }

    // Save multiple FoodProducts
    public List<FoodProduct> saveAllFoodProducts(List<FoodProduct> foodProducts) {
        return foodProductRepo.saveAll(foodProducts);
    }
}