package com.third.thirdSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id = 1;
	String name = "Omkar";
	//Department dept;
	Departments dept;
	
	/*void work() {
		dept.work();
	} */
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	@Autowired
	public Employee(Departments dept) {
		super();
		this.dept = dept;
	}

	
	

}
