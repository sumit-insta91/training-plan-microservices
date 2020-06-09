package com.user.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.user.service.domain.UserData;
import com.user.service.repo.UserServiceRepo;

/**
 * 
 * @author sumitkumar04
 *
 */
@SpringBootApplication
public class UserServiceApplication  implements CommandLineRunner {
	
	private static final Logger lOGGER=LoggerFactory.getLogger(UserServiceApplication.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserServiceRepo userServiceRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		lOGGER.info("Creating table user_data start");
		jdbcTemplate.execute("DROP TABLE IF EXISTS user_data");
		jdbcTemplate.execute("CREATE TABLE user_data(id bigint(20) NOT NULL AUTO_INCREMENT,age int(11) DEFAULT NULL,"
				+ "email varchar(255) DEFAULT NULL,name varchar(255) DEFAULT NULL," + 
				"  PRIMARY KEY (id)" + 
				")");
		lOGGER.info("Creating table user_data end & set test record in table user_data");
		List<UserData> userList = getTestUsers();
		userList.forEach(user ->userServiceRepo.save(user));
		lOGGER.info("test user created in table user_data");
		
	}
	private List<UserData> getTestUsers() {
		return Arrays.asList(
				new UserData("John",23,"john.doe123455@google.com"),
				new UserData("Test123",29,"john.doe123455@test.com"));
	}
}
