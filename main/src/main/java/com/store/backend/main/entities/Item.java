package com.store.backend.main.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    
    String description;
    Double price;

    @ManyToMany
    List<Tag> tags;
}
