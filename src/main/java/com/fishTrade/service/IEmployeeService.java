package com.fishTrade.service;

import com.fishTrade.entity.Employee;
import com.fishTrade.entity.Position;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    List<Employee> findAll();

    Employee findByPosition(Position position);

    Employee findById(int id);

    Employee updateEmployee(int id, Employee employee);

    Map<String, Boolean> deleteEmployee(int id);

    void save(Employee employee);
}
