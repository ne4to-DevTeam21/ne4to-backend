package com.example.nechto.repository;

import com.example.nechto.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

    Optional<UserEntity> findByLogin(String login);
    Optional<UserEntity> findByEmail(String email);
    boolean existsByLogin(String name);
    boolean existsByEmail(String email);

    List<UserEntity> findAllByLoginOrEmail(String login, String email);

}
