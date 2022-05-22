package com.br.safefood.service.customer;

import com.br.safefood.model.customer.OrderProductModel;
import com.br.safefood.repository.customer.IOrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderProductService {

    @Autowired
    private IOrderProductRepository orderProductRepository;

    public Optional<OrderProductModel> findById(Long id){
        return orderProductRepository.findById(id);
    }
}
