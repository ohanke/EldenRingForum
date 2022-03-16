package com.oscarhanke.module.post.mappers;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.repository.PostEntity;

public class PostDtoToEntityMapper {
    public static PostEntity map(PostDto postDto){
        return new PostEntity()
                .setAuthor(postDto.getAuthor())
                .setTitle(postDto.getTitle())
                .setContent(postDto.getContent())
                .setUuid(postDto.getUuid());
    }
}
