package com.br.safefood.controller.customer;

import com.br.safefood.model.customer.OrderModel;
import com.br.safefood.model.customer.OrderProductModel;
import com.br.safefood.service.customer.OrderProductService;
import com.br.safefood.service.customer.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderProductService orderProductService;

    @PostMapping("/create")
    public ResponseEntity<OrderModel> create(@RequestBody OrderModel order){
        order.setDate(new Date());
        if(order.getStateOrder() == null){
            //order.setFullfiled(false);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.save(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable(value = "id") Long id){
        Optional<OrderProductModel> orderProduct = orderProductService.findById(id);
        if(orderProduct.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("order not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(orderProduct.get());
    }




}
