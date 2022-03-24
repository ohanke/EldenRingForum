package com.oscarhanke.module.post.form;

public class UserForm {
    private String username;
    private String password;
    private String email;

    public UserForm(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserForm(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public UserForm() {

    }

    public String getUsername() {
        return username;
    }

    public UserForm setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserForm setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserForm setEmail(String email) {
        this.email = email;
        return this;
    }
}
