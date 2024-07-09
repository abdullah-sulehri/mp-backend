package com.project.marketplace.controller;

import com.project.marketplace.entities.Category;
import com.project.marketplace.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/marketplace")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @PostMapping("/category")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.saveCategory(category));
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories(){
        return ResponseEntity.ok(categoryService.getCategories());
    }


}
