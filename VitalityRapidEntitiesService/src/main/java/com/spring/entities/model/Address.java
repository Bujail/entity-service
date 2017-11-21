package com.spring.entities.model;

public class Address {
	
    private String location1;
    private String location2;
    private String state;
    private String city;
    private String pinCode;
    
    public Address(String location1, String location2, String state, String city, String pinCode) {
		super();
		this.location1 = location1;
		this.location2 = location2;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}
    
    
	public String getLocation1() {
		return location1;
	}
	public void setLocation1(String location1) {
		this.location1 = location1;
	}
	public String getLocation2() {
		return location2;
	}
	public void setLocation2(String location2) {
		this.location2 = location2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

   
}
