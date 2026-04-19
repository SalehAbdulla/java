package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO category);
    CategoryDTO deleteCategory(long categoryId);
    CategoryResponse getCategories();
    CategoryDTO updateCategory(long categoryId, CategoryDTO categoryDTO);
}
