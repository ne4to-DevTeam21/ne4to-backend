package com.example.nechto.services;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;

public interface AuthorizationService {

    AuthorizationResponse signIn(AuthorizationRequest request);

}
