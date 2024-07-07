package com.example.nechto.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import static java.util.UUID.randomUUID;

@Setter
@Getter
public class UserData {

    @Setter(AccessLevel.NONE)
    private String id;
    private String login;
    private String userName;
    private String password;
    private String email;


    public UserData(NewUser newUser) {
        this.id = randomUUID().toString();
        this.login = newUser.getLogin();
        this.userName = newUser.getName();
        this.password = newUser.getPassword();
        this.email = newUser.getEmail();
    }



}
