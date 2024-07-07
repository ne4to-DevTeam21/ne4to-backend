package com.example.nechto.controller;

import com.example.nechto.dto.NewUser;
import com.example.nechto.dto.UserPage;
import com.example.nechto.services.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationControllerImpl implements RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationControllerImpl(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @Override
    public String register() {

        return registrationService.registrationService();
    }

    @Override
    public ResponseEntity<UserPage> register(NewUser user) {
        return null;
    }
}
