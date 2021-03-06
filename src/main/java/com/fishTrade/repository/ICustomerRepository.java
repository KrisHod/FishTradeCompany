package com.fishTrade.repository;

import com.fishTrade.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
