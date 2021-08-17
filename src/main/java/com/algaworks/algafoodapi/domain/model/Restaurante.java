package com.algaworks.algafoodapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_restaurante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurante {

    @Id
    private Long id;

    @Column(name = "st_nome")
    private String nome;

    @Column(name = "taxa_frete")
    private BigDecimal taxaFrete;
}
