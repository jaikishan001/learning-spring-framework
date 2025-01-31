package com.spring.p.jdbc.entities;

public class teacher {
	
	private int teacherId;
	private String Tname;
	private String Tcity;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTcity() {
		return Tcity;
	}
	public void setTcity(String tcity) {
		Tcity = tcity;
	}
	public teacher(int teacherId, String tname, String tcity) {
		super();
		this.teacherId = teacherId;
		Tname = tname;
		Tcity = tcity;
	}
	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "teacher [teacherId=" + teacherId + ", Tname=" + Tname + ", Tcity=" + Tcity + "]";
	}
	
	

}
