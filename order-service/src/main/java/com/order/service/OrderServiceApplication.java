package com.order.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.order.service.helper.UsersOrderData;

/**
 * 
 * @author sumitkumar04
 *
 */
@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UsersOrderData.setOrdersByUserId();
	}

}
