package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import com.ecommerce.project.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    public CategoryController(CategoryServiceImpl categoryServiceImpl){
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping("/api/public/categories")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryServiceImpl.getCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/api/public/create-category")
    public ResponseEntity<String> createCategory(@RequestBody Category category) {
        categoryServiceImpl.createCategory(category);
        return new ResponseEntity<>("Category created Successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/api/admin/delete-category/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable long categoryId){
        try {
            String status = categoryServiceImpl.deleteCategory(categoryId);
            return ResponseEntity.ok(status);
        } catch (ResponseStatusException e) {
            return new ResponseEntity<>(e.getReason(), e.getStatusCode());
        }

    }

}
