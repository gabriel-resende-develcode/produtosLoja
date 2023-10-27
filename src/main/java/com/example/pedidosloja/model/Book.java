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
@Table(name = "books")
public class Book extends Product {

    @Column(length = 150, nullable = false)
    private String author;

    @Column(nullable = false)
    private Integer numberOfPages;

    public Book(String name, String description, BigDecimal price, Category category, String author, Integer numberOfPages) {
        super(name, description, price, category);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
}
