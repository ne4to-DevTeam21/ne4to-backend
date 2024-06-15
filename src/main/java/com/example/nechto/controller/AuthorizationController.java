package com.example.nechto.controller;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import com.example.nechto.dto.UserPage;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthorizationController {

//    @GetMapping("eto_nechto")
//    String login();

//    @PostMapping("eto_nechto")
//    ResponseEntity<UserPage> login(String str);

    @PostMapping("/eto_nechto")
    AuthorizationResponse signIn(@RequestBody @Valid AuthorizationRequest request);

}