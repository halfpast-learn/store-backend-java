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

import com.store.backend.main.entities.Preference;
import com.store.backend.main.services.PreferenceService;

@RestController
@RequestMapping("/preferences/")
public class PreferenceController {
	private final PreferenceService preferenceService;

    PreferenceController(PreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @PostMapping
    public int create(@RequestBody Preference preference) {
        return this.preferenceService.create(preference);
    }

    @GetMapping
    public List<Preference> findAll() {
        return this.preferenceService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Preference> findOne(@PathVariable Integer id) {
        return this.preferenceService.findOne(id);
    }

    @PatchMapping("{id}")
    public int update(@PathVariable Integer id, @RequestBody Preference preference) {
        return this.preferenceService.update(id, preference);
    }

    @DeleteMapping("{id}")
    public int delete (@PathVariable Integer id) {
        return this.preferenceService.delete(id);
    }
}
