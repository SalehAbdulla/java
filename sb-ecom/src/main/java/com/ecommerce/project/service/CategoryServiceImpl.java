package com.ecommerce.project.service;

import com.ecommerce.project.exceptions.ApiException;
import com.ecommerce.project.exceptions.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;
import com.ecommerce.project.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryResponse getCategories(){
        List<Category> getAllCategories = categoryRepository.findAll();
        if (getAllCategories.isEmpty()) {
            throw new ApiException("categories list is empty!");
        }

        // Before send the response, we will map the List<CategoryDTO> to be CategoryResponse
          List<CategoryDTO> categoryDTOs = getAllCategories.stream()
                  .map(category -> modelMapper.map(category, CategoryDTO.class))
                  .toList();

        // set the content
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setContent(categoryDTOs);


        return categoryResponse;
    }

    @Override
    public void createCategory(Category category){

        Category foundCategory = categoryRepository.findByCategoryName(category.getCategoryName());
        if (foundCategory != null) {
            throw new ApiException(foundCategory.getCategoryName() + " is already Exists!!!");
        }
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
