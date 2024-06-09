package com.example.nechto.model;

import com.example.nechto.dto.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@EntityListeners(AuditingEntityListener.class)
@Table(name = "platforms")
public class PlatformEntity implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "platform_id_seq")
    @SequenceGenerator(name = "platform_id_seq", sequenceName = "platform_id_seq", allocationSize = 1)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Column(nullable = false)
    @NotBlank
    @ToString.Include
    private String name;

    @Column(name = "super_user", nullable = false)
    @NotBlank
    @ToString.Include
    private Long user_id;

    @CreatedDate
    private LocalDate registration_date;

    @LastModifiedDate
    private LocalDate updatedAt;

}