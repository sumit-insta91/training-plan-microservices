package com.user.service.dto;

import java.io.Serializable;

/**
 * 
 * @author sumitkumar04
 *
 */
public class UserDataTo implements Serializable {

    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = 4680657923739685454L;
    private String name;
    private Integer age;
    private String email;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
   
}
