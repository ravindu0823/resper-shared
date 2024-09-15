package com.resper.shared.repo;

import com.resper.shared.entity.CategoryEntity;
import com.resper.shared.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {
    List<CategoryEntity> findByMenuId(MenuEntity menuId);
}
