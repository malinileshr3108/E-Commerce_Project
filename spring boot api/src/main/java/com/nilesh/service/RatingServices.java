package com.nilesh.service;

import java.util.List;

import com.nilesh.exception.ProductException;
import com.nilesh.modal.Rating;
import com.nilesh.modal.User;
import com.nilesh.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
