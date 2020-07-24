package com.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.controller.entity.Customer;
import com.ing.controller.repository.CustomerRepository;

@RestController
public class CustomerRestController {
	
	@Autowired
	CustomerRepository customReposoitory;
	
	@GetMapping("/customers/")
	public List<Customer> getCustomers(){
		System.out.println("inside getCustomers method! ");
		return customReposoitory.findAll();
	}

}
