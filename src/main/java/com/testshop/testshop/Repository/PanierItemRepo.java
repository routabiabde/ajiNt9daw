package com.testshop.testshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testshop.testshop.Model.Entity.PanierItem;

public interface PanierItemRepo  extends JpaRepository<PanierItem,Long>{
    
}
