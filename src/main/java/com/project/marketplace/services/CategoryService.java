    package com.project.marketplace.services;

    import com.project.marketplace.entities.Category;
    import com.project.marketplace.repositories.CategoryRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.stereotype.Service;

    @Service
    public class CategoryService {

        @Autowired
        private CategoryRepository categoryRepository;

        /*public CategoryService(CategoryRepository categoryRepository){
            this.categoryRepository=categoryRepository;
        }*/
        public void saveCategory(Category category){
            categoryRepository.save(category);
        }

        public Category getCategoryById(Integer id) {
            return categoryRepository.findById(id).get();
        }
    }
