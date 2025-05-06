package com.testshop.testshop.Model.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "food_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodProduct extends Product {
    private String expirationDate; // e.g., 2025-12-31
    private boolean isPerishable; // True if the product is perishable
    private String originCountry; // e.g., USA, France
    private String ingredients; // e.g., Sugar, Milk, Cocoa
    private String foodType; // e.g., Organic, Vegan, Gluten-Free
}