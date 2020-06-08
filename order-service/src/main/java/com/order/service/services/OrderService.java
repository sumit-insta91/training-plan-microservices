package com.order.service.services;

import org.springframework.stereotype.Service;

import com.order.service.dto.UserOrdersListTo;

/**
 * 
 * @author sumitkumar04
 *
 */
@Service
public interface OrderService {
	
	public UserOrdersListTo getOrdersByUserId(Long userId);

}
