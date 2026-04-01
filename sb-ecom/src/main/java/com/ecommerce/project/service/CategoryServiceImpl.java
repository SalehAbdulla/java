package com.ecommerce.project.service;

import com.ecommerce.project.exceptions.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

//    private ArrayList<Category> categories = new ArrayList<>();

//    private long nextCategoryId = 0L;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category){
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(long categoryId)  {
        List<Category> categories = categoryRepository.findAll();

        Category category = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("categories", "categoryId", categoryId));

        categoryRepository.delete(category);

        return "Category with category id " + categoryId + " deleted successfully";
    }

    @Override
    public String updateCategory(long categoryId, Category category) {

        List<Category> categories = categoryRepository.findAll();

        Optional<Category> categoryOptional = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst();

        if (categoryOptional.isPresent()) {
            Category existedCategory = categoryOptional.get();
            categoryRepository.saveAndFlush(existedCategory);
        } else {
            throw new ResourceNotFoundException("categories","categoryId", categoryId);
        }

        return "category updated successfully";
    }


}
