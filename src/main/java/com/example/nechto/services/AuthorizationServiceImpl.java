package com.example.nechto.services;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import com.example.nechto.dto.User;
import com.example.nechto.exception.ResourceNotFoundException;
import com.example.nechto.mapper.UserMapper;
import com.example.nechto.model.UserEntity;
import com.example.nechto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorizationServiceImpl implements AuthorizationService {

    private final UserService userService;

//    private final AuthenticationManager authenticationManager;

    @Override
    public String authorization() {
        return "Это сервис авторизации. Введите логин и пароль";
    }

    /**
     * Аутентификация пользователя
     *
     * @param request данные пользователя
     * @return токен
     */
    @Override
    public AuthorizationResponse signIn(AuthorizationRequest request) {
//        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                request.getEmail(),
//                request.getPassword()
//        ));

        String jwt = null;

        if (userService.checkLoginPassword(request.getEmail(), request.getPassword())) {
            jwt = "this_your_jwt_token";
        } else {
            throw new ResourceNotFoundException("Неправильный логин или пароль");
        }

//        var jwt = jwtService.generateToken(user);

        return new AuthorizationResponse(jwt);
    }

}
