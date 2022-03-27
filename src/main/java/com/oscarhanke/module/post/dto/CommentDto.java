package com.oscarhanke.module.post.dto;

import java.util.Set;

public class CommentDto {
    private Long id;
    private String author;
    private String textArea;
    private int likes;
    private int dislikes;
    private Set<String> ratingAuthors;
    private boolean commentedByPrincipal;
    private boolean isPrincipalAuthor;

    public CommentDto(Long id, String author, String textArea) {
        this.id = id;
        this.author = author;
        this.textArea = textArea;
    }

    public CommentDto(
            Long id,
            String author,
            String textArea,
            int likes,
            int dislikes,
            Set<String> ratingAuthors,
            boolean commentedByPrincipal,
            boolean isPrincipalAuthor) {
        this.id = id;
        this.author = author;
        this.textArea = textArea;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ratingAuthors = ratingAuthors;
        this.commentedByPrincipal = commentedByPrincipal;
        this.isPrincipalAuthor = isPrincipalAuthor;
    }

    public boolean isCommentedByPrincipal() {
        return commentedByPrincipal;
    }

    public CommentDto setCommentedByPrincipal(boolean commentedByPrincipal) {
        this.commentedByPrincipal = commentedByPrincipal;
        return this;
    }

    public boolean isPrincipalAuthor() {
        return isPrincipalAuthor;
    }

    public CommentDto setPrincipalAuthor(boolean principalAuthor) {
        isPrincipalAuthor = principalAuthor;
        return this;
    }

    public Set<String> getRatingAuthors() {
        return ratingAuthors;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public String getAuthor() {
        return author;
    }

    public String getTextArea() {
        return textArea;
    }

    public CommentDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public CommentDto setTextArea(String textArea) {
        this.textArea = textArea;
        return this;
    }

    public Long getId() {
        return id;
    }

    public CommentDto setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
