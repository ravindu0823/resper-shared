package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "devices")
public class DeviceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deviceId;

    @OneToOne
    @JoinColumn(name = "associatedUser", nullable = true)
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "createdBy", nullable = true)
    private UserEntity createdBy;

    @OneToOne
    @JoinColumn(name = "lastUpdatedBy", nullable = true)
    private UserEntity lastUpdatedBy;

    @OneToOne
    @JoinColumn(name = "deletedBy", nullable = true)
    private UserEntity deletedBy;

    @Column()
    private int chainRestaurantId;

    @Column()
    private String description;

    @Column()
    private String devicePlatform;

    @Column()
    private LocalDateTime createdAt;

    @Column()
    private LocalDateTime deletedAt;

    @Column()
    private LocalDateTime lastUpdatedAt;
}
