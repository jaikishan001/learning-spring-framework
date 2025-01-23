package com.springcore.Blifecycle;


//bean lifecycle using xml
public class samosa {

	private double price;

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}
	
	public samosa() {
		super();
	
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
	
	//is method ko init() me dalenge
	public void hey() {
		System.out.println("inside init method");
	}

	//is method ko destroy() me dalenge using xml
	public void bye() {
		System.out.println("inside destroy method");
	}
}
