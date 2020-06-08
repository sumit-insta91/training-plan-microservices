package com.user.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.domain.UserData;

/**
 * 
 * @author sumitkumar04
 *
 */
public interface UserServiceRepo extends JpaRepository<UserData, Long>{

}
