package com.springcore.autowire;

public class emp {

//	emp depend on address class so we can use annotation here autowirung through xml
	private address add;

	public address getAdd() {
		return add;
	}

	public void setAdd(address add) {
		this.add = add;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

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
