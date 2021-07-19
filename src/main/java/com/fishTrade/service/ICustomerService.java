package com.fishTrade.service;

import com.fishTrade.entity.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer cus);

    Customer update(int id, Customer customerDetails);

    public String delete(int id);
}
