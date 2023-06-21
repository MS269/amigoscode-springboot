package com.ms269.springboot;

import com.ms269.springboot.repositories.CustomerRepository;
import com.ms269.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final CustomerRepository customerRepository;

    @Autowired
    public Config(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerService(customerRepository);
    }

}
