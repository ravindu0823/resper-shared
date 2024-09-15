package com.resper.shared.repo;

import com.resper.shared.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepo extends JpaRepository<DeviceEntity, Integer> {

}
