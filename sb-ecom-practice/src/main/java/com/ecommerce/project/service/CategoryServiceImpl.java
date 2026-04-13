package com.ecommerce.project.service;

import com.ecommerce.project.Repository.CategoryRepository;
import com.ecommerce.project.exceptions.ApiException;
import com.ecommerce.project.exceptions.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

//    List<Category> categories = new ArrayList<>();

    @Override
    public CategoryResponse getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty()){
            throw new ApiException("no category created yet!");
        }
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        Category getCategory = categoryRepository.findByCategoryName(category.getCategoryName());
        if (getCategory != null) {
            throw new ApiException("category with fieldName: " + category.getCategoryName() +" is already exists" );
        }
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(long categoryId) {
        Category savedCategory = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("category", "categoryId", categoryId));
        categoryRepository.delete(savedCategory);

        return "category with id: " + categoryId + " deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, long categoryId) {
        Category savedCategory = categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException("category", "categoryId", categoryId));
        category.setCategoryId(categoryId); // in case user passed wrong id in the body
        savedCategory = categoryRepository.save(savedCategory);
        return savedCategory;
    }

}
