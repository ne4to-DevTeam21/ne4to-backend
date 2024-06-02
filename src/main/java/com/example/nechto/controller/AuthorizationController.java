package com.example.nechto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface AuthorizationController {

    @GetMapping("eto_nechto/login")
    String login();

    @PostMapping("eto_nechto/login")
    ResponseEntity<String> login(String str);

}
