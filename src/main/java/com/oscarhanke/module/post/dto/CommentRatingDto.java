package com.oscarhanke.module.post.dto;

import com.oscarhanke.module.post.repository.RatingStatus;

public class CommentRatingDto {
    private RatingStatus status;

    public CommentRatingDto(RatingStatus status) {
        this.status = status;
    }

    public CommentRatingDto() {
    }

    public RatingStatus getStatus() {
        return status;
    }

    public CommentRatingDto setStatus(RatingStatus status) {
        this.status = status;
        return this;
    }
}
