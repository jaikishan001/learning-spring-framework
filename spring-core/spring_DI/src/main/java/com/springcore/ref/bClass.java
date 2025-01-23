package com.springcore.ref;

public class bClass {

	private int x;
	private aClass ob;  //bClass is dependent on aClass
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public aClass getOb() {
		return ob;
	}
	public void setOb(aClass ob) {
		this.ob = ob;
	}
	
	
	public bClass(int x, aClass ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	
	
	public bClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "bClass [x=" + x + ", ob=" + ob + "]";
	}
	
	

	
	
	
	
	
}
