package com.testshop.testshop.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testshop.testshop.Model.Entity.Panier;
import com.testshop.testshop.Model.Entity.PanierItem;
import com.testshop.testshop.Repository.PanierRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path = "panier")
public class PanierControoller {
    
    @Autowired
    private PanierRepo panierRepo;

    @GetMapping("")
    public List<Panier> getMethodName(@RequestParam(required = false) String param) {
        return  panierRepo.findAll();
    }
    
}
