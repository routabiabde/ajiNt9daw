package com.testshop.testshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testshop.testshop.Model.Entity.ClothingProduct;
@Repository
public interface ClothingProductRepo extends JpaRepository<ClothingProduct,Long>{

    
}  
