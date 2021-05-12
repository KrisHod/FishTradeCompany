package com.fishTrade.service;

import com.fishTrade.entity.Employee;

import java.util.Optional;

public interface IEmployeeService {
    Optional<Employee> findById(long id);

    void save(Employee employee);
}
