package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "restaurants")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantId;

    @OneToOne
    @JoinColumn(name = "ownerId")
    private OwnerEntity ownerEntity;

    @Column()
    private String restaurantName;

    @Column()
    private String noOfRestaurantsInChain;
}
