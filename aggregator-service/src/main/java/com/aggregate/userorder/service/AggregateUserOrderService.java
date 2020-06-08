package com.aggregate.userorder.service;

import org.springframework.stereotype.Service;

import com.aggregate.userorder.dto.AggregateUserOrdersTo;

/**
 * 
 * @author sumitkumar04
 *
 */
@Service
public interface AggregateUserOrderService {
	
	public AggregateUserOrdersTo getuserAndOrderdata(Long userId);

}
