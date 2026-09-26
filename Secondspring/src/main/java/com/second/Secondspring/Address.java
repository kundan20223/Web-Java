package com.second.Secondspring;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	int houseNo = 123;
	String street = "BTM";
	String state = "KARNATAKA";
	
	public Address() {
		
	}
	
	

	public Address(int houseNo, String street, String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.state = state;
	}



	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", state=" + state + "]";
	}
	
	
	

}
