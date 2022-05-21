package com.br.safefood.model.stock;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String description;

    @Column
    private String details;

    @ManyToMany
    private List<PropertiesModel> properties;
}
