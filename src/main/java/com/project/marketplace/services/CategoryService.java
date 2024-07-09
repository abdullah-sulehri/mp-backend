    package com.project.marketplace.services;

    import com.project.marketplace.entities.Category;
    import com.project.marketplace.repositories.CategoryRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class CategoryService {

        @Autowired
        private CategoryRepository categoryRepository;

        /*public CategoryService(CategoryRepository categoryRepository){
            this.categoryRepository=categoryRepository;
        }*/
        public Category saveCategory(Category category){
           return  categoryRepository.save(category);
        }

        public Category getCategoryById(Integer id) {
            return categoryRepository.findById(id).get();
        }


        public List<Category> getCategories(){
            return categoryRepository.findAll();
        }
    }
