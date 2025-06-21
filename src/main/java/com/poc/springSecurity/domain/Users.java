package com.poc.springSecurity.domain;

import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "USERS")
public class Users {
    @Id
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
