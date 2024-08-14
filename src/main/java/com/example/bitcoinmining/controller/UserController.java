package com.example.bitcoinmining.controller;

import com.example.bitcoinmining.model.User;
import com.example.bitcoinmining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // Add more endpoints for user management (login, update, delete, etc.)
}
