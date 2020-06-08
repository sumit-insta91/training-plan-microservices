package com.user.service.controller;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.dto.UserDataTo;
import com.user.service.services.UserService;

/**
 * 
 * @author sumitkumar04
 *
 */
@RestController
public class UserServiceController {

	private static final Logger LOGGER=LoggerFactory.getLogger(UserServiceController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * method to get user data by userId
	 * @param id
	 * @return ResponseEntity<UserDataTo>
	 */
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDataTo> getUserData(@PathVariable("id") Long id) {
		LOGGER.info("getUserData started");
		return new ResponseEntity<>(userService.getUserData(id),HttpStatus.OK);
	}
}
