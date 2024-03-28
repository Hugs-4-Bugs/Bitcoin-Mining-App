package com.example.bitcoinmining.service;

import com.example.bitcoinmining.model.User;
import com.example.bitcoinmining.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // For password hashing

    @Override
    public User registerUser(User user) {
        // Implement user registration logic (e.g., validation, password hashing, etc.)
        // For example, you can check if the username is already taken
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException("Username is already taken");
        }
        
        // Hash the user's password before saving it
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        
        // Save the user to the database
        return userRepository.save(user);
    }

    // Implement other UserService methods if needed
}
