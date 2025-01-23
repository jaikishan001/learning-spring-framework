package com.springcore.Blifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//bean lifecycle using annotation @PostConstruct ,@PreDestroy
public class annoEx {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public annoEx() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "annoEx [subject=" + subject + "]";
	}
	
	@PostConstruct  // to enable this annotation we need write<context:annotation-config/> in xml file
	public void lifeStart() {
		System.out.println("inside init() method using annotation");
	}
	
	@PreDestroy
	public void lifeEnd() {
		System.out.println("inside destroy() method using annotation");
	}
	
}
