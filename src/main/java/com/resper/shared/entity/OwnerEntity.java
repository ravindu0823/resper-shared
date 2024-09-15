package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "owners")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ownerId;

    @Column
    private int restaurantId;

    @Column
    private String ownershipType;

    @Column
    private boolean isShowOnboardScreens;

    @OneToOne()
    @JoinColumn(name = "planId")
    private PlanEntity planEntity;

    @Column
    private boolean isSubscriptionActive;
}
