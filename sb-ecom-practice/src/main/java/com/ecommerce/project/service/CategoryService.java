package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

public interface CategoryService {
    void createCategory(Category category);
    void deleteCategory(long categoryId);
    List<Category> getAllCategories();
}
