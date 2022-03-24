package com.oscarhanke.module.post.dto;

import com.oscarhanke.module.post.repository.entity.UserRoles;

import javax.persistence.Column;

public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String email;
    private UserRoles role;
    private boolean isLocked;

    public UserDto(String username, String password, String email, UserRoles role, boolean isLocked) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.isLocked = isLocked;
    }

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public UserDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserRoles getRole() {
        return role;
    }

    public UserDto setRole(UserRoles role) {
        this.role = role;
        return this;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public UserDto setLocked(boolean locked) {
        isLocked = locked;
        return this;
    }
}
