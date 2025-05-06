package com.testshop.testshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testshop.testshop.Model.Entity.ClothingProduct;
import com.testshop.testshop.Repository.ClothingProductRepo;

@Service
public class ClothingProductService {
    
    @Autowired
    public ClothingProductRepo clothingProductRepo;

    public List<ClothingProduct> getClothingProduct(){
        return clothingProductRepo.findAll();
    }

    public ClothingProduct savClothingProduct(ClothingProduct clothingProduct){
        return clothingProductRepo.save(clothingProduct);
    }
}
