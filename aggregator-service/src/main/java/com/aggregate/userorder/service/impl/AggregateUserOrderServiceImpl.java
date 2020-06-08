package com.aggregate.userorder.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aggregate.userorder.dto.AggregateUserOrdersTo;
import com.aggregate.userorder.dto.UserDataTo;
import com.aggregate.userorder.dto.UserOrdersListTo;
import com.aggregate.userorder.service.AggregateUserOrderService;

/**
 * 
 * @author sumitkumar04
 *
 */
@Service
public class AggregateUserOrderServiceImpl implements AggregateUserOrderService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregateUserOrderServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * method to get user and order details 
	 * @param userId
	 * @return AggregateUserOrdersTo
	 */
	@Override
	public AggregateUserOrdersTo getuserAndOrderdata(Long userId) {
		LOGGER.info("getuserAndOrderdata() start"); 
		AggregateUserOrdersTo aggregateDataTo = new AggregateUserOrdersTo();
		ResponseEntity<UserDataTo> userDataTo = restTemplate.exchange("http://localhost:8081/user/"+userId, HttpMethod.GET, null, UserDataTo.class);
		LOGGER.info("received data of user"); 
		aggregateDataTo.setUserDetails(userDataTo.getBody());
		ResponseEntity<UserOrdersListTo> userOrdersListTo = restTemplate.exchange("http://localhost:8082/orders/"+userId, HttpMethod.GET, null, UserOrdersListTo.class);
		LOGGER.info("received orders of user"); 
		aggregateDataTo.setOrders(userOrdersListTo.getBody().getOrders());
		LOGGER.info("getuserAndOrderdata() end"); 
		return aggregateDataTo;
	}

}
