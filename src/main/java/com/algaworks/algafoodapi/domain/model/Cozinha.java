package com.algaworks.algafoodapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cozinha")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cozinha {

    @Id
    private Long id;

    @Column(name = "st_nome")
    private String nome;
}
