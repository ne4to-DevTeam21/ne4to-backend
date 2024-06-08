package com.example.nechto.services;

import com.example.nechto.dto.User;
import com.example.nechto.mapper.UserMapper;
import com.example.nechto.model.UserEntity;
import com.example.nechto.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

//    @Override
    @Transactional
    public List<User> findAll() {
        var list = repository.findAll();
        var result = list.stream()
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

    /**
     * Получение пользователя по нику пользователя
     *
     * @return пользователь
     */
//    @Override
    public UserEntity findByLogin(String login) {
        return repository.findByLogin(login)
                .orElseThrow(() -> new RuntimeException("Пользователь c таким логином не найден"));
    }

    /**
     * Получение пользователя по имени пользователя
     *
     * @return пользователь
     */
//    @Override
    public UserEntity findByName(String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Пользователь c таким именем не найден"));
    }

    public UserEntity findByEmail(String email) {
        return repository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Пользователь c таким именем не найден"));
    }

//    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

//    @Override
    public UserEntity editUser(UserEntity userEntity) {
        return repository.saveAndFlush(userEntity);
    }

}
