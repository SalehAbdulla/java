package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    String createCategory(@RequestBody Category category);
    String deleteCategory(@PathVariable long categoryId);
    Category updateCategory(@RequestBody Category category, @PathVariable long categoryId);
}
