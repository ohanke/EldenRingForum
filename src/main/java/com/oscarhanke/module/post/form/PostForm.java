package com.oscarhanke.module.post.form;

public class PostForm {
    private String author;
    private String title;
    private String textArea;

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

    public String getTextArea() {
        return textArea;
    }

    public PostForm setTextArea(String textArea) {
        this.textArea = textArea;
        return this;
    }
}
