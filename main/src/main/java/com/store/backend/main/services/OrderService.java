package com.store.backend.main.services;

import java.util.List;
import java.util.Optional;

import com.store.backend.main.entities.Order;
import com.store.backend.main.repositories.OrderRepository;

public class OrderService {
    
    OrderRepository orderRepository;

    OrderService(OrderRepository OrderRepository) {
        this.orderRepository = OrderRepository;
    }

    public int create(Order order) {
        return this.orderRepository.save(order) == null ? 1 : 0;
    }

    public List<Order> findAll() {
        return this.orderRepository.findAll();
    }

    public Optional<Order> findOne(Integer id) {
        return this.orderRepository.findById(id);
    }

    public int update(Integer id, Order order) {
        return 1;
    }

    public int delete(Integer id) {
        try {
            this.orderRepository.deleteById(id);   
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
}
