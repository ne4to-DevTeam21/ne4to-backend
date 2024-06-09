package com.example.nechto.controller;

import com.example.nechto.dto.User;
import com.example.nechto.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/eto_nechto")
@RestController
public class UserController {
    private final UserService service;

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<List<User>> index() {
        List<User> users = service.findAll();
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(users.size()))
                .body(users);
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    User show(@PathVariable Long id) {
        return service.findById(id);
    }
}
