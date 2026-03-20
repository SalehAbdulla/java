package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements CategoryService {

    private ArrayList<Category> categories = new ArrayList<>();
    private long nextCategoryId = 0;

    public void createCategory(Category category){
        category.setCategoryId(nextCategoryId++);
        categories.add(category);
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

    public void deleteCategory(long categoryId){
        categories.removeIf(c -> c.getCategoryId() == categoryId);
    }

}
