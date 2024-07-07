package com.example.nechto.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthorizationRequest {

    @Size(min = 5, max = 50, message = "Логин/email пользователя должно содержать от 5 до 50 символов")
    @NotBlank(message = "Логин/email пользователя не может быть пустыми")
    private String login;

    @Size(min = 8, max = 255, message = "Длина пароля должна быть от 8 до 255 символов")
    @NotBlank(message = "Пароль не может быть пустым")
    private String password;

}
