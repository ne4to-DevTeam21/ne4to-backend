package com.example.nechto.services;

import com.example.nechto.dto.UserData;
import com.example.nechto.dto.UserJwt;

public interface JwtService {

    UserJwt generateToken(UserData userData);

}
