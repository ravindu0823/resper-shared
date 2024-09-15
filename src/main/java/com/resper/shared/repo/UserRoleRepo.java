package com.resper.shared.repo;

import com.resper.shared.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepo extends JpaRepository<UserRoleEntity, Integer> {

}
