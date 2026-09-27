package com.kodnest.fourthSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	
	int did;
	String dname;
	
	public Department() {
		
	}
	
	@Autowired
	public Department(@Value("${dept.did}") int did,
			@Value("${dept.dname}") String dname) {
		this.did = did;
		this.dname = dname;
		
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
	
}