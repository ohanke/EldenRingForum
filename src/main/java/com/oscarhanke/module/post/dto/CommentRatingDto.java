package com.oscarhanke.module.post.dto;

import com.oscarhanke.module.post.repository.entity.CommentRatingStatus;

public class CommentRatingDto {
    private String author;
    private CommentRatingStatus status;

    public CommentRatingDto(String author, CommentRatingStatus status) {
        this.author = author;
        this.status = status;
    }

    public CommentRatingDto() {
    }

    public String getAuthor() {
        return author;
    }

    public CommentRatingDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public CommentRatingStatus getStatus() {
        return status;
    }

    public CommentRatingDto setStatus(CommentRatingStatus status) {
        this.status = status;
        return this;
    }
}
