package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "app_configurations")
public class AppConfigurationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appConfigId;

    @Column(nullable = false)
    private String configUniqueName;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String configValue;

    @Column(nullable = false)
    private boolean isActive;
}
