package com.testshop.testshop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.testshop.testshop.Model.Entity.ClothingProduct;
import com.testshop.testshop.Model.Entity.ElectronicProduct;
import com.testshop.testshop.Repository.ElectronicProductRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/electronic-products")
public class ElectrincProductController {
 
    @Autowired
    private ElectronicProductRepo electronicProductRepo;

    @PostMapping("/save-all")
    public List<ElectronicProduct> SaveAllElectronicProducts(@RequestBody List<ElectronicProduct> electronicProducts) {
        return electronicProductRepo.saveAll(electronicProducts);
    }

    @PostMapping("save")
    public ElectronicProduct SaveElectronicProduct(@RequestBody ElectronicProduct electronicProduct) {
        return electronicProductRepo.save(electronicProduct);
    }
  
}