package com.miracle.customer.service;

import com.miracle.customer.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface CustomerService {
	
	public ResponseEntity<List<Customer>> getAllCustomers();
	public ResponseEntity<List<Customer>> getAllCustomerFilter(Customer customer, int page, int size, String sort);
	public ResponseEntity<Customer> createCustomer(Customer customer);
	public String deleteCustomer(Long customerId);
	public ResponseEntity<Customer> updateCustomer(Long CustomerId, Customer customer);
	public Customer getByCustomerId(Long customerId);
	ResponseEntity<List<?>> getAllCustomersConnection(Customer customer);
	public int totalCustomerCount();


}
