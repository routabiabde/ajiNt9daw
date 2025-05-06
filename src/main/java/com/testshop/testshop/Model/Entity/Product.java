package com.testshop.testshop.Model.Entity;

import java.net.URL;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING) // Add dtype column
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "product_Id") 
private long product_Id;
private String name;
private String brand;
private Double price;
private String urlImage;
private String description;
private String category;


}
