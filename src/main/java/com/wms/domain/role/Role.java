package com.wms.domain.role;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false,unique = true)
    private RoleName name;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false,updatable = false)
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at",nullable = false)
    private LocalDateTime updatedAt;
}
