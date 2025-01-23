package com.springcore.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype") // bydefault singleton(provide reference of same object) bean scope leta h but
					// we cna define bean scope as prototype
					// prototyope scope se container jitne bar object call hoga hardam new object
					// banega

public class Student {

	// agar implicitily value bhi dalna h to @value annotaion use karenge
	@Value("kishan")
	private String studentName;
	@Value("mumbai")
	private String city;
	@Value("#{tempAdd}")
	private List<String> address;

//	@Value("#{88>36 ? 5:9}")
	@Value("#{T(java.lang.Math).sqrt(25)}") // creating methods
	private int roll;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + ", roll=" + roll
				+ "]";
	}

}
