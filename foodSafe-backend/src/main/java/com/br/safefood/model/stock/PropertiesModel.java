package com.br.safefood.model.stock;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "properties")
public class PropertiesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String description;
}
