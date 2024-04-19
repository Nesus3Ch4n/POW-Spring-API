package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.repository.iUserRepository;
import com.example.demo.services.iUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping()
public class UserController {

    @Autowired
    iUserServices userService;
    iUserRepository userRepository;

    public UserController(iUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index(User user) {

        user.addAttribute("users", userRepository.findAll());
        return "index";
    }

    @GetMapping("/listarusuarios")
    public ArrayList<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping()
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Long id) {

        boolean ok = userService.deleteUser(id);
        if (ok) {
            return "Delete user by id" + id;
        } else {
            return "Error Delete user by id" + id;
        }

    }
}
