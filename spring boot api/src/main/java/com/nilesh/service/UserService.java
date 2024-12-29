package com.nilesh.service;

import java.util.List;

import com.nilesh.exception.UserException;
import com.nilesh.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
