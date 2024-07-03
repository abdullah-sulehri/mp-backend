package com.project.marketplace.repositories;

import com.project.marketplace.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
