package com.resper.shared.repo;

import com.resper.shared.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<ReservationEntity, Integer> {
}
