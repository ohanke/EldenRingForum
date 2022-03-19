package com.oscarhanke.module.post.mappers.comment;

import com.oscarhanke.module.post.dto.CommentDto;
import com.oscarhanke.module.post.mappers.commentRating.CommentRatingEntityToDtoMapper;
import com.oscarhanke.module.post.repository.CommentEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CommentEntityToDtoMapper {
    public static List<CommentDto> map(List<CommentEntity> entities){
        return entities
                .stream()
                .map(CommentEntityToDtoMapper::map)
                .collect(Collectors.toList());
    }

    public static CommentDto map(CommentEntity entity){
        return new CommentDto(
                entity.getId(),
                entity.getAuthor(),
                entity.getContent(),
                entity.getLikes(),
                entity.getDislikes()
        );
    }
}
