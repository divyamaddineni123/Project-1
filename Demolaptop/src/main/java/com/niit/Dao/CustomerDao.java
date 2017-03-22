package com.niit.Dao;

import com.niit.model.Customer;

public interface CustomerDao {
void saveCustomer(Customer customer);

Customer getCustomerByUsername(String username);
}
