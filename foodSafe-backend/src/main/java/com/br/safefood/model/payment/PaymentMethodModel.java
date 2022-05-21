package com.br.safefood.model.payment;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payment")
public class PaymentMethodModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String description;

}
