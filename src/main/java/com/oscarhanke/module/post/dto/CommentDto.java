package com.oscarhanke.module.post.dto;

public class CommentDto {
    private Long id;
    private String author;
    private String textArea;
    private int likes;
    private int dislikes;


    public CommentDto(Long id, String author, String textArea) {
        this.id = id;
        this.author = author;
        this.textArea = textArea;
    }

    public CommentDto(Long id, String author, String textArea, int likes, int dislikes) {
        this.id = id;
        this.author = author;
        this.textArea = textArea;
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

    public String getTextArea() {
        return textArea;
    }

    public CommentDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public CommentDto setTextArea(String textArea) {
        this.textArea = textArea;
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
