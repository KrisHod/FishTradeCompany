package com.fishTrade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class FishParcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double weight;
    private double price;
    private double deliveryPrice;
    private boolean isRegistered;
    private boolean isWrittenOff;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name ="fishId")
    private Fish fish;

}




