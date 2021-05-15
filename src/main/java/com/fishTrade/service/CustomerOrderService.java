package com.fishTrade.service;

import com.fishTrade.entity.CustomerOrder;
import com.fishTrade.repository.ICustomerOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerOrderService implements ICustomerOrderService{
    @Autowired
    private ICustomerOrderRepository customerOrderRepository;

    @Override
    public Optional<CustomerOrder> findById (long id){
        return customerOrderRepository.findById(id);
    }

    @Transactional
    @Override
    public void save (CustomerOrder order){
        customerOrderRepository.save(order);
    }
}
