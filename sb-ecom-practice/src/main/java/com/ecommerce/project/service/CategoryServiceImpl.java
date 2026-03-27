package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    List<Category> categories = new ArrayList<>();
    Long categoryCounter = 0L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(categoryCounter++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(long categoryId) {
        Category category = categories.stream().filter(c -> c.getCategoryId() == categoryId).findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found"));
        categories.remove(category);
        return "category with id: " + categoryId + " deleted successfully";
    }

    @Override
    public String updateCategory(Category category, long categoryId) {
        Category foundCategory = categories.stream().filter(c -> c.getCategoryId() == categoryId).findFirst()
                    .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "category not found"));
        foundCategory.setCategoryName(category.getCategoryName());
        return "category with category id: " + categoryId + " updated successfully";
    }

}
