package com.example.nechto.services;

import com.example.nechto.dto.AuthorizationRequest;
import com.example.nechto.dto.AuthorizationResponse;
import com.example.nechto.exception.AuthorizationException;
import com.example.nechto.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorizationServiceImpl implements AuthorizationService {

    private final UserService userService;
    private final UserPlatformService userPlatformService;

    /**
     * Аутентификация пользователя
     *
     * @param request данные пользователя
     * @return токен
     */
    @Override
    public AuthorizationResponse signIn(AuthorizationRequest request) {
        UserEntity entity = userService.findByLoginOrEmail(request.getLogin());

        String accessToken = null;
        String refreshToken = null;
        if (entity.getPassword().equals(request.getPassword())) {
            accessToken = "your_access_token";
            refreshToken = "your_refresh_token";
        } else {
            throw new AuthorizationException("Неправильный логин или пароль");
        }

        String login = entity.getLogin();
        String name = entity.getName();
        List<String> platforms = userPlatformService.getUserPlatforms(entity.getId());

        return new AuthorizationResponse(accessToken, refreshToken, login, name, platforms);
    }

}
