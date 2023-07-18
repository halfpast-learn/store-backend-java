package com.store.backend.main.services;

import java.util.List;
import java.util.Optional;

import com.store.backend.main.entities.User;
import com.store.backend.main.repositories.UserRepository;

public class UserService {
    
    UserRepository userRepository;

    UserService(UserRepository UserRepository) {
        this.userRepository = UserRepository;
    }

    public int create(User user) {
        return this.userRepository.save(user) == null ? 1 : 0;
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public Optional<User> findOne(Integer id) {
        return this.userRepository.findById(id);
    }

    public int update(Integer id, User user) {
        return 1;
    }

    public int delete(Integer id) {
        try {
            this.userRepository.deleteById(id);   
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
}
