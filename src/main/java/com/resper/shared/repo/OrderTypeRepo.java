package com.resper.shared.repo;

import com.resper.shared.entity.OrderTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTypeRepo extends JpaRepository<OrderTypeEntity, Integer> {
}
