package com.example.pedidosloja.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    PersonalData personalData;

    public Client(String name, String cpf){
        personalData = new PersonalData(cpf, name);
    }

    public String getName() {
        return personalData.getName();
    }

    public String getCpf() {
        return personalData.getCpf();
    }
}
