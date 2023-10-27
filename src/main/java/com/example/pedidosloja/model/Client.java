package com.example.pedidosloja.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "clients")
@EqualsAndHashCode(of = "id")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    PersonalData personalData;

    public String getName() {
        return personalData.getName();
    }

    public String getCpf() {
        return personalData.getCpf();
    }
}
