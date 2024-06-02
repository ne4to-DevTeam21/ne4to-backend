package com.example.nechto.services;

import org.springframework.stereotype.Service;

@Service
public class EtoNechtoServiceImpl implements EtoNechtoService {


    @Override
    public String etoNechto() {
        return "Hello, my name is TheThing";
    }
}
