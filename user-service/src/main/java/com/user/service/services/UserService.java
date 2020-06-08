package com.user.service.services;

import org.springframework.stereotype.Service;

import com.user.service.dto.UserDataTo;

/**
 * 
 * @author sumitkumar04
 *
 */
@Service
public interface UserService{

	public UserDataTo getUserData(Long id);
	
}
