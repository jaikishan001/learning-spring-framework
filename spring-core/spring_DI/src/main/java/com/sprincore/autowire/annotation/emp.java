package com.sprincore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {

//using @Autowired annotation on type setter and constructor
	
	@Autowired
	@Qualifier ("add1") //kon si bean ko inject karna h uska naam xml mese
	private address add;

	public address getAdd() {
		return add;
	}
	//@Autowired
	public void setAdd(address add) {
		this.add = add;
		System.out.println("setting values");
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Autowired
	public emp(address add) {
		super();
		this.add = add;
		System.out.println("inside constructor auto wiring using xml");
	}

	@Override
	public String toString() {
		return "emp [add=" + add + "]";
	}
	
}
