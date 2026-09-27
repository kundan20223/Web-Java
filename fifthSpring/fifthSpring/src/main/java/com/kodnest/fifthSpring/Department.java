package com.kodnest.fifthSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	@Value("${dept.id}")
	int did;
	@Value("${dept.name}")
	String dname;
	
	public Department() {
		
	}

	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
	

}
