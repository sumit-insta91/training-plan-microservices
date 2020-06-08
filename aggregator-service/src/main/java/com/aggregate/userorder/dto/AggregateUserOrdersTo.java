package com.aggregate.userorder.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author sumitkumar04
 *
 */
public class AggregateUserOrdersTo implements Serializable {

    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657935839685454L;

    private UserDataTo userDetails;
	private List<UserOrdersTo> orders;

	public List<UserOrdersTo> getOrders() {
		return orders;
	}

	public void setOrders(List<UserOrdersTo> orders) {
		this.orders = orders;
	}

	public UserDataTo getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDataTo userDetails) {
		this.userDetails = userDetails;
	}
}
