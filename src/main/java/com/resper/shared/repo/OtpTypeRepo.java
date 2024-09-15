package com.resper.shared.repo;

import com.resper.shared.entity.OtpTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtpTypeRepo extends JpaRepository<OtpTypeEntity, Integer> {
    OtpTypeEntity findByReason(String reason);
}
