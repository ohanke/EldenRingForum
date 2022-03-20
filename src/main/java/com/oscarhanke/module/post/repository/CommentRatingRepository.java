package com.oscarhanke.module.post.repository;

import com.oscarhanke.module.post.repository.entity.CommentRatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommentRatingRepository extends JpaRepository<CommentRatingEntity, Long>, JpaSpecificationExecutor<CommentRatingEntity> {
}
