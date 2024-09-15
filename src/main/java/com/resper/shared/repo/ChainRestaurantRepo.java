package com.resper.shared.repo;

import com.resper.shared.entity.ChainRestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChainRestaurantRepo extends JpaRepository<ChainRestaurantEntity, Integer> {
}
