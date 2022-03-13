package com.oscarhanke.module.post.dto;

public class PostDto {
    private final String author;
    private final String title;
    private final String content;
    private final String uuid;

    public PostDto(String author, String title, String content, String uuid) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.uuid = uuid;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}