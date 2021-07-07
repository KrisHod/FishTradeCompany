package com.fishTrade.entity.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private int id;
    private String name;
    private java.sql.Date doB;

    public CustomerDTO() {
    }

    public CustomerDTO(String name) {
        this.name = name;
    }
}
