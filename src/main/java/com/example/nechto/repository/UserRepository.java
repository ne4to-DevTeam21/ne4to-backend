package com.example.nechto.repository;

import com.example.nechto.model.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {

    Optional<UserDAO> findByLogin(String login);
    Optional<UserDAO> findByName(String name);
    Optional<UserDAO> findByEmail(String email);
    boolean existsByLogin(String name);
    boolean existsByEmail(String email);

    List<UserDAO> findAllByLoginOrByEmail(String login, String email);
    List<UserDAO> findAllByLoginAndByEmail(String login, String email);

    @Query("SELECT e FROM UserDAO e WHERE e.name LIKE %:name%")
    List<UserDAO> findAllByNameContaining(@Param("name") String name);

}
