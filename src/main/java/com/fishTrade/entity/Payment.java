package com.fishTrade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double sum;
    private java.sql.Timestamp dateTime;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private CustomerOrder customerOrder;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

}
