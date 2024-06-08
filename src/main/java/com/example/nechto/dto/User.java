package com.example.nechto.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import static java.util.UUID.randomUUID;

@Getter
@Setter
public class User {

    @Setter(AccessLevel.NONE)
    private String id;
    private Long userId;
    private String login;
    private String name;
    private String password;
    private String confirmPassword;
    private String email;

    public User(String login, String name, String password, String confirmPassword, String email) {
        id = randomUUID().toString();
        this.login = login;
        this.name = name;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
    }

}
