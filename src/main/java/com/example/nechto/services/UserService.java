package com.example.nechto.services;

import com.example.nechto.model.UserDAO;
import com.example.nechto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

//    @Override
    public List<UserDAO> findAll() {
        return repository.findAll();
    }

    /**
     * Сохранение пользователя
     *
     * @return сохраненный пользователь
     */
//    @Override
    public UserDAO save(UserDAO user) {
        return repository.saveAndFlush(user);
    }

    /**
     * Создание пользователя
     *
     * @return созданный пользователь
     */
//    @Override
    public UserDAO create(UserDAO user) {
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
    public UserDAO findByLogin(String login) {
        return repository.findByLogin(login)
                .orElseThrow(() -> new RuntimeException("Пользователь c таким логином не найден"));
    }

    /**
     * Получение пользователя по имени пользователя
     *
     * @return пользователь
     */
//    @Override
    public UserDAO findByName(String name) {
        return repository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Пользователь c таким именем не найден"));
    }

    public UserDAO findByEmail(String email) {
        return repository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Пользователь c таким именем не найден"));
    }

//    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

//    @Override
    public UserDAO editUser(UserDAO userDAO) {
        return repository.saveAndFlush(userDAO);
    }

}
