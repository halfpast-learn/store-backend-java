package com.store.backend.main.services;

import java.util.List;
import java.util.Optional;

import com.store.backend.main.repositories.ItemRepository;
import com.store.backend.main.entities.Item;

public class ItemService {

    ItemRepository itemRepository;

    ItemService(ItemRepository ItemRepository) {
        this.itemRepository = ItemRepository;
    }

    public int create(Item item) {
        return this.itemRepository.save(item) == null ? 1 : 0;
    }

    public List<Item> findAll() {
        return this.itemRepository.findAll();
    }

    public Optional<Item> findOne(Integer id) {
        return this.itemRepository.findById(id);
    }

    public int update(Integer id, Item item) {
        return 1;
    }

    public int delete(Integer id) {
        try {
            this.itemRepository.deleteById(id);   
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

}
