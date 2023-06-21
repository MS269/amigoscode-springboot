package com.ms269.springboot.controllers;

import com.ms269.springboot.models.Customer;
import com.ms269.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getCustomer() {
        return customerService.readAllCustomers();
    }

    @PostMapping
    public void addCustomer(@RequestBody CustomerRequest request) {
        customerService.createCustomer(request);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerService.deleteCustomer(id);
    }

}
