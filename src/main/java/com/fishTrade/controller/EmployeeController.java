package com.fishTrade.controller;

import com.fishTrade.entity.Employee;
import com.fishTrade.entity.dto.EmployeeDTO;
import com.fishTrade.exception.ResourceNotFoundException;
import com.fishTrade.service.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/employees")
@Slf4j
@AllArgsConstructor
public class EmployeeController {
    private final IEmployeeService employeeService;
    private final ModelMapper modelMapper;

    @PostMapping("/")
    public ResponseEntity<Employee> addNewEmployee(@RequestBody EmployeeDTO employeeDto) {
        try {
            Employee employee = modelMapper.map(employeeDto, Employee.class);
            employeeService.save(employee);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
