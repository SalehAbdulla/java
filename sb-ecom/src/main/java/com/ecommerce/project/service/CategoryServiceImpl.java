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
import org.springframework.http.ResponseEntity;
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
    public CategoryResponse getCategories(Integer pageNumber, Integer pageSize){
        List<Category> getAllCategories = categoryRepository.findAll();
        if (getAllCategories.isEmpty()) {throw new ApiException("categories list is empty!");}

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
    public CategoryDTO createCategory(CategoryDTO categoryDTO){
        // Fist we need to convert the CategoryDTO -> Category
        Category category = modelMapper.map(categoryDTO, Category.class);
        Category foundCategoryFromDB = categoryRepository.findByCategoryName(category.getCategoryName());
        if (foundCategoryFromDB != null) {
            throw new ApiException(foundCategoryFromDB.getCategoryName() + " is already Exists!!!");
        }
        Category savedCategory = categoryRepository.save(category);
        // Beck to the user, we convert the Category to -> CategoryDTO
        return modelMapper.map(savedCategory, CategoryDTO.class);
    }

    @Override
    public CategoryDTO deleteCategory(long categoryId)  {
        List<Category> categories = categoryRepository.findAll();

        Category category = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("categories", "categoryId", categoryId));

        categoryRepository.delete(category);
        return modelMapper.map(category, CategoryDTO.class);
    }

    @Override
    public CategoryDTO updateCategory(long categoryId, CategoryDTO categoryDTO) {

        List<Category> categories = categoryRepository.findAll();

        Optional<Category> categoryOptional = categories.stream()
                .filter(c -> c.getCategoryId() == categoryId)
                .findFirst();

        Category updatedCategoryReq = modelMapper.map(categoryDTO, Category.class);

        if (categoryOptional.isPresent()) {
            categoryRepository.delete(categoryOptional.get());
            categoryRepository.saveAndFlush(updatedCategoryReq);
        } else {
            throw new ResourceNotFoundException("categories","categoryId", categoryId);
        }

        return modelMapper.map(updatedCategoryReq, CategoryDTO.class);
    }


}
