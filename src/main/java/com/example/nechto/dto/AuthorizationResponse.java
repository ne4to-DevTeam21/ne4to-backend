package com.example.nechto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Schema(description = "Ответ c токеном доступа")
public class AuthorizationResponse {

//    private final String type = "Bearer";
    private String accessToken;
    private String refreshToken;
    private String login;
    private String name;
    List<String> platforms;

}
