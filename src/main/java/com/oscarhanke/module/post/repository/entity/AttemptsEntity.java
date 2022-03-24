package com.oscarhanke.module.post.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attemps")
public class AttemptsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private int attempts;

    public int getId() {
        return id;
    }

    public AttemptsEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getAttempts() {
        return attempts;
    }

    public AttemptsEntity setAttempts(int attempts) {
        this.attempts = attempts;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public AttemptsEntity setUsername(String username) {
        this.username = username;
        return this;
    }
}
