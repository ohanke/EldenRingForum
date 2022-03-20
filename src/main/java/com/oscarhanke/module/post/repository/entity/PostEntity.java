package com.oscarhanke.module.post.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "post")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;
    private String content;
    private String uuid;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CommentEntity> comments;

    public Long getId() {
        return id;
    }

    public PostEntity setId(Long id) {
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

    public PostEntity setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public PostEntity setComments(List<CommentEntity> comments) {
        this.comments = comments;
        return this;
    }
}



