package com.example.nechto.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    @Setter(AccessLevel.NONE)
    private String id;
    private String login;
    private String name;
    private String password;
    private String email;

    public User(String id, String login, String name, String password, String email) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.email = email;
    }

}
