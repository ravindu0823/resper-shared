package com.resper.shared.repo;

import com.resper.shared.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepo extends JpaRepository<OwnerEntity, Integer> {
}
