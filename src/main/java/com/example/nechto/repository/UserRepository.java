package com.example.nechto.repository;

import com.example.nechto.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByLogin(String login);
    Optional<UserEntity> findByName(String name);
    Optional<UserEntity> findByEmail(String email);
    boolean existsByLogin(String name);
    boolean existsByEmail(String email);

    List<UserEntity> findAllByLoginOrEmail(String login, String email);
    List<UserEntity> findAllByLoginAndEmail(String login, String email);

    @Query("SELECT e FROM UserEntity e WHERE e.name LIKE %:name%")
    List<UserEntity> findAllByNameContaining(@Param("name") String name);

}
