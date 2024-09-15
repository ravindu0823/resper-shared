package com.resper.shared.repo;

import com.resper.shared.entity.AppConfigurationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppConfigurationRepo extends JpaRepository<AppConfigurationEntity, Integer> {
}
