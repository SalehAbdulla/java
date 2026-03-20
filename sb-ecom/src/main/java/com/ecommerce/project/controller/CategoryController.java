package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import com.ecommerce.project.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private CategoryServiceImpl categoryServiceImpl;

    @Autowired
    public CategoryController(CategoryServiceImpl categoryServiceImpl){
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping("/api/public/categories")
    public List<Category> getCategories() {
        return categoryServiceImpl.getCategories();
    }

    @PostMapping("/api/public/create-category")
    public String createCategory(@RequestBody Category category) {
        categoryServiceImpl.createCategory(category);
        return "Category added successfully";
    }

    @DeleteMapping("/api/admin/delete-category/{categoryId}")
    public void deleteCategory(@PathVariable long categoryId){
        categoryServiceImpl.deleteCategory(categoryId);
    }

}
