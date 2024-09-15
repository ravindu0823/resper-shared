package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @ManyToOne
    @JoinColumn(name = "chainRestaurantId")
    private ChainRestaurantEntity chainRestaurantId;

    @ManyToOne
    @JoinColumn(name = "menuId")
    private MenuEntity menuId;

    @Column
    private String Name;

    @Column
    private String imageFileName;

    @Column
    private boolean isActive;

    @Column
    private int status;
}
