package com.oscarhanke.module.post.controller;

import com.oscarhanke.module.post.dto.CommentRatingDto;
import com.oscarhanke.module.post.mappers.commentRating.CommentRatingDtoToEntityMapper;
import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.repository.entity.CommentRatingEntity;
import com.oscarhanke.module.post.repository.CommentRatingRepository;
import com.oscarhanke.module.post.repository.CommentRepository;
import com.oscarhanke.module.post.repository.entity.CommentRatingStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;

@Controller
public class CommentRatingController {

    @Autowired
    private CommentRatingRepository commentRatingRepository;
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/post/{uuid}/comment/{id}/rating/{status}")
    public String getRating(
            @PathVariable ("status") String status,
            @PathVariable ("id") Long commentId,
            Principal principal) {
        CommentRatingDto ratingDto = new CommentRatingDto(principal.getName(), CommentRatingStatus.valueOf(status));
        CommentEntity commentEntity = commentRepository.getById(commentId);
        CommentRatingEntity ratingEntity = CommentRatingDtoToEntityMapper.map(ratingDto, commentEntity);
        commentRatingRepository.save(ratingEntity);
        return "redirect:/post/{uuid}";
    }
}