package com.example.nechto.controller;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import com.example.nechto.dto.UserPage;
import com.example.nechto.services.AuthorizationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorizationControllerImpl implements AuthorizationController {

    private final AuthorizationService authorizationService;

//    @Override
//    public String login() {
//        return authorizationService.authorization();
//    }

    @Override
    public AuthorizationResponse signIn(AuthorizationRequest request) {
        return authorizationService.signIn(request);
    }

//    @Override
//    public ResponseEntity<UserPage> login(String str) {
//        return null;
//    }

}