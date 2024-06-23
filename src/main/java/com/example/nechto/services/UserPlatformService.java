package com.example.nechto.services;

import com.example.nechto.model.PlatformEntity;
import com.example.nechto.model.UserPlatformEntity;
import com.example.nechto.repository.PlatformRepository;
import com.example.nechto.repository.UserPlatformRepository;
import com.example.nechto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserPlatformService {

    private final UserPlatformRepository repository;
    private final PlatformRepository platformRepository;

    public List<String> getUserPlatforms(Long userId) {
        List<Long> list = repository.findAllByUserId(userId)
                .stream()
                .map(UserPlatformEntity::getPlatformId)
                .distinct()
                .toList();

        List<String> platformNames = new ArrayList<>();
        list.forEach(id -> platformNames.add(platformRepository.findById(id).get().getName()));

        return platformNames;
    }

}
