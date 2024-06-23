package com.example.nechto.controller;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface AuthorizationController {

    @PostMapping("/eto_nechto/login")
    @ResponseStatus(HttpStatus.OK)
        //TODO consider annotations @RequestBody @Valid @CrossOrigin
//    @CrossOrigin(origins = {"http://localhost:8090", "http://localhost:5173"})
    AuthorizationResponse signIn(@RequestBody @Valid AuthorizationRequest request);

}