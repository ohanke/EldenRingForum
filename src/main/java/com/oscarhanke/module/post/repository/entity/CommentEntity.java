package com.oscarhanke.module.post.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    @Column(name = "text_area")
    private String textArea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private PostEntity post;

    @OneToMany(mappedBy = "comment", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CommentRatingEntity> ratings;

    public List<CommentRatingEntity> getRatings() {
        return ratings;
    }

    public CommentEntity setRatings(List<CommentRatingEntity> ratings) {
        this.ratings = ratings;
        return this;
    }

    public Long getId() {
        return id;
    }

    public CommentEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public CommentEntity setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTextArea() {
        return textArea;
    }

    public CommentEntity setTextArea(String content) {
        this.textArea = content;
        return this;
    }

    public PostEntity getPost() {
        return post;
    }

    public CommentEntity setPost(PostEntity post) {
        this.post = post;
        return this;
    }

    public int getLikes(){
        return ratings.stream().filter(r -> r.getStatus().equals(CommentRatingStatus.LIKE)).collect(Collectors.toSet()).size();
    }

    public int getDislikes(){
        return ratings.stream().filter(r -> r.getStatus().equals(CommentRatingStatus.DISLIKE)).collect(Collectors.toSet()).size();
    }

    public Set<String> getRatingAuthors(){
        return ratings.stream().map(CommentRatingEntity::getAuthor).collect(Collectors.toSet());
    }
}
