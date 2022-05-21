package com.br.safefood.model.payment;

import com.br.safefood.model.customer.OrderModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "payment")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethodModel paymentMethod;

    @Column
    private Boolean fulfilled;

    @ManyToMany
    private List<OrderModel> orders;


}
