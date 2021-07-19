package com.fishTrade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data //@ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private java.sql.Date doB;
    private String address;
    private String email;
    private String phoneNumber;
    private String login;
    private String password;

}
