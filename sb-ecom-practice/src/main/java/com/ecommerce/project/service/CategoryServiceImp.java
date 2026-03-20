package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.ArrayList;

public class CategoryServiceImp {
    ArrayList<Category> categories = new ArrayList<>();

    public CategoryServiceImp(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
