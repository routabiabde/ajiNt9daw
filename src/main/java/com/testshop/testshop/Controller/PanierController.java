package com.testshop.testshop.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testshop.testshop.Model.Entity.Client;
import com.testshop.testshop.Model.Entity.Panier;
import com.testshop.testshop.Model.Entity.PanierItem;
import com.testshop.testshop.Model.Entity.Product;
import com.testshop.testshop.Repository.PanierItemRepo;
import com.testshop.testshop.Repository.PanierRepo;
import com.testshop.testshop.Repository.ProductRepo;
import com.testshop.testshop.Repository.clientRepo;
import com.testshop.testshop.Service.PanierService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/panier")
public class PanierController {

    @Autowired
    private PanierRepo panierRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private PanierItemRepo panierItemRepo;

    @Autowired
    private clientRepo clientReop;

    @PostMapping("/add-to-panier")
    public Panier addToPanier( @RequestParam Long productId, @RequestParam int quantite) {
         // Normally, you would retrieve the logged-in user's client like this:
        // String username = SecurityContextHolder.getContext().getAuthentication().getName();
        // Client client = clientReop.findByUsername(username)
        //         .orElseThrow(() -> new RuntimeException("Client not found"));

        // For now, we are selecting the client with id = 1
        Client client = (Client) clientReop.findById(1L)
                .orElseThrow(() -> new RuntimeException("Client not found"));

        // Check if the Client has an existing Panier
        
        Optional<Panier> optionalPanier = panierRepo.findByClient(client);
        Panier panier = optionalPanier.orElse(null);

        // If the Panier does not exist, create a new one
        if (panier == null) {
            panier = new Panier();
            panier.setClient((com.testshop.testshop.Model.Entity.Client) client);
            panier.setItems(new ArrayList<>()); // Initialize an empty list of items
            panier = panierRepo.save(panier);
        }
 
         
        // Retrieve the Product
        Product product = productRepo.findById(productId)
        .orElseThrow(() -> new RuntimeException("Product not found"));

// Create a new PanierItem
PanierItem panierItem = new PanierItem();
panierItem.setPanier(panier);
panierItem.setProduct(product);
panierItem.setQuantite(quantite);
panierItem.setPrice_total(product.getPrice() * quantite);

// Add the PanierItem to the Panier
panier.getItems().add(panierItem);

// Save the updated Panier
return panierRepo.save(panier);
}

    @GetMapping("/panier-items")
    public List<PanierItem> getPanierItems() {
        // Retrieve the Panier by its ID
        Panier panier = panierRepo.findById(1L).orElseThrow(() -> new RuntimeException("Panier not found"));
    
        // Return the list of PanierItems
        return panier.getItems();
    }
    
}