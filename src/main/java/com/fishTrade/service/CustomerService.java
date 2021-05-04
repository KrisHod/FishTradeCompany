package com.fishTrade.service;

import com.fishTrade.entity.Customer;
import com.fishTrade.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById (long id){
        return customerRepository.findById(id);
    }

    @Transactional
    @Override
    public void save (Customer cus){
        customerRepository.save(cus);
    }
}
