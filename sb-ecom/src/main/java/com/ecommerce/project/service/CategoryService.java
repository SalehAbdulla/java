package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

public interface CategoryService {
    void createCategory(Category category);
    String deleteCategory(long categoryId);
    List<Category> getCategories();
    String updateCategory(long categoryId, Category category);
}
