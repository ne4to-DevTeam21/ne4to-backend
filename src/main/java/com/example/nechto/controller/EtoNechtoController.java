package com.example.nechto.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface EtoNechtoController {

    @GetMapping("/eto_nechto")
    String helloNechto();
}
