package com.example.pedidosloja.model;

import com.example.pedidosloja.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Getter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @Column(nullable = false)
    private BigDecimal totalValue;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public Order(Client client) {
        this.client = client;
        date = LocalDateTime.now();
        totalValue = BigDecimal.ZERO;
        status = OrderStatus.WAITING_PAYMENT;
        orderItems = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        item.setOrder(this);
        orderItems.add(item);
        totalValue = totalValue.add(item.getTotalValue());
    }
}
