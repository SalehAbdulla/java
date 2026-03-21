package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private ArrayList<Category> categories = new ArrayList<>();
    private long nextCategoryId = 0L;

    @Override
    public ArrayList<Category> getCategories(){
        return categories;
    }

    @Override
    public void createCategory(Category category){
        category.setCategoryId(nextCategoryId++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(long categoryId){
        Category category = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CATEGORY NOT FOUND"));

        categories.remove(category);

        return "Category with category id " + categoryId + " deleted successfuly";
    }

    @Override
    public String updateCategory(long categoryId, Category category) {
        Optional<Category> categoryOptional = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst();

        if (categoryOptional.isPresent()) {
            categoryOptional.get().setCategoryName(category.getCategoryName());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CATEGORY NOT FOUND");
        }

        return "category updated successfully";
    }


}
