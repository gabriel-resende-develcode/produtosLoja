package com.example.pedidosloja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "books")
public class Book extends Product{

    @Column(length = 150, nullable = false)
    private String author;

    @Column(nullable = false)
    private Integer numberOfPages;
}
