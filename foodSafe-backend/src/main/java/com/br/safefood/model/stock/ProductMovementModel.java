package com.br.safefood.model.stock;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "product_movement")
public class ProductMovementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel product;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "moviment_quantity")
    private Double movimentQuantity;

    @Column(name = "moviment_date")
    private Date movimentDate;

}
