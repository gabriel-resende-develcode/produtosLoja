package com.example.pedidosloja.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private BigDecimal unitPrice;
    @Column(nullable = false)
    private Integer quantity;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;
}
