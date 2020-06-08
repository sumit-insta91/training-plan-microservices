package com.order.service.dto;

import java.io.Serializable;

/**
 * 
 * @author sumitkumar04
 *
 */
public class UserOrdersTo  implements Serializable {

    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657925739685454L;
	
	public UserOrdersTo(Integer orderId, Integer amount, String orderData) {
		super();
		this.orderId = orderId;
		this.orderAmount = amount;
		this.orderData = orderData;
	}
	private Integer orderId;
	private Integer orderAmount;
	private String orderData;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getAmount() {
		return orderAmount;
	}
	public void setAmount(Integer amount) {
		this.orderAmount = amount;
	}
	public String getOrderData() {
		return orderData;
	}
	public void setOrderData(String orderData) {
		this.orderData = orderData;
	}
}
