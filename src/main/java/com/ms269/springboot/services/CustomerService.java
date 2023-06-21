package com.ms269.springboot.services;

import com.ms269.springboot.models.Customer;
import com.ms269.springboot.controllers.CustomerRequest;
import com.ms269.springboot.repositories.CustomerRepository;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(CustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
    }

    public List<Customer> readAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

}
