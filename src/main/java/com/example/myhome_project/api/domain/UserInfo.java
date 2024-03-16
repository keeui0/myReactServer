package com.example.myhome_project.api.domain;

import lombok.Data;

@Data
public class UserInfo {
    private String id;
    private String name;
    private String email;

    public UserInfo(String name, String email) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
