package com.resper.shared.repo;

import com.resper.shared.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepo extends JpaRepository<PlanEntity, Integer> {
}
