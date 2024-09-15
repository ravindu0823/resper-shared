package com.resper.shared.repo;

import com.resper.shared.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<MenuEntity, Integer> {
}
