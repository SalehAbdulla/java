package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements CategoryService {

    private ArrayList<Category> categories = new ArrayList<>();
    private long nextCategoryId = 0L;

    public void createCategory(Category category){
        category.setCategoryId(nextCategoryId++);
        categories.add(category);
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

    public String deleteCategory(long categoryId){
        Category category = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CATEGORY NOT FOUND"));

        categories.remove(category);

        return "Category with category id " + categoryId + " deleted successfuly";
    }

}
