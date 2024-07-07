package com.example.nechto.dto;

import lombok.*;

@Data
public class UserJwt {

    private final String type = "Bearer";
    private String accessToken;
    private String refreshToken;

}
