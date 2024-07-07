package com.example.nechto.services;

import com.example.nechto.dto.User;
import com.example.nechto.exception.AuthorizationException;
import com.example.nechto.exception.ResourceAlreadyExistsException;
import com.example.nechto.exception.ResourceNotFoundException;
import com.example.nechto.mapper.UserMapper;
import com.example.nechto.model.UserEntity;
import com.example.nechto.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Transactional
    public List<User> findAll() {
        List<UserEntity> list = repository.findAll();
        List<User> result = list.stream()
                .map(mapper::map)
                .toList();
        return result;
    }

    /**
     * Сохранение пользователя
     *
     * @return сохраненный пользователь
     */
    public UserEntity save(UserEntity user) {
        return repository.saveAndFlush(user);
    }

    /**
     * Создание пользователя
     *
     * @return созданный пользователь
     */
    public UserEntity create(User user) {
        if (repository.existsByLogin(user.getLogin())) {
            throw new ResourceAlreadyExistsException("Пользователь " + user.getLogin() + " уже существует");
        }

        if (repository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Пользователь " + user.getEmail() + " уже существует");
        }

        UserEntity entity = mapper.map(user);

        return save(entity);
    }

    public User findById(String id) {
        UserEntity entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c id " + id + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

    /**
     * Получение пользователя по логину пользователя
     *
     * @return пользователь
     */
    public User findByLogin(String login) {
        UserEntity entity = repository.findByLogin(login)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c логином " + login + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

    public User findByEmail(String email) {
        UserEntity entity = repository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c email " + email + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

    @Override
    public UserEntity findByLoginOrEmail(String login) {
        UserEntity entity = repository.findAllByLoginOrEmail(login, login)
                .stream()
                .findFirst()
                .orElseThrow(() -> new AuthorizationException("Неправильный логин или пароль"));
        return entity;
    }

}
