package com.oscarhanke.module.post.mappers.post;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.mappers.comment.CommentEntityToDtoMapper;
import com.oscarhanke.module.post.repository.entity.PostEntity;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

public class PostEntityToDtoMapper {

    public static PostDto map(PostEntity entity, String principalName){
        return new PostDto(
                entity.getAuthor(),
                entity.getTitle(),
                entity.getTextArea(),
                entity.getUuid(),
                CommentEntityToDtoMapper.map(entity.getComments(), principalName));
    }

    public static List<PostDto> map(List<PostEntity> entities){
        return entities
                .stream()
                .map(postEntity -> map(postEntity, null))
                .collect(Collectors.toList());
    }
}
