package com.testshop.testshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testshop.testshop.Model.Entity.Panier;
import com.testshop.testshop.Model.Entity.PanierItem;
import java.util.List;


public interface PanierRepo extends JpaRepository<Panier,Long>{
    
    // PanierItem findByPanier_id(Long panier_id);
    

    
} 
