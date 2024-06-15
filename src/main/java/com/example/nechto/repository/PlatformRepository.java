package com.example.nechto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nechto.model.PlatformEntity;
import java.util.List;
import java.util.Optional;

@Repository
public interface PlatformRepository extends JpaRepository<PlatformEntity, Long> {

    Optional<PlatformEntity> findByName(String name);
    boolean existsByName(String name);
    List<PlatformEntity> findAllByUserId(Long userId);

}
