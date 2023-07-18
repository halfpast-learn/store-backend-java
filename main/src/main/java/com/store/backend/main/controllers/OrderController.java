package com.store.backend.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.backend.main.entities.Order;
import com.store.backend.main.services.OrderService;

@RestController
@RequestMapping("/orders/")
public class OrderController {
	private final OrderService orderService;

    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public int create(@RequestBody Order order) {
        return this.orderService.create(order);
    }

    @GetMapping
    public List<Order> findAll() {
        return this.orderService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Order> findOne(@PathVariable Integer id) {
        return this.orderService.findOne(id);
    }

    @PatchMapping("{id}")
    public int update(@PathVariable Integer id, @RequestBody Order order) {
        return this.orderService.update(id, order);
    }

    @DeleteMapping("{id}")
    public int delete (@PathVariable Integer id) {
        return this.orderService.delete(id);
    }
}
