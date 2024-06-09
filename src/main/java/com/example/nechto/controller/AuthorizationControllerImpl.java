package com.example.nechto.controller;

import com.example.nechto.dto.UserPage;
import com.example.nechto.services.AuthorizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationControllerImpl implements AuthorizationController {

    private final AuthorizationService authorizationService;

    public AuthorizationControllerImpl(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }


    @Override
    public String login() {
        return authorizationService.authorization();
    }

    @Override
    public ResponseEntity<UserPage> login(String str) {
        return null;
    }
}
