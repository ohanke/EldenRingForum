package com.oscarhanke.module.post.dto;

public class CommentDto {
    private String author;
    private String content;

    public CommentDto(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
