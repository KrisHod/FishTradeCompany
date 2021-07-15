package com.fishTrade.service;

import com.fishTrade.entity.Employee;
import com.fishTrade.entity.Position;
import com.fishTrade.exception.ResourceNotFoundException;
import com.fishTrade.repository.IEmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class EmployeeService implements IEmployeeService {
    private final IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findByPosition(Position position) {
        return employeeRepository.findByPosition(position);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer with id " + id + " was not found"));
    }

    @Override
    public Employee updateEmployee(int id, Employee employeeDetails) {
        Employee employee = findById(id);
        employee.setName(employeeDetails.getName());
        employee.setPosition(employeeDetails.getPosition());
        save(employee);
        return employee;
    }

    @Override
    public Map<String, Boolean> deleteEmployee(int id) {
        Map<String, Boolean> response = new HashMap<>();
        Employee employee = findById(id);
        employeeRepository.delete(employee);
        response.put("Employee", Boolean.TRUE);
        return response;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
