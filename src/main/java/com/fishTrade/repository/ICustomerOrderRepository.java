package com.fishTrade.repository;

import com.fishTrade.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {
}
