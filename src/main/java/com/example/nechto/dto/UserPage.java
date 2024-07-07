package com.example.nechto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class UserPage implements Serializable {

    private String name;
    private String login;
    private List<String> platforms;
    
}
