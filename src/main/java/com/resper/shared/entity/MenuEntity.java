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
@Table(name = "menus")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;

    @ManyToOne
    @JoinColumn(name = "chainRestaurantId")
    private ChainRestaurantEntity chainRestaurantId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private boolean isActive;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private UserEntity createdBy;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "updatedBy")
    private UserEntity updatedBy;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "deletedBy")
    private UserEntity deletedBy;

    @Column
    private int status;

    @PrePersist
    protected void onCreate() {
        // Set updatedAt when the entity is first created
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        // Update updatedAt when the entity is updated
        updatedAt = LocalDateTime.now();
    }

}
