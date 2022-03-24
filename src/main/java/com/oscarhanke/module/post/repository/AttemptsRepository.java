package com.oscarhanke.module.post.repository;

import com.oscarhanke.module.post.repository.entity.AttemptsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttemptsRepository extends JpaRepository<AttemptsEntity, Integer> {
    Optional<AttemptsEntity> findAttemptsEntityByUsername(String username);
}
