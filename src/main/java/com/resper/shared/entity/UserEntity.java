package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String hashedPassword;

    @Column(nullable = false)
    private boolean isPerson;

    @ManyToOne
    @JoinColumn(name = "userRoleId", nullable = false)
    private UserRoleEntity userRole;

    @Column(nullable = false)
    private boolean isVerified;

    @Column(nullable = false)
    private int otpRequestCount;

    @Column(nullable = false)
    private boolean isAccountLocked;
}
