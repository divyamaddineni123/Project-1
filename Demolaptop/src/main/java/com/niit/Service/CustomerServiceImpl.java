package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Dao.CustomerDao;
import com.niit.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
private CustomerDao customerDao;
	public void saveCustomer(Customer customer) {
	customerDao.saveCustomer(customer);
	}
	public Customer getCustomerByUsername(String username){
		return customerDao.getCustomerByUsername(username);
}
}
