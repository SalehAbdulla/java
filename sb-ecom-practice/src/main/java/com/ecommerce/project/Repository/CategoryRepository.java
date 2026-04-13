package com.ecommerce.project.Repository;

import com.ecommerce.project.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(@NotBlank @Size(min = 3, max = 10) String categoryName);
    // NOTHING TO DO HERE, so far. but we can generate more methods using findBy for example, JPA will create it
}
