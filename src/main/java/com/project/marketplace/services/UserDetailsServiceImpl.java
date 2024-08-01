package com.project.marketplace.services;

import com.project.marketplace.entities.User;
import com.project.marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

   /* @Autowired
    private PasswordEncoder passwordEncoder;
*/
    @Override
    public UserDetails loadUserByUsername(String email) {

        User user=userRepository.findByEmail(email);
        // Get users details from database  and populate username and password with that
        //TODO: PLACE NULL CHECK HARE
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())//database username
                .password(user.getPass())

                //.password("$2a$10$JYoREMWZKnTJ4DTcistyNeXBQoFNWNtSwOKgaw.RZFzuc21KxlCpS") //database password
                .build();
    }

}