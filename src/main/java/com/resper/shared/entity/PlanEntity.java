package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "plans")
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String featuresBulletPoints;

    @Column
    private double price;
}
