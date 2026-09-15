package com.bean;

import java.time.LocalDateTime;

//bean -> 
//encapsulation 
/**
 * 
 */
public class UserBean {
	//read 
	private String name ;
	private String gender;
	private String city;
	private String contact;
	private LocalDateTime registerationDateTime; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public LocalDateTime getRegisterationDateTime() {
		return registerationDateTime;
	}
	public void setRegisterationDateTime(LocalDateTime registerationDateTime) {
		this.registerationDateTime = registerationDateTime;
	}
		

	
}
