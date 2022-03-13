package com.oscarhanke.module.post.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String title;
    private String content;
    private String uuid;

    public PostEntity() {
        this.uuid = UUID.randomUUID().toString();
    }

    public Integer getId() {
        return id;
    }

    public PostEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public PostEntity setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PostEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PostEntity setContent(String content) {
        this.content = content;
        return this;
    }

    public String getUuid() {
        return uuid;
    }
}



