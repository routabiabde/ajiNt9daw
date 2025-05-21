package com.testshop.testshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testshop.testshop.Model.Entity.ElectronicProduct;

public interface ElectronicProductRepo extends JpaRepository<ElectronicProduct,Long>{
    
    
    
}
