package com.cgi.main.beans;

public class Address {
	private String street;
	private String city;
	private String state;
	
	public Address(String street,String city,String state) {
		System.out.println("address ..");
		this.street=street;
		this.city=city;
		this.state=state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}