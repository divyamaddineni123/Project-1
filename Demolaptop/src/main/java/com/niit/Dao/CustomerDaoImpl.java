package com.niit.Dao;


import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Authorities;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.Users;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
private SessionFactory sessionFactory;
	Logger logger=Logger.getLogger(CustomerDaoImpl.class);
	public void saveCustomer (Customer customer) {
	Session session=sessionFactory.openSession();
	logger.debug("===========================================================================");
	//child tables - Users, billingAddress,ShippingAddresss
	customer.getUsers().setEnabled(true);
	
	//Assignment
	String username=customer.getUsers().getUsername();
	String role="ROLE_USER";
	
	Authorities authorities=new Authorities();
	//set the values
	authorities.setUsername(username);
	authorities.setRole(role);
	
	session.save(authorities);  //insert into authorites values (?,?,'Role_USER');
	
	Cart cart=new Cart();
	customer.setCart(cart);
	
	cart.setCustomer(customer);//update cart set customer_id=? , grandtotal=? where cart_id=?
	
	
	session.save(customer);
	
	logger.debug("==========================================================================");
session.flush();
session.close();

	}
	public Customer getCustomerByUsername(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Users where username=?");
		query.setString(0, username);
		Users users=(Users)query.uniqueResult();
		//com.niit.model.Users 
		Customer customer=users.getCustomer();
		session.close();
		return customer;
		
	}
}
