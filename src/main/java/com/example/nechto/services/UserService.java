package com.example.nechto.services;

import com.example.nechto.model.UserEntity;

public interface UserService {

    UserEntity findByLoginOrEmail(String login);

}
