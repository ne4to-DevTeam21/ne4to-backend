package com.example.nechto.services;

import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public boolean checkLogin() {
        return false;
    }

    @Override
    public boolean checkPhone() {
        return false;
    }

    @Override
    public String addNewUser() {
        return "User added successfully";
    }

    @Override
    public void joinToThePlatform(String platformName, String userPlatformNick, int personalCode) {

    }

    @Override
    public String registrationService() {
        return "Это сервис регистрации. Введите свои данные";
    }
}
