package com.ing.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.controller.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
