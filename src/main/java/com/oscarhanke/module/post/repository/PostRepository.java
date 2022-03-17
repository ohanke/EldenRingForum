package com.oscarhanke.module.post.repository;

import com.oscarhanke.module.post.dto.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostRepository extends JpaRepository<PostEntity, Long>, JpaSpecificationExecutor<PostEntity> {
    PostEntity findOneByUuid(String Uuid);
}
