package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerService customerservice;
	
	
	@PostMapping(value="/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerservice.addCustomer(customer);
	}
	@GetMapping(value="/customer")
	public List<Customer> getAllCustomer()
	{
		return customerservice.getAllCustomer();
	}
	
	

}
