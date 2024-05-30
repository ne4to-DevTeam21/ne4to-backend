package com.example.nechto.services;

import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {
    boolean checkLogin();
    boolean checkPhone();
    void addNewUser();
    void joinToThePlatform(String platformName, String userPlatformNick, int personalCode);


};
