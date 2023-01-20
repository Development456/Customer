/*******
* Copyright (C) 2023 Claims Application-Miracle Software Systems Inc
* All Rights Reserved.
*******/
package com.miracle.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miracle.customer.model.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
	public Customer findByCustomerId(long customerId);
}
