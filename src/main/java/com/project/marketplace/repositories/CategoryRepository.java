package com.project.marketplace.repositories;

import com.project.marketplace.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
