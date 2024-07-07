package com.example.nechto.controller;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface AuthorizationController {

    @PostMapping("/eto_nechto/login")
    @ResponseStatus(HttpStatus.OK)
    AuthorizationResponse signIn(@RequestBody @Valid AuthorizationRequest request);

}