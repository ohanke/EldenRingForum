package com.oscarhanke.module.post.repository;

import com.oscarhanke.module.post.repository.entity.AttemptsEntity;
import com.oscarhanke.module.post.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttemptsRepository extends JpaRepository<AttemptsEntity, Integer> {
    Optional<UserEntity> findAttemptsEntitiesByUsername(String username);
}
