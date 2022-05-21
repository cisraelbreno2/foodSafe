package com.br.safefood.model.customer;


import com.br.safefood.model.stock.ProductModel;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_product")
public class OrderProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderModel order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel product;

    @Column()
    private Double quantity;
}
