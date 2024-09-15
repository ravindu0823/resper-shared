package com.resper.shared.repo;

import com.resper.shared.entity.CategoryEntity;
import com.resper.shared.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepo extends JpaRepository<FoodEntity, Integer> {
    List<FoodEntity> findByCategoryId(CategoryEntity categoryId);
}
