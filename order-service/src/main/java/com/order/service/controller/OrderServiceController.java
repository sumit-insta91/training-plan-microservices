package com.order.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.order.service.dto.UserOrdersListTo;
import com.order.service.services.OrderService;

/**
 * 
 * @author sumitkumar04
 *
 */
@RestController
public class OrderServiceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceController.class);
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * method to get orders by userId
	 * @param userId
	 * @return ResponseEntity<UserOrdersListTo>
	 */
	@GetMapping("/orders/{userId}")
	public ResponseEntity<UserOrdersListTo> getOrdersByUserId(@PathVariable("userId") Long userId){
		LOGGER.info("getOrdersByUserId() start");
		return new ResponseEntity<>(orderService.getOrdersByUserId(userId),HttpStatus.OK);
	}
}
