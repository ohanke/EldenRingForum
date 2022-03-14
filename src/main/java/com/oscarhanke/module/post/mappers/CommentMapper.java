package com.oscarhanke.module.post.mappers;

import com.oscarhanke.module.post.dto.CommentDto;
import com.oscarhanke.module.post.repository.CommentEntity;
import com.oscarhanke.module.post.repository.PostEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CommentMapper {
    public static List<CommentDto> map(List<CommentEntity> entities){
        return entities.stream()
                .map(CommentMapper::map)
                .collect(Collectors.toList());
    }

    public static CommentDto map(CommentEntity entity){
        return new CommentDto(
                entity.getAuthor(),
                entity.getContent()
        );
    }
}
