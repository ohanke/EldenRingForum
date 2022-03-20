package com.oscarhanke.module.post.dto;

import com.oscarhanke.module.post.repository.entity.CommentRatingStatus;

public class CommentRatingDto {
    private CommentRatingStatus status;

    public CommentRatingDto(CommentRatingStatus status) {
    }

    public CommentRatingDto() {
    }

    public CommentRatingStatus getStatus() {
        return status;
    }

    public CommentRatingDto setStatus(CommentRatingStatus status) {
        this.status = status;
        return this;
    }
}
