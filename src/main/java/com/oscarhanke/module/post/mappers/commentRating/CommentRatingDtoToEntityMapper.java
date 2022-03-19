package com.oscarhanke.module.post.mappers.commentRating;

import com.oscarhanke.module.post.dto.CommentRatingDto;
import com.oscarhanke.module.post.repository.CommentEntity;
import com.oscarhanke.module.post.repository.CommentRatingEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CommentRatingDtoToEntityMapper {
    public static CommentRatingEntity map(CommentRatingDto ratingDto, CommentEntity commentEntity){
        return new CommentRatingEntity()
                .setStatus(ratingDto.getStatus())
                .setComment(commentEntity);
    }
}
