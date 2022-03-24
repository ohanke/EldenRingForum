package com.oscarhanke.module.post.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRoles role;
    @Column(name = "is_locked")
    private boolean isLocked;

    public UserEntity() {
    }

    public UserEntity(String username, String password, String email, UserRoles role, boolean isLocked) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.isLocked = isLocked;
    }

    public Long getId() {
        return id;
    }

    public UserEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserRoles getRole() {
        return role;
    }

    public UserEntity setRole(UserRoles role) {
        this.role = role;
        return this;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public UserEntity setLocked(boolean locked) {
        isLocked = locked;
        return this;
    }
}
