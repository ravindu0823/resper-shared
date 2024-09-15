package com.resper.shared.repo;

import com.resper.shared.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<RestaurantEntity, Integer> {
}
