package com.fishTrade.service;

import com.fishTrade.entity.CustomerOrder;

import java.util.Optional;

public interface ICustomerOrderService {
    Optional<CustomerOrder> findById(long id);

    void save(CustomerOrder order);
}
