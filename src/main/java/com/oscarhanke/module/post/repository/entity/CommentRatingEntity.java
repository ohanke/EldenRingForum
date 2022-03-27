package com.oscarhanke.module.post.repository.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "comment_rating")
public class CommentRatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private CommentRatingStatus status;
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private CommentEntity comment;

    public String getAuthor() {
        return author;
    }

    public CommentRatingEntity setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Long getId() {
        return id;
    }

    public CommentRatingEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public CommentRatingStatus getStatus() {
        return status;
    }

    public CommentRatingEntity setStatus(CommentRatingStatus status) {
        this.status = status;
        return this;
    }

    public CommentEntity getComment() {
        return comment;
    }

    public CommentRatingEntity setComment(CommentEntity comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentRatingEntity that = (CommentRatingEntity) o;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
