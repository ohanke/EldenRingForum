package com.oscarhanke.module.post.mappers;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.repository.PostEntity;

import java.util.List;
import java.util.stream.Collectors;

public class PostMapper {

    public static PostDto map(PostEntity entity){
        return new PostDto(
                entity.getAuthor(),
                entity.getTitle(),
                entity.getContent(),
                entity.getUuid());
    }

    public static List<PostDto> map(List<PostEntity> entities){
        return entities
                .stream()
                .map(PostMapper::map)
                .collect(Collectors.toList());
    }
}
