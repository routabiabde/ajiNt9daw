package com.testshop.testshop.Model.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "electronic_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectronicProduct extends Product {
    private String brand;
    private String model;
    private String warrantyPeriod; // e.g., 2 years
    private String powerConsumption; // e.g., 100W
    private String dimensions; // e.g., 10x20x5 cm
    private String connectivity; // e.g., WiFi, Bluetooth
}
