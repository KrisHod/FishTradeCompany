package com.fishTrade.entity.dto;

import com.fishTrade.entity.Position;
import lombok.Data;


@Data
public class EmployeeDTO {
    private int id;
    private String name;
    private Position position;

    public EmployeeDTO() {
    }
}
