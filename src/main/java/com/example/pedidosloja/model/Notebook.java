package com.example.pedidosloja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@NoArgsConstructor
@Getter
@Entity
@Table(name = "notebooks")
public class Notebook extends Product {

    @Column(length = 150, nullable = false)
    private String brand;

    public Notebook(String name, String description, BigDecimal price, Category category, String brand) {
        super(name, description, price, category);
        this.brand = brand;
    }
}
