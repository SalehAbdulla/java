package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;
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
    // This is just an example of how we can get the values from the params
//    @GetMapping("/echo")
//    public ResponseEntity<String> echoMessage(@RequestParam(value = "message", defaultValue = "default message") String message){
//        return new ResponseEntity<>("Echoed Message is: " + message, HttpStatus.OK);
//    }

    @GetMapping("/public/categories")
    public ResponseEntity<CategoryResponse> getCategories(
            @RequestParam(name = "pageNumber") Integer pageNumber,
            @RequestParam(name = "pageSize") Integer pageSize
            ) {
        CategoryResponse categories = categoryServiceImpl.getCategories(pageNumber, pageSize);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/public/create-category")
    public ResponseEntity<CategoryDTO> createCategory(@Valid @RequestBody CategoryDTO category) {
        return new ResponseEntity<>(categoryServiceImpl.createCategory(category), HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/delete-category/{categoryId}")
    public ResponseEntity<CategoryDTO> deleteCategory(@PathVariable long categoryId){
        CategoryDTO deletedCategoryDTO = categoryServiceImpl.deleteCategory(categoryId);
        return new ResponseEntity<>(deletedCategoryDTO, HttpStatus.OK);
    }

    @PutMapping("/admin/update-category/{categoryId}")
    public ResponseEntity<CategoryDTO> updateCategory(@PathVariable long categoryId, @Valid @RequestBody CategoryDTO categoryDTO) {
        CategoryDTO updateCategoryDTO = categoryServiceImpl.updateCategory(categoryId, categoryDTO);
        return new ResponseEntity<>(updateCategoryDTO, HttpStatus.OK);
    }
}
