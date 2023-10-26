package com.example.pedidosloja.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "clients")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CPF(message = "invalid cpf format")
    private String cpf;

    @Column(length = 150, nullable = false)
    private String name;
}
