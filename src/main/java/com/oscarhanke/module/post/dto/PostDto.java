package com.oscarhanke.module.post.dto;

import java.util.List;
import java.util.UUID;

public class PostDto {
    private final String author;
    private final String title;
    private final String textArea;
    private final String uuid;
    private List<CommentDto> comments;
    private boolean isPrincipalAuthor;

    public PostDto(String author, String title, String textArea, String uuid, List<CommentDto> comments, boolean isPrincipalAuthor) {
        this.author = author;
        this.title = title;
        this.textArea = textArea;
        this.uuid = uuid;
        this.comments = comments;
        this.isPrincipalAuthor = isPrincipalAuthor;
    }

    public PostDto(String author, String title, String textArea) {
        this.author = author;
        this.title = title;
        this.textArea = textArea;
        this.uuid = UUID.randomUUID().toString();
        this.comments = null;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getTextArea() {
        return textArea;
    }

    public String getUuid() {
        return uuid;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public PostDto setComments(List<CommentDto> comments) {
        this.comments = comments;
        return this;
    }

    public boolean isPrincipalAuthor() {
        return isPrincipalAuthor;
    }

    public PostDto setPrincipalAuthor(boolean principalAuthor) {
        isPrincipalAuthor = principalAuthor;
        return this;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", textArea='" + textArea + '\'' +
                ", uuid='" + uuid + '\'' +
                ", comments=" + comments +
                '}';
    }
}