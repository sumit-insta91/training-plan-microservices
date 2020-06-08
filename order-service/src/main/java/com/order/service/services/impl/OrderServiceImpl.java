package com.order.service.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.order.service.dto.UserOrdersListTo;
import com.order.service.helper.UsersOrderData;
import com.order.service.services.OrderService;
/**
 * 
 * @author sumitkumar04
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

	/**
	 * method to get orders by userId
	 * @param userId
	 * @return UserOrdersListTo
	 */
	@Override
	public UserOrdersListTo getOrdersByUserId(Long userId) {
		LOGGER.info("getOrdersByUserId() start");
		UserOrdersListTo userOrdersListTo=new UserOrdersListTo();
		userOrdersListTo.setOrders(UsersOrderData.getByUserId(userId));
		LOGGER.info("getOrdersByUserId() end");
		return userOrdersListTo;
	}

}
