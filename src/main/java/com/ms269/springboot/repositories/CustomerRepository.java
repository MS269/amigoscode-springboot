package com.ms269.springboot.repositories;

import com.ms269.springboot.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> { }
