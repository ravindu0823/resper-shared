package com.resper.shared.repo;

import com.resper.shared.entity.EmailOtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailOtpRepo extends JpaRepository<EmailOtpEntity, Integer> {
    EmailOtpEntity findTopByEmailOrderByGeneratedAtDesc(String email);
}
