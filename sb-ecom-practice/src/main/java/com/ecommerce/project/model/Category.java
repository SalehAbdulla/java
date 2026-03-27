package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;


public class Category {

    private long categoryId;
    private String categoryName;

    public Category(long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {}

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.categoryId, this.categoryName);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Category)) return false;

        Category category = (Category) obj;

        return Objects.equals(this.categoryId, category.categoryId)
                && Objects.equals(this.categoryName, category.categoryName);

    }
}
