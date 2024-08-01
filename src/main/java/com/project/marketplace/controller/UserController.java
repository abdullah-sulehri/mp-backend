package com.project.marketplace.controller;


import com.project.marketplace.dto.LoginRequest;
import com.project.marketplace.dto.LoginResponse;
import com.project.marketplace.entities.User;
import com.project.marketplace.security.JwtHelper;
import com.project.marketplace.services.UserSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController

public class UserController {
    @Autowired
    private UserSerevice userSerevice;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        user.setPass(passwordEncoder.encode(user.getPass()));
        userSerevice.saveUser(user);
        return ResponseEntity.ok("User Saved");
    }


    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable(name = "id") int id){
        return ResponseEntity.ok(userSerevice.getUserById(id));
    }

    @PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
        String email=null;
        try {
            Authentication auth= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(),
                    loginRequest.getPassword()));

            org.springframework.security.core.userdetails.User user=
                    (org.springframework.security.core.userdetails.User) auth.getPrincipal();

            email=user.getUsername();//email


        } catch (BadCredentialsException e) {
            // loginService.addLoginAttempt(request.email(), false);
            throw e;
        }

        User userProfile=userSerevice.getUserByEmail(email);

        String token = JwtHelper.generateToken(loginRequest.getEmail());
        LoginResponse loginResponse=new LoginResponse(userProfile,token);
        //loginService.addLoginAttempt(request.email(), true);
        return ResponseEntity.ok(loginResponse.toString());
        //return ResponseEntity.ok(token);
    }

}
