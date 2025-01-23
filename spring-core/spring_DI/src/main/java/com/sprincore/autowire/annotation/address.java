package com.sprincore.autowire.annotation;

public class address {

	private String street;
	private String city;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "address [street=" + street + ", city=" + city + "]";
	}
	
	//hum log yaha constructor nhi banyege kyuki ham yaha property injection use karenge
	
}
