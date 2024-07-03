package com.project.marketplace.controller;

import com.project.marketplace.entities.Category;
import com.project.marketplace.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/marketplace")
public class CategoryController {

    @Autowired
    CategoryService categoryService;
    @PostMapping("/category")
    public ResponseEntity<String> saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return ResponseEntity.ok("Category Saved successfully");
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }


}
