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
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(nullable = false)
    private String orderTypeId;

    @Column(nullable = false)
    private String customerName;

    @Column
    private int cashierId;

    @Column(nullable = false, name = "foods")
    private String foods;

    @Column(name = "tables")
    private String tables;

    @Column
    private String noOfPeople;

    @Column
    private double billTotal;

    @Column
    private double serviceCharge;

    @Column
    private double discount;

    @Column
    private double total;

    @Column
    private String paymentType;

    @Column
    private double receivedAmount;

    @Column
    private double balance;

    @Column
    private boolean status = false;

    @Column
    private String remark;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private EmployeeEntity createdBy;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "updatedBy")
    private EmployeeEntity updatedBy;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime canceledAt;

    @ManyToOne
    @JoinColumn(name = "canceledBy")
    private EmployeeEntity canceledBy;


    @PrePersist
    protected void onCreate() {
        // Set updatedAt when the entity is first created
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        // Update updatedAt when the entity is updated
        updatedAt = LocalDateTime.now();
    }
}
