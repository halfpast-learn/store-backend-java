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

import com.store.backend.main.entities.User;
import com.store.backend.main.services.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {
    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public int create(@RequestBody User user) {
        return this.userService.create(user);
    }

    @GetMapping
    public List<User> findAll() {
        return this.userService.findAll();
    }

    @GetMapping("{id}")
    public Optional<User> findOne(@PathVariable Integer id) {
        return this.userService.findOne(id);
    }

    @PatchMapping("{id}")
    public int update(@PathVariable Integer id, @RequestBody User user) {
        return this.userService.update(id, user);
    }

    @DeleteMapping("{id}")
    public int delete (@PathVariable Integer id) {
        return this.userService.delete(id);
    }
}
