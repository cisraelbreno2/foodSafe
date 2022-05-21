package com.br.safefood.model.customer;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "client_card")
public class ClientCardModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "qr_code")
    private String qrCode;

    @Column
    private Integer number;

    @Column
    private String color;

    @Column(name = "in_use")
    private Boolean inUse;

    @ManyToMany
    private List<OrderModel> orders;

}
