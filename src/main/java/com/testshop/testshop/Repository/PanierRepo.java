package com.testshop.testshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testshop.testshop.Model.Entity.Panier;
import com.testshop.testshop.Model.Entity.Client;
import com.testshop.testshop.Model.Entity.PanierItem;


import java.util.List;
import java.util.Optional;


public interface PanierRepo extends JpaRepository<Panier,Long>{

    // Optional<Client> findByClient(com.testshop.testshop.Model.Entity.Client client);

    // Optional<com.testshop.testshop.Model.Entity.Panier> findByClientIdOptional(com.testshop.testshop.Model.Entity.Client client);
    Optional<Panier> findByClient(Client client);
    // PanierItem findByPanier_id(Long panier_id);
    

    
} 
