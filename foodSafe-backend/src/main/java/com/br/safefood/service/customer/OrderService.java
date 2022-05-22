package com.br.safefood.service.customer;

import com.br.safefood.repository.customer.IOrderRepository;
import com.br.safefood.model.customer.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    @Transactional
    public OrderModel save(OrderModel order){
        order = orderRepository.save(order);
        return order;
    }

    @Transactional
    public void delete(Long id){
        Optional<OrderModel> order = orderRepository.findById(id);
        orderRepository.delete(order.get());
    }

    public Optional<OrderModel> findById(Long id){
        return orderRepository.findById(id);
    }

    public List<OrderModel> getAllByClientCardAndDate(Long clientCardId, Long stateOrderId){
        return orderRepository.getAllByClientCardAndDate(clientCardId, stateOrderId);
    }

}
