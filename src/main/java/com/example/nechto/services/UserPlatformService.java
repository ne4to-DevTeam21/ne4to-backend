package com.example.nechto.services;

import com.example.nechto.dto.UserPlatform;
import com.example.nechto.exception.ResourceNotFoundException;
import com.example.nechto.model.UserEntity;
import com.example.nechto.model.UserPlatformEntity;
import com.example.nechto.repository.PlatformRepository;
import com.example.nechto.repository.UserPlatformRepository;
import com.example.nechto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserPlatformService {

    private final UserPlatformRepository repository;

    private final UserRepository userRepository;

    private final PlatformRepository platformRepository;

    //    @Override
    public UserPlatformEntity save(UserPlatformEntity entity) {
        return repository.saveAndFlush(entity);
    }

    /**
     * Создание пользователя
     *
     * @return созданный пользователь
     */
//    @Override
//    public UserPlatformEntity create(UserPlatform dto) {
//        if (!userRepository.existsByLogin(dto.getLogin())) {
//            throw new ResourceNotFoundException("Пользователь не существует");
//        }
//
//        for (Platform platform : platformRepository.findAll()) {}
//        if (!platformRepository.existsByName(dto.getPlatforms()) {
//            throw new ResourceNotFoundException("Платформа не существует");
//        }
//
//        UserPlatformEntity entity = new UserPlatformEntity();
//        entity.setUserId(userId);
//        entity.setPlatformId(platformId);
//        entity.
//
//        return save(user);
//    }


}
