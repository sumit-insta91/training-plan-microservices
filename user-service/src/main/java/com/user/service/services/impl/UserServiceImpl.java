package com.user.service.services.impl;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.domain.UserData;
import com.user.service.dto.UserDataTo;
import com.user.service.repo.UserServiceRepo;
import com.user.service.services.UserService;

/**
 * 
 * @author sumitkumar04
 *
 */
@Service
public class UserServiceImpl implements UserService{

	private static final Logger LOGGER=LoggerFactory.getLogger(UserServiceRepo.class);

	@Autowired
	private UserServiceRepo userDataRepo;

	/**
	 * method to get user data by userId
	 * @param id
	 * @return UserDataTo
	 */
	public UserDataTo getUserData(Long id) {
		LOGGER.info("getUserService start");
		Optional<UserData> userData= userDataRepo.findById(id);
		UserDataTo ud=new UserDataTo();
		if(userData.isPresent()) {
			ud.setAge(userData.get().getAge());
			ud.setEmail(userData.get().getEmail());
			ud.setName(userData.get().getName());
			return ud;
		}
		return ud;
	}

}
