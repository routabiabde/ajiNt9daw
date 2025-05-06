package com.testshop.testshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testshop.testshop.Model.Entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    
} 
