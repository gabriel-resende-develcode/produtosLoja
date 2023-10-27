package com.example.pedidosloja.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "products")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 300)

    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    private LocalDate registrationDate = LocalDate.now();

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
}
