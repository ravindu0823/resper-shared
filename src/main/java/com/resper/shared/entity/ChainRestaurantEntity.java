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
@Table(name = "chain_restaurants")
public class ChainRestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chainRestaurantId;

    @Column()
    private boolean isPrimaryRestaurant;

    @Column()
    private String chainRestaurantName;

    @Column()
    private String postalCode;

    @Column()
    private String addressLine1;

    @Column()
    private String addressLine2;

    @Column()
    private String addressLine3;

    @Column()
    private String registeredAuthority;

    @Column()
    private String typeOfBusiness;

    @Column()
    private LocalDateTime dateOfPermitted;

    @Column()
    private LocalDateTime validUntil;

    @Column()
    private String certificateNo;

    @Column()
    private boolean isDetailsVerified;

    @ManyToOne
    @JoinColumn(name = "restaurantId")
    private RestaurantEntity restaurantEntity;
}
