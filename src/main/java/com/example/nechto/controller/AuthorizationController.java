package com.example.nechto.controller;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import com.example.nechto.dto.UserPage;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface AuthorizationController {

//    @GetMapping("eto_nechto")
//    String login();

//    @PostMapping("eto_nechto")
//    ResponseEntity<UserPage> login(String str);

    @PostMapping("/eto_nechto/login")
    @ResponseStatus(HttpStatus.OK)
//    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:5173"})
    //TODO consider annotations @RequestBody @Valid
//    AuthorizationResponse signIn(@RequestBody @Valid AuthorizationRequest request);
    AuthorizationResponse signIn(@RequestBody AuthorizationRequest request);

}