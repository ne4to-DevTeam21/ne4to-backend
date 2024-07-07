package com.example.nechto.repository;

import com.example.nechto.model.UserPlatformEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserPlatformRepository extends JpaRepository<UserPlatformEntity, Long> {

    List<UserPlatformEntity> findAllByUserId(String userId);
    List<UserPlatformEntity> findAllByPlatformId(Long platformId);

}
