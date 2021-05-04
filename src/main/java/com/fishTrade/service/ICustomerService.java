package com.fishTrade.service;

import com.fishTrade.entity.Customer;

import java.util.Optional;

public interface ICustomerService {
    Optional<Customer> findById(long id);

    void save(Customer cus);
}
