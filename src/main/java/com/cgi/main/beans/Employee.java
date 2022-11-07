package com.cgi.main.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int id;
	private String name;
	private double salary;
	@Autowired
	@Qualifier(value="address2")
	private Address address;//Has-A relationship 

	private List<Address> addresses;
	
	
	public Employee() {
		System.out.println("EMP object is created");
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", addresses="
				+ addresses + "]";
	}

	 
	
}
