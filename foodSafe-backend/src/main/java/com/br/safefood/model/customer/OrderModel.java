package com.br.safefood.model.customer;

import com.br.safefood.model.administration.EmployeeModel;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "orders")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private TableModel table;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeModel employee;

    @ManyToOne
    @JoinColumn(name = "state_order_id")
    private StateOrderModel stateOrder;

}
