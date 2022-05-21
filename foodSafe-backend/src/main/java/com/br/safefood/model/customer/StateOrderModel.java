package com.br.safefood.model.customer;


import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "state_order")
public class StateOrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
}
