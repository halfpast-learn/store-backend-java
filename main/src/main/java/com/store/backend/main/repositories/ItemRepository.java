package com.store.backend.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.backend.main.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    
}
