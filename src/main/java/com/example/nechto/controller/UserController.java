package com.example.nechto.controller;

import com.example.nechto.dto.User;
import com.example.nechto.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("eto_nechto")
@RestController
public class UserController {
    private final UserService service;

    @GetMapping("users")
    public List<User> findAll() {
        return service.findAll();
    }
}
