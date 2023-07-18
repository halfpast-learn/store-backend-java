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

import com.store.backend.main.entities.Tag;
import com.store.backend.main.services.TagService;

@RestController
@RequestMapping("/tags/")
public class TagController {
	private final TagService tagService;

    TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @PostMapping
    public int create(@RequestBody Tag tag) {
        return this.tagService.create(tag);
    }

    @GetMapping
    public List<Tag> findAll() {
        return this.tagService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Tag> findOne(@PathVariable Integer id) {
        return this.tagService.findOne(id);
    }

    @PatchMapping("{id}")
    public int update(@PathVariable Integer id, @RequestBody Tag tag) {
        return this.tagService.update(id, tag);
    }

    @DeleteMapping("{id}")
    public int delete (@PathVariable Integer id) {
        return this.tagService.delete(id);
    }
}
