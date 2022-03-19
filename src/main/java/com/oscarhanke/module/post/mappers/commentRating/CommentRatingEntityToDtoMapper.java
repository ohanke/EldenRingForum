package com.oscarhanke.module.post.mappers.commentRating;

import com.oscarhanke.module.post.dto.CommentRatingDto;
import com.oscarhanke.module.post.repository.CommentRatingEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CommentRatingEntityToDtoMapper {

    public static List<CommentRatingDto> map(List<CommentRatingEntity> entities){
        return entities
                .stream()
                .map(CommentRatingEntityToDtoMapper::map)
                .collect(Collectors.toList());
    }

    public static CommentRatingDto map(CommentRatingEntity entity){
        return new CommentRatingDto()
                .setStatus(entity.getStatus());
    }
}
