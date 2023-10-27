package com.example.pedidosloja.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Getter
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    public OrderItem(BigDecimal unitPrice, Integer quantity, Product product){
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.product = product;
    }

    public BigDecimal getTotalValue() {
        return unitPrice.multiply(new BigDecimal(quantity));
    }

    public void setOrder(Order order) {
        if (order == null)
            throw new IllegalArgumentException("The order can not be null!");
        this.order = order;
    }
}
