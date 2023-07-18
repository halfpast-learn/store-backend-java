package com.store.backend.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.backend.main.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
