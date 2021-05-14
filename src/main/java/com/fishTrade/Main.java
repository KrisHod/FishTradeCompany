package com.fishTrade;

import com.fishTrade.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ICustomerService customerService = context.getBean(ICustomerService.class);
        customerService.findById(1).ifPresent(System.out::println);
    }
}
