package com.resper.shared.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "order_types")
public class OrderTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderTypeId;

    @Column(nullable = false)
    private String name;

    private String remark;

}
