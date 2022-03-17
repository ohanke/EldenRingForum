package com.oscarhanke.module.post.form;

public class CommentForm {
    private String author;
    private String content;

    public String getAuthor() {
        return author;
    }

    public CommentForm setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getContent() {
        return content;
    }

    public CommentForm setContent(String content) {
        this.content = content;
        return this;
    }
}
