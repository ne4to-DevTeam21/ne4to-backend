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
    private String login;
    private String name;
    private String password;
    private String email;

    public User(String login, String name, String password, String phone) {
        id = randomUUID().toString();
        this.login = login;
        this.name = name;
        this.password = password;
        this.email = phone;
    }

}
