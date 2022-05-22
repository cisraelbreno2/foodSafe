package com.br.safefood.repository.customer;

import com.br.safefood.model.customer.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<OrderModel, Long> {

    @Query("SELECT o FROM OrderModel o " +
            "WHERE o.clientCard.id = :clientCardId " +
            "AND o.stateOrder.id = :stateOrderId")
    public List<OrderModel> getAllByClientCardAndDate(@Param("clientCardId") Long clientCardId, @Param("stateOrderId") Long stateOrderId);

}
