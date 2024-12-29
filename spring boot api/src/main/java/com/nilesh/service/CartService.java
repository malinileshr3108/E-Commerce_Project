package com.nilesh.service;

import com.nilesh.exception.ProductException;
import com.nilesh.modal.Cart;
import com.nilesh.modal.CartItem;
import com.nilesh.modal.User;
import com.nilesh.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
