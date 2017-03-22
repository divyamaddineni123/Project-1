package com.niit.Service;

import com.niit.model.Cart;
import com.niit.model.CartItem;

public interface CartItemService {
void addCartItem(CartItem cartItem);
CartItem getCartItem(int cartItemId);
void removeCartItem(CartItem cartItem);
void removeAllCartItems(Cart cart);
}