package com.store.backend.main.services;

import java.util.List;
import java.util.Optional;

import com.store.backend.main.entities.Tag;
import com.store.backend.main.repositories.TagRepository;

public class TagService {

    TagRepository tagRepository;

    TagService(TagRepository TagRepository) {
        this.tagRepository = TagRepository;
    }

    public int create(Tag tag) {
        return this.tagRepository.save(tag) == null ? 1 : 0;
    }

    public List<Tag> findAll() {
        return this.tagRepository.findAll();
    }

    public Optional<Tag> findOne(Integer id) {
        return this.tagRepository.findById(id);
    }

    public int update(Integer id, Tag tag) {
        return 1;
    }

    public int delete(Integer id) {
        try {
            this.tagRepository.deleteById(id);   
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
    
}
