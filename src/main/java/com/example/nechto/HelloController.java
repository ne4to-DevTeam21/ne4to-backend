package com.example.nechto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/nechto_scoring")
    public String hello() {
        return "Hello, world";
    }
}
