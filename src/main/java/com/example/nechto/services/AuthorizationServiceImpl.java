package com.example.nechto.services;

import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    @Override
    public String authorization() {
        return "Это сервис авторизации. Введите логин и пароль";
    }
}
