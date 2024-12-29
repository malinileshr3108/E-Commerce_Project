package com.nilesh.service;

import java.util.List;

import com.nilesh.exception.ProductException;
import com.nilesh.modal.Review;
import com.nilesh.modal.User;
import com.nilesh.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
