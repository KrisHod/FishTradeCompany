package com.fishTrade.service;

import com.fishTrade.entity.Customer;
import com.fishTrade.exception.ResourceNotFoundException;
import com.fishTrade.repository.ICustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer doesn't exist with id: " + id));
    }

    @Override
    public void save(Customer cus) {
        customerRepository.save(cus);
    }

    @Override
    public Customer update(int id, Customer customerDetails) {
        Customer customer = findById(id);
        customer.setName(customerDetails.getName());
        customer.setDoB(customerDetails.getDoB());
        customer.setAddress(customer.getAddress());
        customer.setEmail(customerDetails.getEmail());
        customer.setPhoneNumber(customer.getPhoneNumber());
        return customer;
    }

    @Override
    public String delete(int id) {
        Customer customer = findById(id);
        customerRepository.delete(customer);
        return "Customer with id: " + id + " was deleted.";
    }
}
