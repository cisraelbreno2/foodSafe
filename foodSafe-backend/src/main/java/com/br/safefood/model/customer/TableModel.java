package com.br.safefood.model.customer;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tables")
public class TableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "in_use")
    private Boolean inUse;
}
