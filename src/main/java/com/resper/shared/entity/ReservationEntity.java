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
@Table(name = "reservations")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationId;

    @ManyToOne
    @JoinColumn(name = "restaurantId")
    private ChainRestaurantEntity chainRestaurantEntity;

    @Column
    private String title;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String mobileTelephone;

    @Column
    private String emergencyTelephone;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime lastUpdatedAt;

    @Column
    private LocalDateTime deletedAt;

    @OneToOne
    @JoinColumn(name = "createdBy")
    private UserEntity createBy;

    @OneToOne
    @JoinColumn(name = "lastUpdatedBy")
    private UserEntity lastUpdatedBy;

    @OneToOne
    @JoinColumn(name = "deletedBy")
    private UserEntity deletedBy;

    @Column
    private String noOfPerson;

    @Column
    private String tableNumbers;

    @Column
    private String remarks;
}
