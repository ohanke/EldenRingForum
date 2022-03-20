package com.oscarhanke.module.post.repository;

import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.repository.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommentRepository extends JpaRepository<CommentEntity, Long>, JpaSpecificationExecutor<PostEntity> {
}
