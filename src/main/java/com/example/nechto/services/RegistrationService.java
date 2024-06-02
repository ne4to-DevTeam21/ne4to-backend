package com.example.nechto.services;

import org.springframework.stereotype.Service;


public interface RegistrationService {
    boolean checkLogin();
    boolean checkPhone();
    String addNewUser();
    void joinToThePlatform(String platformName, String userPlatformNick, int personalCode);
    String registrationService();


};
