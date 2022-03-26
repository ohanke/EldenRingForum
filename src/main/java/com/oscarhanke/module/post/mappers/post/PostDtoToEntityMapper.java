package com.oscarhanke.module.post.mappers.post;

import com.oscarhanke.module.post.dto.PostDto;
import com.oscarhanke.module.post.repository.entity.PostEntity;

public class PostDtoToEntityMapper {
    public static PostEntity map(PostDto postDto){
        return new PostEntity()
                .setAuthor(postDto.getAuthor())
                .setTitle(postDto.getTitle())
                .setTextArea(postDto.getTextArea())
                .setUuid(postDto.getUuid());
    }
}
