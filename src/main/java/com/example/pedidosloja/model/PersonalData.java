package com.example.pedidosloja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class PersonalData {

    @CPF(message = "invalid cpf format")
    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Column(length = 150, nullable = false)
    private String name;
}
