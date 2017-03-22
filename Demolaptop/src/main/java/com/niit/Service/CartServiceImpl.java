package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Dao.CartDao;
import com.niit.model.Cart;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
private CartDao cartDao;
	public Cart getCart(int cartId) {
		return cartDao.getCart(cartId);
	}

}