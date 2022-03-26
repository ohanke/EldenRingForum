package com.oscarhanke.module.post.form;

public class CommentForm {
    private String author;
    private String textArea;

    public String getAuthor() {
        return author;
    }

    public CommentForm setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTextArea() {
        return textArea;
    }

    public CommentForm setTextArea(String textArea) {
        this.textArea = textArea;
        return this;
    }
}
