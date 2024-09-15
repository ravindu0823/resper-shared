package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "otp_types")
public class OtpTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int otpTypeId;

    @Column(nullable = false)
    private String reason;

}
