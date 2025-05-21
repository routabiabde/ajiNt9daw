package com.testshop.testshop.Repository;

import com.testshop.testshop.Model.Entity.FoodProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodProductRepo extends JpaRepository<FoodProduct, Long> {
    // JpaRepository already provides save() and saveAll() methods
}