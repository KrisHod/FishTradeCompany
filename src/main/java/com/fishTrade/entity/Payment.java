package com.fishTrade.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double sum;
    private java.sql.Timestamp dateTime;

    private Order order;
    private Employee employee;

    public Payment(int id, double sum, Timestamp dateTime, Order order, Employee employee) {
        this.id = id;
        this.sum = sum;
        this.dateTime = dateTime;
        this.order = order;
        this.employee = employee;
    }
}
