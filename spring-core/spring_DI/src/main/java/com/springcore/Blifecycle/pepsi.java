package com.springcore.Blifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//bean lifecycle using interfaces
public class pepsi implements InitializingBean, DisposableBean {

	private double price;
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	//for init() method e.g property set hone ke bad ye chalega means init
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello inside init method: buying pepsi");
		
	}
	
	
	//for destroy method
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bye inside destroy method: throwing out pepsi bottle");
	}
	

}
