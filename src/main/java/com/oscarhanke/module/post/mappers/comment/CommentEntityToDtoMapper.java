package com.oscarhanke.module.post.mappers.comment;

import com.oscarhanke.module.post.dto.CommentDto;
import com.oscarhanke.module.post.repository.entity.CommentEntity;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

public class CommentEntityToDtoMapper {
    public static List<CommentDto> map(List<CommentEntity> entities, String principalName){
        return entities
                .stream()
                .map(commentEntity -> map(commentEntity, principalName))
                .collect(Collectors.toList());
    }

    public static CommentDto map(CommentEntity entity, String principalName){
        return new CommentDto(
                entity.getId(),
                entity.getAuthor(),
                entity.getTextArea(),
                entity.getLikes(),
                entity.getDislikes(),
                entity.getRatingAuthors(),
                entity.getRatingAuthors().contains(principalName),
                entity.getAuthor().equals(principalName)
        );
    }
}
