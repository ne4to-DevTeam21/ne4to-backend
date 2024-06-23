package com.example.nechto.controller;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import com.example.nechto.services.AuthorizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorizationControllerImpl implements AuthorizationController {

    private final AuthorizationService authorizationService;

    @Override
    public AuthorizationResponse signIn(AuthorizationRequest request) {
        return authorizationService.signIn(request);
    }

}