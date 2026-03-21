package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.ArrayList;

public interface CategoryService {
    void createCategory(Category category);
    String deleteCategory(long categoryId);
    ArrayList<Category> getCategories();
}
