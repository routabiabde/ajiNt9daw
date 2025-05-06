package com.testshop.testshop.Model.Entity;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.jpa.repository.Query;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PanierItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long panier_item_Id;

    private Double price_total;

    private int quantite;

    @ManyToOne
    @JoinColumn(referencedColumnName = "panier_id",name = "panier_id")
    @JsonBackReference
    private Panier panier;

    @OneToOne
    @JoinColumn(referencedColumnName = "product_Id",name = "product_Id")
    private Product product;
}
