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
@Table(name = "foods")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private boolean isActive;

    @Column
    private String imageFileName;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime lastUpdatedAt;

    @Column
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "menuId")
    private MenuEntity menuId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity categoryId;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private UserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "lastUpdatedBy")
    private UserEntity lastUpdatedBy;

    @ManyToOne
    @JoinColumn(name = "deletedBy")
    private UserEntity deletedBy;
}
