package com.example.nechto.dto;

import lombok.Data;
import java.util.List;

@Data
public class UserPlatform {

    private String login;
    private List<String> platforms;
    private Long status_code;

}
