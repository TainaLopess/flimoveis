package com.imoveis.flimoveis.model;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Imovel {

    @Id
    @GeneratedValue
    private Long id;

    @Column (nullable = false)
    private String rua;

    @Column (nullable = false)
    private String bairro;

    @Column (nullable = false)
    private Integer numero;

    @Column (nullable = false)
    private String complemento;

    @Column (nullable = false)
    private Integer quartos;

    @Column (nullable = false)
    private Integer banheiros;

    @Column (nullable = false)
    private boolean piscina;

    @Column (nullable = false)
    private boolean permitirAnimais;
}
