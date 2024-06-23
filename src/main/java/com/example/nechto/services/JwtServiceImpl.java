package com.example.nechto.services;

import com.example.nechto.dto.UserData;
import com.example.nechto.dto.UserJwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@Getter
public class JwtServiceImpl implements JwtService {

    private final String jwtAccessKey = RandomStringUtils.randomAlphabetic(256);
    private final String jwtRefreshKey = RandomStringUtils.randomAlphabetic(256);

    /**
     * Генерация токена
     *
     * @param userData данные пользователя
     * @return токен
     */
    @Override
    public UserJwt generateToken(UserData userData) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", userData.getId());
        claims.put("email", userData.getEmail());

        return generateToken(claims, userData);
    }

    /**
     * Генерация токена
     *
     * @param extraClaims дополнительные данные
     * @param userData данные пользователя
     * @return токен
     */
    private UserJwt generateToken(Map<String, Object> extraClaims, UserData userData) {
        UserJwt userJwt = new UserJwt();
        String accessToken = Jwts.builder().setClaims(extraClaims).setSubject(userData.getUserName())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(Date.from(LocalDateTime.now().plusMinutes(30)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(getSigningKey(jwtAccessKey), SignatureAlgorithm.HS256).compact();

        String refreshToken = Jwts.builder().setClaims(extraClaims).setSubject(userData.getUserName())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(Date.from(LocalDateTime.now().plusDays(30)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(getSigningKey(jwtAccessKey), SignatureAlgorithm.HS256).compact();
        userJwt.setAccessToken(accessToken);
        userJwt.setRefreshToken(refreshToken);
        return userJwt;
    }


    /**
     * Получение ключа для подписи токена
     *
     * @return ключ
     */
    private SecretKey getSigningKey(String jwtKey) {
        byte[] keyBytes = Decoders.BASE64.decode(jwtKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}


