package com.springcore.ci;

public class addition {

	private int a;
	private int b;
	
	public addition(int a, int b) {  // and also by default top vale me value assign hoga
		this.a=a;
		this.b=b;
		System.out.println("consructor: int , int");
		System.out.println("value of a :"+ this.a+ ", value of b is: "+this.b);
	}
	
	public addition(double a, double b) {
		this.a=(int) a;  //typecast because a is int
		this.b=(int) b;
		System.out.println("consructor: double , double");
		System.out.println("value of a :"+ this.a+ ", value of b is: "+this.b);
	}
	
//	public addition(String a, String b) {  //ambiguity by default string me jayga xml ka 
//		this.a=Integer.parseInt(a);			//then we have to specify the type in xml that isi me value me jyga
//		this.b=Integer.parseInt(b);
//		System.out.println("consructor: String , String");
//	System.out.println("value of a :"+ this.a+ ", value of b is: "+this.b);
//	}
//	
	public void doSum() {
		System.out.println("sum is ="+(this.a+this.b));
	}
}
