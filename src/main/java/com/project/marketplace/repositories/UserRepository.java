package com.project.marketplace.repositories;

import com.project.marketplace.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
