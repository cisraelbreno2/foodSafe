package com.br.safefood.repository.customer;

import com.br.safefood.model.customer.ClientCardModel;
import com.br.safefood.model.customer.OrderProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderProductRepository extends JpaRepository<OrderProductModel, Long> {
}
