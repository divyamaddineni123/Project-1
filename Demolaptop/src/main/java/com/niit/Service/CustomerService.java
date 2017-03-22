package com.niit.Service;

import com.niit.model.Customer;

public interface CustomerService {
	void saveCustomer(Customer customer);
	public Customer getCustomerByUsername(String username);
	}

