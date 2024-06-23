package com.example.nechto.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class NewUser implements Serializable {

    private String login;
    private String name;
    private String password;
    private String confirmPassword;
    private String email;

    public NewUser(String login,
                   String name,
                   String password,
                   String confirmPassword,
                   String email) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
    }

}
