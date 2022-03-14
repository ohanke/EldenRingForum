package com.oscarhanke.module.post.form;

public class PostForm {
    private String author;
    private String title;
    private String content;

    public String getAuthor() {
        return author;
    }

    public PostForm setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PostForm setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PostForm setContent(String content) {
        this.content = content;
        return this;
    }
}
