package com.example.nechto.dto;

import lombok.Data;

import java.util.List;

@Data
public class PlatformPage {

    private String name;
    private String login;
    private String role;
    private Rating rating;
    private List<String> options;
    
}
