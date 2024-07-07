package com.example.nechto.services;

import com.example.nechto.dto.NewUser;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Override
    public String addNewUser(NewUser newUser) {
        return "User added successfully";
    }

    @Override
    public String registrationService() {
        return "Это сервис регистрации. Введите свои данные";
    }

}
