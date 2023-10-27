package com.example.pedidosloja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "notebooks")
public class Notebook extends Product {

    @Column(length = 150, nullable = false)
    private String brand;
}
