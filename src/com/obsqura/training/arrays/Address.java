package com.obsqura.training.arrays;

public class Address {
	String houseName;
	String district;
	String city;
	String state;
	String country;
	int pin;
	Address(String houseName,String district,String city,String state, String country,int pin){
		this.houseName = houseName;
		this.district = district;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
}
