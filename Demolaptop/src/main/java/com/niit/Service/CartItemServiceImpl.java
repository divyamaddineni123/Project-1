package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Dao.CartItemDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;
@Service
public class CartItemServiceImpl implements CartItemService {
	@Autowired
private CartItemDao cartItemDao;
	public void addCartItem(CartItem cartItem) {
	  cartItemDao.addCartItem(cartItem);
		
	}
	public CartItem getCartItem(int cartItemId) {
		// TODO Auto-generated method stub
		return cartItemDao.getCartItem(cartItemId);
	}
	public void removeCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDao.removeCartItem(cartItem);
	}
	public void removeAllCartItems(Cart cart) {
		// TODO Auto-generated method stub
		cartItemDao.removeAllCartItems(cart);
	}

}