package com.project.marketplace.controller;


import com.project.marketplace.entities.User;
import com.project.marketplace.services.UserSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {
    @Autowired
    private UserSerevice userSerevice;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        userSerevice.saveUser(user);
        return ResponseEntity.ok("User Saved");
    }

    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable(name = "id") int id){
        return ResponseEntity.ok(userSerevice.getUserById(id));
    }
}
