package com.order.service.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author sumitkumar04
 *
 */
public class UserOrdersListTo  implements Serializable {

    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657935739685454L;

	private List<UserOrdersTo> orders;

	public List<UserOrdersTo> getOrders() {
		return orders;
	}

	public void setOrders(List<UserOrdersTo> orders) {
		this.orders = orders;
	}
	
}
