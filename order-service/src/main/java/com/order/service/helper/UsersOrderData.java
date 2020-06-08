package com.order.service.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.order.service.dto.UserOrdersTo;

/**
 * 
 * @author sumitkumar04
 *
 */
public class UsersOrderData  implements Serializable {

    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657973739685454L;
	
	private UsersOrderData() {
		
	}
	
	static Map<Long,List<UserOrdersTo>> hm=new HashMap<>();
	
	public static List<UserOrdersTo> getByUserId(Long userId) {
		return hm.get(userId);
	}

	public static void setOrdersByUserId() {
	    UserOrdersTo uo1=new UserOrdersTo(1,250,"14-Apr-2020");
	    UserOrdersTo uo2=new UserOrdersTo(2,450,"15-Apr-2020");
	    List<UserOrdersTo> orders=new ArrayList<>();
	    orders.add(uo1);
	    orders.add(uo2);
	    hm.put(1L,orders);
	}

}
