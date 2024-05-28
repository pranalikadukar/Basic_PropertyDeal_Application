package com.example.PropertyMarket1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PropertyMarket1.model.User;
import com.example.PropertyMarket1.repository.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository;

	    public User registerUser(User user) {
	        // Add user registration logic
	        return userRepository.save(user);
}
	    
	    public Optional<User> getUserByEmail(String email) {
	        return userRepository.findByEmail(email);
	    }
}
