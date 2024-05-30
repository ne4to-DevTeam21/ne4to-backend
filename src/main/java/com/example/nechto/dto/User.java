package com.example.nechto.dto;


import static java.util.UUID.randomUUID;

public class User {

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

    public String getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
