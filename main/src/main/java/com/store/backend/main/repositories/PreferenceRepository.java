package com.store.backend.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.backend.main.entities.Preference;

public interface PreferenceRepository extends JpaRepository<Preference, Integer> {
    
}
