package com.ecommerce.project.colntroller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategoryController implements CategoryService {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @Override
    public void createCategory(Category category) {

    }

    @Override
    public void deleteCategory(long categoryId) {

    }

    @GetMapping("api/public/all-categories")
    public ArrayList<Category> getAllCategories(){
        return categoryService;
    }

    @PostMapping("api/admin/category")
    public String addCategory(){
        return "Add Category";
    }

    @DeleteMapping("api/admin/category/{categoryId}")
    public String deleteCategory(@RequestBody Category category){
        return "Delete Category";
    }

}
