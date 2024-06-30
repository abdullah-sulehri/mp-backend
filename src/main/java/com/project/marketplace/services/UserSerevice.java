package com.project.marketplace.services;

import com.project.marketplace.entities.User;
import com.project.marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerevice {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUserById(Integer user_id){
        return userRepository.findById(user_id).get();
    }
}
