package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import com.ecommerce.project.service.CategoryServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    public CategoryController(CategoryServiceImpl categoryServiceImpl){
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping("/public/categories")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryServiceImpl.getCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/public/create-category")
    public ResponseEntity<String> createCategory(@Valid @RequestBody Category category) {
        categoryServiceImpl.createCategory(category);
        return new ResponseEntity<>("Category created Successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/delete-category/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable long categoryId){
        String status = categoryServiceImpl.deleteCategory(categoryId);
        return ResponseEntity.ok(status);
    }

    @PutMapping("/admin/update-category/{categoryId}")
    public ResponseEntity<String> updateCategory(@PathVariable long categoryId, @Valid @RequestBody Category category) {
        String status = categoryServiceImpl.updateCategory(categoryId, category);
        return ResponseEntity.ok(status);
    }
}
