package com.aggregate.userorder.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aggregate.userorder.dto.AggregateUserOrdersTo;
import com.aggregate.userorder.service.AggregateUserOrderService;

/**
 * 
 * @author sumitkumar04
 *
 */
@RestController
public class AggregateUserOrderController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregateUserOrderController.class);
	
	@Autowired
	private AggregateUserOrderService aggregateUserOrderService;
	
	/**
	 * get order and user details by userId
	 * @param userId
	 * @return ResponseEntity<AggregateUserOrdersTo>
	 */
	@GetMapping("/orderdetails/{userId}")
	public ResponseEntity<AggregateUserOrdersTo> getOrderAndUserDetailsByUserId(@PathVariable("userId") Long userId) {
		LOGGER.info("getOrderAndUserDetailsByUserId() start"); 
		return new ResponseEntity<>(aggregateUserOrderService.getuserAndOrderdata(userId), HttpStatus.OK);
	}
}
