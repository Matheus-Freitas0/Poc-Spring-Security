package com.poc.springSecurity.domain;

import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "USERS")
public class Users {
    @Id
    private Long username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }
}
