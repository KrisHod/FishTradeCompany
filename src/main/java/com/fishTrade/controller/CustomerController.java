package com.fishTrade.controller;

import com.fishTrade.entity.Customer;
import com.fishTrade.entity.dto.CustomerDTO;
import com.fishTrade.exception.ResourceNotFoundException;
import com.fishTrade.service.ICustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/customers")
@Slf4j
@AllArgsConstructor
public class CustomerController {
    private final ICustomerService customerService;
    private final ModelMapper modelMapper;

    @GetMapping("/")
    public ResponseEntity<List<CustomerDTO>> getAll() {
        try {
            List<CustomerDTO> customerDTOs = customerService.findAll()
                    .stream()
                    .map(x -> modelMapper.map(x, CustomerDTO.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(customerDTOs, HttpStatus.OK);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable int id) {
        try {
            Customer customer = customerService.findById(id);
            CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
            return new ResponseEntity<>(customerDTO, HttpStatus.OK);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Customer> addNewCustomer(@RequestBody Customer customer) {
        try {
            customerService.save(customer);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
