package com.oscarhanke.module.post.dto;

import java.util.List;
import java.util.UUID;

public class PostDto {
    private final String author;
    private final String title;
    private final String textArea;
    private final String uuid;
    private List<CommentDto> comments;

    public PostDto(String author, String title, String textArea, String uuid, List<CommentDto> comments) {
        this.author = author;
        this.title = title;
        this.textArea = textArea;
        this.uuid = uuid;
        this.comments = comments;
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