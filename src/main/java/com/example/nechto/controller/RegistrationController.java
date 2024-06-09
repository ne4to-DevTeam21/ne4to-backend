package com.example.nechto.controller;

import com.example.nechto.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegistrationController {

    @GetMapping("/eto_nechto/registration")
    String register();

    @PostMapping("/eto_nechto/registration")
    ResponseEntity<String> register(@RequestBody User user);




}