package com.oscarhanke.module.post.repository;

import com.oscarhanke.module.post.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, String>{
    Optional<UserEntity> findUserEntityByUsername(String username);
}
