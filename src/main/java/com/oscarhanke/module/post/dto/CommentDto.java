package com.oscarhanke.module.post.dto;

public class CommentDto {
    private Long id;
    private String author;
    private String content;

    public CommentDto(Long id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
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
