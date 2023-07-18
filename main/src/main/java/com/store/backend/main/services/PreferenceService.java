package com.store.backend.main.services;

import java.util.List;
import java.util.Optional;

import com.store.backend.main.entities.Preference;
import com.store.backend.main.repositories.PreferenceRepository;

public class PreferenceService {
    
    PreferenceRepository preferenceRepository;

    PreferenceService(PreferenceRepository PreferenceRepository) {
        this.preferenceRepository = PreferenceRepository;
    }

    public int create(Preference preference) {
        return this.preferenceRepository.save(preference) == null ? 1 : 0;
    }

    public List<Preference> findAll() {
        return this.preferenceRepository.findAll();
    }

    public Optional<Preference> findOne(Integer id) {
        return this.preferenceRepository.findById(id);
    }

    public int update(Integer id, Preference preference) {
        return 1;
    }

    public int delete(Integer id) {
        try {
            this.preferenceRepository.deleteById(id);   
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
}
