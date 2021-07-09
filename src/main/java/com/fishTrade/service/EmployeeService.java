package com.fishTrade.service;

import com.fishTrade.entity.Employee;
import com.fishTrade.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> findById (long id){
        return employeeRepository.findById(id);
    }

    @Transactional
    @Override
    public void save (Employee employee){
        employeeRepository.save(employee);
    }
}
