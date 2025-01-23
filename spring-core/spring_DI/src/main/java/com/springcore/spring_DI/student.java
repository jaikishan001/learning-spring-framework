package com.springcore.spring_DI;

public class student {
	private String studentName;
	private int studentID;
	private String studentAddress;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting name..");
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		System.out.println("setting ID..");
		this.studentID = studentID;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting address..");
		this.studentAddress = studentAddress;
	}
	
	
	public student(String studentName, int studentID, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentAddress = studentAddress;
	}
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [studentName=" + studentName + ", studentID=" + studentID + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	
}
