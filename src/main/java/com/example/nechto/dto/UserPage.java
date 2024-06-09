package com.example.nechto.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserPage {

    private String name;
    private String login;
    private List<String> platforms;
    
}
