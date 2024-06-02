package com.example.nechto.controller;

import com.example.nechto.services.EtoNechtoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtoNechtoControllerImpl implements EtoNechtoController {

    private final EtoNechtoService etoNechtoService;

    public EtoNechtoControllerImpl(EtoNechtoService etoNechtoService) {
        this.etoNechtoService = etoNechtoService;
    }

    @Override
    public String helloNechto() {
        return etoNechtoService.etoNechto();
    }
}
