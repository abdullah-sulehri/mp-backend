package com.project.marketplace.repositories;

import com.project.marketplace.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {
    User findByEmail(String email);
}
