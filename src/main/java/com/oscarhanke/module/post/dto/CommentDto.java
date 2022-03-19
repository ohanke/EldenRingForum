package com.oscarhanke.module.post.dto;

import java.util.List;

public class CommentDto {
    private Long id;
    private String author;
    private String content;
    private int likes;
    private int dislikes;


    public CommentDto(Long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public CommentDto(Long id, String author, String content, int likes, int dislikes) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.likes = likes;
        this.dislikes = dislikes;
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

    public String getContent() {
        return content;
    }

    public CommentDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public CommentDto setContent(String content) {
        this.content = content;
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
