package com.testshop.testshop.Model.Entity;

import org.springframework.data.mapping.AccessOptions.GetOptions.GetNulls;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "clothing_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothingProduct extends Product {
    private String size; // Changed to String for flexibility (e.g., S, M, L, XL)
    private String color;
    private String material;
    private String gender; // e.g., Male, Female, Unisex
    private String season; // e.g., Summer, Winter
    private String brandStyle; // e.g., Casual, Formal
}
