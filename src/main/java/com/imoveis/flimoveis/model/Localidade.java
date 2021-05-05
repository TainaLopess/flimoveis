package com.imoveis.flimoveis.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Localidade {

    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String cidade;

    @Column (nullable = false)
    private String bairro;

}
