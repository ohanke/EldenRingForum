package com.oscarhanke.module.post.mappers.commentRating;

import com.oscarhanke.module.post.dto.CommentRatingDto;
import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.repository.entity.CommentRatingEntity;

import java.security.Principal;

public class CommentRatingDtoToEntityMapper {
    public static CommentRatingEntity map(CommentRatingDto ratingDto, CommentEntity commentEntity){
        return new CommentRatingEntity()
                .setAuthor(ratingDto.getAuthor())
                .setStatus(ratingDto.getStatus())
                .setComment(commentEntity);
    }
}
