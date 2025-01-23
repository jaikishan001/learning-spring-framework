package com.springcore.ci;

import java.util.List;

public class person {

	private String personeName;
	private int personId;
	private certi cert;
	private List<String> sub; 
	
	
	
	//constructor injection example
	public person(String personeName, int personId, certi cert,List<String> sub) {
		super();
		this.personeName = personeName;
		this.personId = personId;
		this.cert = cert;
		this.sub=sub;
	}


	@Override
	public String toString() {
		return "person [personeName=" + personeName + ", personId=" + personId + ", cert=" + cert + "]" +", sub=" + sub + "]";
	}
	
	
	
	
}
