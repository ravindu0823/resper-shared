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
@Table(name = "email_otps")
public class EmailOtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emailOtpId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity user;

    @Column(nullable = true)
    private String OtpCode;

    @Column(nullable = true)
    private String email;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime generatedAt;

    @Column(nullable = true)
    private boolean isUsed;

    @Column(nullable = true)
    private LocalDateTime usedAt;

    @Column(nullable = true)
    private boolean isExpired;

    @Column(nullable = true)
    private String platform;

    @ManyToOne
    @JoinColumn(name = "otpTypeId", nullable = false)
    private OtpTypeEntity otpType;

}
