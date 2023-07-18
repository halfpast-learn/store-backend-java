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

import com.store.backend.main.entities.Item;
import com.store.backend.main.services.ItemService;

@RestController
@RequestMapping("/items/")
public class ItemController {
    private final ItemService itemService;

    ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public int create(@RequestBody Item item) {
        return this.itemService.create(item);
    }

    @GetMapping
    public List<Item> findAll() {
        return this.itemService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Item> findOne(@PathVariable Integer id) {
        return this.itemService.findOne(id);
    }

    @PatchMapping("{id}")
    public int update(@PathVariable Integer id, @RequestBody Item item) {
        return this.itemService.update(id, item);
    }

    @DeleteMapping("{id}")
    public int delete (@PathVariable Integer id) {
        return this.itemService.delete(id);
    }
}
