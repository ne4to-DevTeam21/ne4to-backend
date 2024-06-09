package com.example.nechto.services;

import com.example.nechto.dto.User;
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
public class UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

//    @Override
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
//    @Override
    public UserEntity save(UserEntity user) {
        return repository.saveAndFlush(user);
    }

    /**
     * Создание пользователя
     *
     * @return созданный пользователь
     */
//    @Override
    public UserEntity create(UserEntity user) {
        if (repository.existsByLogin(user.getLogin())) {
            // Заменить на свои исключения
            throw new RuntimeException("Пользователь с таким логином уже существует");
        }

        if (repository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Пользователь с таким email уже существует");
        }

        return save(user);
    }

    public User findById(Long id) {
        UserEntity entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c id " + id + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

    /**
     * Получение пользователя по нику пользователя
     *
     * @return пользователь
     */
//    @Override
    public User findByLogin(String login) {
        UserEntity entity = repository.findByLogin(login)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c " + login + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

    /**
     * Получение пользователя по имени пользователя
     *
     * @return пользователь
     */
//    @Override
    public User findByName(String name) {
        UserEntity entity = repository.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c " + name + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

    public User findByEmail(String email) {
        UserEntity entity = repository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c " + email + " не найден"));
        User dto = mapper.map(entity);
        return dto;
    }

//    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

//    @Override
    public UserEntity editUser(UserEntity userEntity) {
        return repository.saveAndFlush(userEntity);
    }

    public Boolean checkPassword(String email, String password) {
        UserEntity entity = repository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Пользователь c " + email + " не найден"));
        if (entity != null && entity.getPassword().equals(password)) {
            return true;
        }
        return  false;
    }

}
